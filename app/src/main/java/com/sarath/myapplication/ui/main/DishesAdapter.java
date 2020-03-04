package com.sarath.myapplication.ui.main;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sarath.myapplication.R;
import com.sarath.myapplication.model.CategoryDish;
import com.sarath.myapplication.model.TableMenuList;


import java.util.List;

public class DishesAdapter extends RecyclerView.Adapter<DishesAdapter.MyViewHolder> {

    private List<TableMenuList> tableMenuLists;
    public List<CategoryDish> categoryDishes;
    private Context context;
    private int count = 0;
    private int pos;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        CategoryDish categoryDish = categoryDishes.get(position);

        int countcategory = categoryDish.getAddonCat().size();
        if (countcategory > 0) {
            holder.tv_customization.setText("Customizations Available");
        } else {
            holder.tv_customization.setText("");
        }

        holder.tv_dish_name.setText(categoryDish.getDishName());
        // holder.tv_dish_currency.setText(categoryDish.getDishCurrency());
        holder.tv_dish_price.setText(String.valueOf(categoryDish.getDishCurrency() + " " + categoryDish.getDishPrice()));
        holder.tv_dish_calories.setText(String.valueOf(categoryDish.getDishCalories()));
        holder.tv_dish_description.setText(categoryDish.getDishDescription());


        Glide.with(context).load(categoryDish.getDishImage()).into(holder.iv_dish_image);


        String color = String.valueOf(categoryDish.getDishType());
        if (color.equals("1")) {
            holder.iv_dish_icon.setColorFilter(Color.parseColor("#964122"));
        } else if (color.equals("2")) {
            holder.iv_dish_icon.setColorFilter(Color.parseColor("#008100"));
        }


        holder.btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppConstant.count--;


                if (AppConstant.position != position) {
                    AppConstant.position = position;
                    count = 0;
                }
                count--;

                AppConstant.cartCount.setText("" + AppConstant.count);

                holder.btn_count.setText("" + count);
            }
        });
        holder.btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppConstant.count++;

                if (AppConstant.position != position) {
                    AppConstant.position = position;
                    count = 0;
                }
                count++;

                AppConstant.cartCount.setText("" + AppConstant.count);

                holder.btn_count.setText("" + count);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryDishes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_dish_name, tv_dish_currency, tv_dish_price, tv_dish_calories, tv_dish_description, year, genre, btn_count, tv_customization;
        public ImageView iv_dish_icon, iv_dish_image, btn_plus, btn_minus;

        public MyViewHolder(View view) {
            super(view);
            tv_dish_name = (TextView) view.findViewById(R.id.dish_name);
            tv_dish_price = (TextView) view.findViewById(R.id.dish_price);
            tv_dish_calories = (TextView) view.findViewById(R.id.dish_calories);
            iv_dish_image = (ImageView) view.findViewById(R.id.dish_image);
            tv_dish_description = (TextView) view.findViewById(R.id.dish_description);
            iv_dish_icon = (ImageView) view.findViewById(R.id.dish_icon);
            btn_plus = (ImageView) view.findViewById(R.id.button_plus);
            btn_minus = (ImageView) view.findViewById(R.id.button_minus);
            btn_count = (TextView) view.findViewById(R.id.dish_count);
            tv_customization = (TextView) view.findViewById(R.id.customization);

            //  genre = (TextView) view.findViewById(R.id.genre);
            // year = (TextView) view.findViewById(R.id.year);
        }
    }

    public DishesAdapter(List<TableMenuList> tableMenuLists, Context applicationContext) {
        this.tableMenuLists = tableMenuLists;
        this.categoryDishes = tableMenuLists.get(0).getCategoryDishes();
        this.context = applicationContext;

    }
}
