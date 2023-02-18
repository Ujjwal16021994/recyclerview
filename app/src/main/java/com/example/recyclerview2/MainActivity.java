package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Data> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewvar = findViewById(R.id.idrecyclerView1);

        recyclerViewvar.setLayoutManager(new LinearLayoutManager(this));

        Data object = new Data(R.drawable.ewq,"Manish","6546546545");
        list.add(object);
        list.add(new Data(R.drawable.ewq,"harsh","7428525588"));
        list.add(new Data(R.drawable.ewq,"vinita","9428525561"));
        list.add(new Data(R.drawable.ewq,"roshan","9328525502"));
        list.add(new Data(R.drawable.ewq,"ravi","7988525565"));
        list.add(new Data(R.drawable.ewq,"ajay","7500285255"));
        list.add(new Data(R.drawable.ewq,"rahul","9528525580"));
        list.add(new Data(R.drawable.ewq,"vinay","9875487547"));
        list.add(new Data(R.drawable.ewq,"ankit","8656568656"));
        list.add(new Data(R.drawable.ewq,"ayushi","9754245412"));
        list.add(new Data(R.drawable.ewq,"anita","9875481211"));
        list.add(new Data(R.drawable.ewq,"harsh","9787546500"));
        list.add(new Data(R.drawable.ewq,"vijay","8659874513"));
        list.add(new Data(R.drawable.ewq,"ayush","9645784521"));
        list.add(new Data(R.drawable.ewq,"preeti","9158745123"));
        list.add(new Data(R.drawable.ewq,"ayushi","7548456980"));
        list.add(new Data(R.drawable.ewq,"shana","6547895462"));
        list.add(new Data(R.drawable.ewq,"athir","9528525580"));
        list.add(new Data(R.drawable.ewq,"vathir","6928525508"));
        list.add(new Data(R.drawable.ewq,"rathit","7845785425"));

        recycler rec = new recycler(this,list);
        recyclerViewvar.setAdapter(rec);

    }
}