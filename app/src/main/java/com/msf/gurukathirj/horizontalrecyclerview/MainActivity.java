package com.msf.gurukathirj.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        data.add("MARKET");
        data.add("FNO");
        data.add("DASHBOARD");
        data.add("WATCHLIST");
        recyclerAdapter = new RecyclerAdapter(data,this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        recyclerView.getLayoutManager().scrollToPosition(Integer.MAX_VALUE / 2);


    }
}
