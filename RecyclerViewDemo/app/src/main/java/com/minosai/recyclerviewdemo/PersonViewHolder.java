package com.minosai.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    TextView textPerson;
    TextView textAge;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);

        textPerson = itemView.findViewById(R.id.text_person_name);
        textAge = itemView.findViewById(R.id.text_person_age);
    }
}
