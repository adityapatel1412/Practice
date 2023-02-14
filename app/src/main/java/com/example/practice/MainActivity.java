package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import Adapter.ListDataAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView rowData;

    private String[] strName = {"Jugal","Aditya","Rajvi","Kiran","Jignesh","Henil","Aarav","Krupa","Amit"};

    private String[] strSub = {"Hello","Hii","Wassup??","Where are You??","Okay 👍","Yes Sure 🤩","Oops !!! 😱","Hello","Hiiii","When are you comming back?"};

    private String[] strTime = {"Yesterday","Yesterday","Yesterday","11:26 AM","11-02-2023","Yesterday","Yesterday","Yesterday","Yesterday","03:54 PM"};

    private int[] images = {R.mipmap.im1,R.mipmap.im2,R.mipmap.im3,R.mipmap.im4,R.mipmap.im5,R.mipmap.im6,R.mipmap.im7,R.mipmap.im8,R.mipmap.im9,R.mipmap.im10,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rowData = findViewById(R.id.rowData);

        ListDataAdapter adapter = new ListDataAdapter(MainActivity.this,strName,strSub,strTime,images);
        rowData.setAdapter(adapter);

    }
}