package edu.northeastern.demoweek4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

        import java.util.List;
        import java.util.ArrayList;

public class RView extends AppCompatActivity {

    RecyclerView peopleRecyclerView;
    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rview);

        //Instantiate the arraylist
        personList = new ArrayList<>();

        //Adding a new person object to the personList arrayList
        personList.add(new Person("John Doe", 18));

        peopleRecyclerView = findViewById(R.id.people_recycler_view);

        //This defines the way in which the RecyclerView is oriented
        peopleRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        peopleRecyclerView.setAdapter(new PersonAdapter(personList, this));
    }
}