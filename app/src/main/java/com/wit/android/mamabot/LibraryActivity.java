package com.wit.android.mamabot;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LibraryActivity extends AppCompatActivity {
    int[]titles={R.string.bf1,R.string.bf2,R.string.bf3,R.string.bf4,R.string.bf5,R.string.bf6,R.string.bf7,R.string.bf8,R.string.bf9,R.string.bf10,R.string.bf11,R.string.bf12};
    //int[]intros={R.string.malaria_intro,R.string.uti_intro};
    String[]categories={"Breastfeeding","Breastfeeding","Breastfeeding","Breastfeeding","Breastfeeding","Breastfeeding","Bottlefeeding","Baby care","Baby care","Baby care","Baby care","Baby care"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        RecyclerView rv=(RecyclerView) findViewById(R.id.myRecycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        MyAdapter adapter=new MyAdapter(this,titles,categories);
        rv.setAdapter(adapter);
    }

}




