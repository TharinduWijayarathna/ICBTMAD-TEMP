package com.icbt.foodorderapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.models.FoodItem;
import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {
    private List<FoodItem> featuredItems;

    public FeaturedAdapter(List<FoodItem> featuredItems) {
        this.featuredItems = featuredItems;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_featured, parent, false);
        return new FeaturedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FoodItem foodItem = featuredItems.get(position);
        // Bind data to the UI elements of the holder
    }

    @Override
    public int getItemCount() {
        return featuredItems.size();
    }

    public class FeaturedViewHolder extends RecyclerView.ViewHolder {
        // Define UI elements here

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize UI elements here
        }
    }
}
