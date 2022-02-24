package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact c1 = new Contact(1,"9866632329","Antonio");
    Contact c2 = new Contact(1,"9866632329","Antonio");
    Contact c3 = new Contact(1,"9866632329","Antonio");
    Contact c4 = new Contact(1,"9866632329","Antonio");
    Contact c5 = new Contact(1,"9866632329","Antonio");
    Contact c6 = new Contact(1,"9866632329","Antonio");
    Contact c7 = new Contact(1,"9866632329","Antonio");
    Contact c8 = new Contact(1,"9866632329","Antonio");
    Contact c9 = new Contact(1,"9866632329","Antonio");
    Contact c10 = new Contact(1,"9866632329","Antonio");
    Contact [] details = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(details);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}