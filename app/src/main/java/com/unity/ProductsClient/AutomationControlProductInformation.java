package com.unity.ProductsClient;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.unity.Documents;
import com.unity.R;

import java.util.ArrayList;
import java.util.List;

public class AutomationControlProductInformation extends AppCompatActivity implements AutomationControlProductInformationCallBack{
    Toolbar toolbar;
    RecyclerView recyclerView;
    AutomationControlProductInformationAdapter adapter;
    List<AutomationControlProductInformationItems> productInformationItems = new ArrayList<>();
    ExtendedFloatingActionButton fab_document, fab_orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automation_control_product_information);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        View logoView = toolbar.getChildAt(1);
        logoView.setOnClickListener(v -> finish());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        recyclerView = findViewById(R.id.recycler_view);

        fab_document = findViewById(R.id.fab_document);
        fab_orders = findViewById(R.id.fab_order);

        fab_document.setOnClickListener(view -> {
            if(IsConeected())
                startActivity(new Intent(getApplicationContext(), Documents.class));
            else
                Toast.makeText(this, getString(R.string.check_internet_connection), Toast.LENGTH_SHORT).show();
        });

        fab_orders.setOnClickListener(view -> startActivity(new Intent(AutomationControlProductInformation.this, AutomationControlProductOrders.class)));

        setupRecyclerView();
        init();
    }

    private Boolean IsConeected(){
        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }



    private void init() {
        for (int i = 0; i < 10; i++){
            productInformationItems.add(new AutomationControlProductInformationItems(R.drawable.unity, "Otomasyon Sistemleri"));
        }
    }

    private void setupRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setItemViewCacheSize(50);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new AutomationControlProductInformationAdapter(this, productInformationItems, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position, ImageView imageContainer, TextView name) {
        startActivity(new Intent(this, AutomationControlProductInformation.class));
        finish();
    }
}