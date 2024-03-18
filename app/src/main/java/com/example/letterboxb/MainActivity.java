package com.example.letterboxb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.letterboxb.databinding.ActivityMainBinding;
import com.example.letterboxb.fragments.HomeFragment;
import com.example.letterboxb.fragments.ListSiswaFragment;
import com.example.letterboxb.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {

                replaceFragment(new HomeFragment());

            } else if (itemId == R.id.lists) {

                replaceFragment(new ListSiswaFragment());

            } else if (itemId == R.id.settings) {

                replaceFragment(new SettingsFragment());

            }

            return true;
        });
    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

    }
}