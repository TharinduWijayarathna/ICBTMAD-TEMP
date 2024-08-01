package com.icbt.foodorderapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.models.Cart;
import com.icbt.foodorderapp.models.FoodItem;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {
    private List<FoodItem> foodItems;

    public ItemsAdapter(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        FoodItem foodItem = foodItems.get(position);

        // Bind data to the UI elements of the holder
        holder.foodNameTextView.setText(foodItem.getName());
        holder.foodPriceTextView.setText(String.format("$%.2f", foodItem.getPrice()));

        // Load image using Glide
        Glide.with(holder.itemView.getContext())
                .load(foodItem.getImageUrl())
                .into(holder.foodImageView);

        holder.addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart.getInstance().addItem(foodItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodItems.size();
    }

    public static class ItemsViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImageView;
        TextView foodNameTextView;
        TextView foodPriceTextView;
        Button addToCartButton;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize UI elements here
            foodImageView = itemView.findViewById(R.id.food_image);
            foodNameTextView = itemView.findViewById(R.id.food_name);
            foodPriceTextView = itemView.findViewById(R.id.food_price);
            addToCartButton = itemView.findViewById(R.id.add_to_cart_button);
        }
    }
}
