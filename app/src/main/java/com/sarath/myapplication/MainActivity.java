package com.sarath.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sarath.myapplication.model.Restaurant;
import com.sarath.myapplication.model.TableMenuList;
import com.sarath.myapplication.pojo.Catagory;
import com.sarath.myapplication.service.ApiClient;
import com.sarath.myapplication.service.ApiService;
import com.sarath.myapplication.ui.main.AppConstant;
import com.sarath.myapplication.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Catagory> catagoryArrayList = new ArrayList<>();
    private SectionsPagerAdapter sectionsPagerAdapter;
    private List<TableMenuList> tableMenuList;
    TextView tv_cartitem_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_cartitem_count = findViewById(R.id.tv_cartitem_count);
        AppConstant.cartCount = tv_cartitem_count;

        getCatagoryItems();
    }

    private void getCatagoryItems() {

        try {
            ApiService service = ApiClient.getClient().create(ApiService.class);
            Call<List<Restaurant>> userCall = service.getDataList();
            userCall.enqueue(new Callback<List<Restaurant>>() {
                @Override
                public void onResponse(Call<List<Restaurant>> call, Response<List<Restaurant>> response) {

                    Log.d("onResponse", "" + response.body());
                    if (!response.body().isEmpty()) {


                        tableMenuList = response.body().get(0).getTableMenuList();

                        sectionsPagerAdapter = new SectionsPagerAdapter(MainActivity.this, getSupportFragmentManager(), tableMenuList);
                        ViewPager viewPager = findViewById(R.id.view_pager);
                        viewPager.setAdapter(sectionsPagerAdapter);
                        TabLayout tabs = findViewById(R.id.tabs);
                        tabs.setupWithViewPager(viewPager);

                        //     Toast.makeText(MainActivity.this, "" + response.body(), Toast.LENGTH_SHORT).show();

                    } else {
                        //   Toast.makeText(MainActivity.this, "error" , Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onFailure(Call<List<Restaurant>> call, Throwable t) {
                    Log.d("onFailure", t.toString());
                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}