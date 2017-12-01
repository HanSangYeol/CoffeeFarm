package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.Adapter.CartAdapter;
import com.coffee_farm.www.coffeefarm.Data.Cart;

import java.util.List;

public class ShoppingBasketActivity extends BaseActivity {

    CartAdapter cartAdapter;
    List<Cart> cartList;


    private android.widget.ImageView backBtn;
    private android.widget.ListView cartListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_basket);
        this.cartListView = (ListView) findViewById(R.id.cartListView);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
        bindView();
        setupEvents();
        setValues();
    }

    @Override
    public void setValues() {

        cartAdapter = new CartAdapter(mContext, cartList);
        cartListView.setAdapter(cartAdapter);

    }

    @Override
    public void setupEvents() {

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public void bindView() {

    }
}
