package com.minosai.recyclerviewdemo;

import android.app.Person;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    //Out data
    List<PersonModel> people;

    public PersonAdapter(List<PersonModel> people) {
        this.people = people;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //Telling RV which template layout file to use (over here it is item_person)
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_person, viewGroup, false);

        return new PersonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int i) {

        PersonModel personModel = people.get(i);

        personViewHolder.textPerson.setText(personModel.getName());
        personViewHolder.textAge.setText(String.valueOf(personModel.getAge()));

    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
