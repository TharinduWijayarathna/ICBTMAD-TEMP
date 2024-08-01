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
import android.widget.TextView;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.adapters.FeaturedAdapter;
import com.icbt.foodorderapp.models.FoodItem;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private TextView welcomeTextView;
    private RecyclerView featuredRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        welcomeTextView = view.findViewById(R.id.welcome_text_view);
        featuredRecyclerView = view.findViewById(R.id.featured_recycler_view);

        // Set welcome message
        welcomeTextView.setText("Hey Tolemi, Ready to order?");

        // Set up featured items RecyclerView
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        featuredRecyclerView.setAdapter(new FeaturedAdapter(getFeaturedItems()));

        return view;
    }

    private List<FoodItem> getFeaturedItems() {
        List<FoodItem> featuredItems = new ArrayList<>();
        // Add featured items here
        featuredItems.add(new FoodItem("Dog Food 1", "url_to_image", 10.99));
        featuredItems.add(new FoodItem("Dog Food 2", "url_to_image", 20.99));
        // Add more items as needed
        return featuredItems;
    }
}
