package com.icbt.foodorderapp.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.adapters.ItemsAdapter;
import com.icbt.foodorderapp.models.FoodItem;
import java.util.ArrayList;
import java.util.List;

public class ItemsFragment extends Fragment {
    private RecyclerView itemsRecyclerView;
    private List<FoodItem> foodItems;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        itemsRecyclerView = view.findViewById(R.id.items_recycler_view);

        // Set up items RecyclerView
        itemsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        foodItems = getFoodItems();
        itemsRecyclerView.setAdapter(new ItemsAdapter(foodItems));

        return view;
    }

    private List<FoodItem> getFoodItems() {
        List<FoodItem> items = new ArrayList<>();
        // Add all food items here
        items.add(new FoodItem("Dog Food 1", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 10.99));
        items.add(new FoodItem("Dog Food 2", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 12.49));
        items.add(new FoodItem("Dog Food 3", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 15.99));
        items.add(new FoodItem("Dog Food 4", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 8.99));
        items.add(new FoodItem("Dog Food 5", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 13.99));
        items.add(new FoodItem("Dog Food 6", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 11.49));
        items.add(new FoodItem("Dog Food 7", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 14.99));
        items.add(new FoodItem("Dog Food 8", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 9.99));
        items.add(new FoodItem("Dog Food 9", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 16.99));
        items.add(new FoodItem("Dog Food 10", "https://pyxis.nymag.com/v1/imgs/744/a72/c1914cf9498c69be8c2881206fdb09bc48-medium-bag.rdeep-vertical.w245.jpg", 10.49));
        // Add more items as needed
        return items;
    }
}
