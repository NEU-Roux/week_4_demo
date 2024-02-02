package edu.northeastern.demoweek4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView age;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.name);
        this.age = itemView.findViewById(R.id.age);
    }
}