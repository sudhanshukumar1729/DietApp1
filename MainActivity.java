package com.example.dietapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements fragment1.OnSubmitClickListener {

    Button btn,btn2,btn3;
    TextView calorie;
    public int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calorie = findViewById(R.id.calorie);

        btn = findViewById(R.id.buttonwheat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment1 first_fragment = new fragment1();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.mainactivity, first_fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        //fragment2
        btn2 = findViewById(R.id.buttonrice);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment1 first_fragment = new fragment1();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.mainactivity, first_fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        //fragment3
        btn3 = findViewById(R.id.buttonmilk);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment1 first_fragment = new fragment1();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.mainactivity, first_fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }

    @Override
    public void onSubmitClicked(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }

    //submit for fragment2
    public void onSubmitClicked2(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }

    //submit for fragment3
    public void onSubmitClicked3(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }
}
