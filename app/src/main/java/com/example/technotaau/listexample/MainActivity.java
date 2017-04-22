package com.example.technotaau.listexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    Myadpter adpter;
Context context;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      context = MainActivity.this;
      next=(Button)findViewById(R.id.next);
        rv =(RecyclerView)findViewById(R.id.recycle);
        adpter = new Myadpter(context);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adpter);
    }
}
