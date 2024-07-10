package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetArrayList;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        planetArrayList = new ArrayList<>();

        planetArrayList.add(new Planet("Mercury", R.drawable.mercury, "0 moon"));
        planetArrayList.add(new Planet("Venus", R.drawable.venus, "0 moon"));
        planetArrayList.add(new Planet("Earth", R.drawable.earth, "1 moon"));
        planetArrayList.add(new Planet("Mars", R.drawable.mars, "2 moon"));
        planetArrayList.add(new Planet("Jupiter", R.drawable.jupiter, "67 moon"));
        planetArrayList.add(new Planet("Saturn", R.drawable.saturn, "62 moon"));
        planetArrayList.add(new Planet("Uranus", R.drawable.uranus, "27 moon"));
        planetArrayList.add(new Planet("Neptune", R.drawable.neptune, "14 moon"));
        adapter = new CustomAdapter(planetArrayList, this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this , "Planet Name: " + adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}