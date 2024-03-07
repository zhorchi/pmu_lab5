package com.gshalashov.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data){
        ImageView imageView = findViewById(R.id.image_view);


        switch (reqCode){
            case 1:
                switch (data.getExtras().getInt("Figure") % 3){
                    case 1: imageView.setImageResource(R.drawable.circle); break;
                    case 2: imageView.setImageResource(R.drawable.oval); break;
                    case 0: imageView.setImageResource(R.drawable.ring); break;

                }
        }
    }

}