package com.example.letterboxb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa10PPLG1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);

        RecyclerView recyclerView = findViewById(R.id.RVListPepeleg);

        List<ItemPepeleg> items = new ArrayList<ItemPepeleg>();

        items.add(new ItemPepeleg("Panda Yorke","26",R.drawable.panda_yorke));
        items.add(new ItemPepeleg("Panda Yorke","1",R.drawable.panda_yorke));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterSiswa10PPLG1(getApplicationContext(),items));
    }
}