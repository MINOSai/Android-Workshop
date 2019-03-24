package com.minosai.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PersonModel> people = new ArrayList<>();

        people.add(new PersonModel("Name 1", 19));
        people.add(new PersonModel("Name 2", 23));
        people.add(new PersonModel("Name 3", 35));
        people.add(new PersonModel("Name 4", 17));
        people.add(new PersonModel("Name 5", 8));
        people.add(new PersonModel("Name 6", 5));
        people.add(new PersonModel("Name 7", 28));
        people.add(new PersonModel("Name 8", 10));
        people.add(new PersonModel("Name 9", 56));

        PersonAdapter adapter = new PersonAdapter(people);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
