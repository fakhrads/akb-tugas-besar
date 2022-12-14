package com.example.tugas_besar_akb_if3_cepat_lulus;

// nama  : fauzi fikrinullah
// nim   : 10119111
// kelas : if-3
// 27 juli 2022

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById((R.id.bottomNavigationView));
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.aboutFragment, R.id.mapFragment, R.id.profileFragment).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}