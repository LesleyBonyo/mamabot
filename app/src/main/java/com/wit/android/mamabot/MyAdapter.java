package com.wit.android.mamabot;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2/27/2018.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    //fields to store passed in data
    Context c;
    int[] titles;
    //int[]intros;
    String[]categories;
    String[]details={"file:///android_asset/bfa.html","file:///android_asset/bfb.html","file:///android_asset/bfc.html","file:///android_asset/bfd.html","file:///android_asset/bfe.html","file:///android_asset/bff.html","file:///android_asset/bfg.html","file:///android_asset/bfh.html","file:///android_asset/bfi.html","file:///android_asset/bfj.html","file:///android_asset/bfk.html","file:///android_asset/bfl.html",};

    public MyAdapter(Context ctx, int[]titles, String[]categories) {
        this.c = ctx;
        this.titles = titles;
        //this.intros = intros;
        this.categories = categories;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate view from xml
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        //holder
        MyHolder holder=new MyHolder(v);
        return holder;
    }
    //data is bound to views
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        //bind data
        holder.titletxt.setText(titles[position]);
        //holder.introtxt.setText(intros[position]);
        holder.categorytxt.setText(categories[position]);


        //when item is clicked
        holder.setItemClickListener(new HandleCallBack() {
            @Override
            public void loadDetails(int detailres) {
                Intent i=new Intent(c,DetailsActivity.class);
                i.putExtra("Details",details[detailres]);

                c.startActivity(i);
            }


        });
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
