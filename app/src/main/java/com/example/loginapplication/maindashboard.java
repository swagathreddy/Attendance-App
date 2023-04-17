package com.example.loginapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class maindashboard extends AppCompatActivity {

    ImageView regular,labs,overall;
    BottomNavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindashboard);
        regular=findViewById(R.id.regular);
        labs=findViewById(R.id.labs);
        overall=findViewById(R.id.overall);
        nav=findViewById(R.id.nav);
        regular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(maindashboard.this,regular.class);
                startActivity(intent);
            }
        });
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(maindashboard.this,labs.class);
                startActivity(intent);
            }
        });
        overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(maindashboard.this,overall.class);
                startActivity(intent);
            }
        });
        nav.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {

            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.remarks:
                        Toast.makeText(maindashboard.this,"remarks",Toast.LENGTH_LONG).show ();
                        setContentView(R.layout.fragment_remarks);
                        break;
                    case R.id.profile:
                        Toast.makeText(maindashboard.this,"profile",Toast.LENGTH_LONG).show();
                        setContentView(R.layout.fragment_profile);
                        break;

                    default:
                }
            }

        });
    }
}