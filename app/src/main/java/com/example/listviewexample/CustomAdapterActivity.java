package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Cat",R.mipmap.cat));
        animals.add(new Animal("Dog",R.mipmap.dog));
        animals.add(new Animal("Bee",R.mipmap.bee));

        ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(animals,this);

        listView.setAdapter(adapter);
    }
}