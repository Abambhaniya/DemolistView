package com.rku.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lsData;

    ArrayAdapter<String> adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsData = findViewById(R.id.lsData);
        list = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_list_item_1,
        list
        );


    }
}