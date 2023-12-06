package com.example.dietapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements fragment1.OnSubmitClickListener,fragment2.OnSubmitClickListener,fragment3.OnSubmitClickListener {

    Button btn,btn2,btn3;
    TextView calorie;
    public int ans = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calorie = findViewById(R.id.calorie);

        btn = findViewById(R.id.buttonwheat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.dietapp.fragment1 first_fragment = new com.example.dietapp.fragment1();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.mainactivity, first_fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



//    @Override
//    public void onCreate2(Bundle savedInstanceState2) {
//        super.onCreate(savedInstanceState2);
//        setContentView(R.layout.activity_main);

//        calorie = findViewById(R.id.calorie);

        btn2 = findViewById(R.id.buttonrice);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.dietapp.fragment2 second_fragment = new com.example.dietapp.fragment2();
                FragmentManager manager2 = getSupportFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                transaction2.replace(R.id.mainactivity, second_fragment);
                transaction2.addToBackStack(null);
                transaction2.commit();
            }
        });

        btn3 = findViewById(R.id.buttonmilk);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.dietapp.fragment3 third_fragment = new com.example.dietapp.fragment3();
                FragmentManager manager3 = getSupportFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                transaction3.replace(R.id.mainactivity, third_fragment);
                transaction3.addToBackStack(null);
                transaction3.commit();
            }
        });
    }


    @Override
    public void onSubmitClicked1(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }



    //submit for fragment2
    public void onSubmitClicked2(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }

    public void onSubmitClicked3(int calorieValue) {
        ans = ans+calorieValue;
        calorie.setText("KCalorie: " + ans);
    }


}


