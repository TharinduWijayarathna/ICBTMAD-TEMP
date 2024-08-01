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
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.icbt.foodorderapp.R;
import com.icbt.foodorderapp.adapters.CartAdapter;
import com.icbt.foodorderapp.models.Cart;
import com.icbt.foodorderapp.models.FoodItem;

public class CartFragment extends Fragment implements CartAdapter.OnCartChangeListener {
    private RecyclerView cartRecyclerView;
    private Button checkoutButton;
    private TextView totalAmountTextView;
    private Cart cart;
    private CartAdapter cartAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        cartRecyclerView = view.findViewById(R.id.cart_recycler_view);
        checkoutButton = view.findViewById(R.id.checkout_button);
        totalAmountTextView = view.findViewById(R.id.total_amount_text_view);

        // Set up cart RecyclerView
        cartRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cart = Cart.getInstance();
        cartAdapter = new CartAdapter(cart.getCartItems(), this);
        cartRecyclerView.setAdapter(cartAdapter);

        updateTotalAmount();

        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cart.clearCart();
                Toast.makeText(getActivity(), "Items purchased successfully!", Toast.LENGTH_SHORT).show();
                cartAdapter.notifyDataSetChanged();
                updateTotalAmount();
            }
        });

        return view;
    }

    @Override
    public void onCartChanged() {
        updateTotalAmount();
    }

    private void updateTotalAmount() {
        double totalAmount = 0.0;
        for (FoodItem item : cart.getCartItems()) {
            totalAmount += item.getPrice();
        }
        totalAmountTextView.setText(String.format("Total: $%.2f", totalAmount));
    }
}
