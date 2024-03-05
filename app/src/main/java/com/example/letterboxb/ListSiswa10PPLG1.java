package com.example.letterboxb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa10PPLG1 extends AppCompatActivity implements AdapterSiswa10PPLG1.ItemClickListener {
    AdapterSiswa10PPLG1 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa10_pplg1);

        RecyclerView recyclerView = findViewById(R.id.RVListPepeleg);

        List<ItemPepeleg> items = new ArrayList<ItemPepeleg>();

        String[] siswa = {
                "Abdun Nafi Hibatullah",
                "Aldiansyah Fayruz",
                "Alikha Mutiara Hati",
                "Allam Permata Putra",
                "Arbani Akhyar Radjadin",
                "Arsya Fauz Marzuki",
                "Azzam Fitrawansyah Salim",
                "Azzan Isham Alawiy",
                "Burhanuddin Zain",
                "Daffa Raziq Angie Irawan",
                "Dylan Athallah Alam",
                "Dzaky Ihsan Rasyid",
                "Hilal Syah Amali",
                "Jeremy Edward Domenico Sanjaya",
                "Jovanco Nicholas Rise",
                "Khalisha Kaylanasywa",
                "Maulana Arka Narendra",
                "Muhammad Asraf El Farras",
                "Muhammad Choirul'Anam",
                "Muhammad Evan Maxsalmina",
                "Muhammad Fakhry Alifahrizq A.",
                "Muhammad Rafif Azka Budiawan",
                "Muhammad Zuhrizal",
                "Nafisah Isbarsani",
                "Nail Zhavier Adhyaksa",
                "Nasharuddin Hatta",
                "Naufal Afdhal Haryda",
                "Nicholas Christian Chandra",
                "Ocean Karuna Muryanto",
                "Pajri Al Fikri Riandi",
                "Radithia Arlistian Saputra",
                "Rifqi Wibisono Himmawan",
                "Royyan Ahmad Zaydan",
                "Ruga Zinedine Airinka",
                "Satria Rudi Pratama",
                "Shofiyyul Hilmi",
                "Zaskia Amelia Putri"
        };


        for (int i = 0; i < siswa.length; i++){
            items.add(new ItemPepeleg(siswa[i],Integer.toString(i + 1),"https://media.tenor.com/akFQ4BiD1UEAAAAe/radiohead-thom-yorke.png"));
        }


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterSiswa10PPLG1(getApplicationContext(), items); // Initialize adapter
        adapter.setClickListener(this); // Set click listener
        recyclerView.setAdapter(adapter); // Set adapter to RecyclerView
    }
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + (position + 1), Toast.LENGTH_SHORT).show();
    }
}