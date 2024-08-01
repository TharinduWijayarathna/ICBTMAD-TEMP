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
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.models.Cart;
import com.icbt.foodorderapp.models.FoodItem;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private List<FoodItem> cartItems;
    private OnCartChangeListener onCartChangeListener;

    public CartAdapter(List<FoodItem> cartItems, OnCartChangeListener onCartChangeListener) {
        this.cartItems = cartItems;
        this.onCartChangeListener = onCartChangeListener;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        FoodItem foodItem = cartItems.get(position);

        holder.foodNameTextView.setText(foodItem.getName());
        holder.foodPriceTextView.setText(String.format("$%.2f", foodItem.getPrice()));

        Glide.with(holder.itemView.getContext())
                .load(foodItem.getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.foodImageView);

        holder.removeFromCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart.getInstance().getCartItems().remove(foodItem);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, getItemCount());
                onCartChangeListener.onCartChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImageView;
        TextView foodNameTextView;
        TextView foodPriceTextView;
        Button removeFromCartButton;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImageView = itemView.findViewById(R.id.food_image);
            foodNameTextView = itemView.findViewById(R.id.food_name);
            foodPriceTextView = itemView.findViewById(R.id.food_price);
            removeFromCartButton = itemView.findViewById(R.id.remove_from_cart_button);
        }
    }

    public interface OnCartChangeListener {
        void onCartChanged();
    }
}
