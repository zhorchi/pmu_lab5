package com.gshalashov.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    RadioGroup rbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rbtn = findViewById(R.id.rbtn);
        rbtn.clearCheck();
    }

    public void onButtonClick(View view){
        Intent intent = new Intent();
        intent.putExtra("Figure", rbtn.getCheckedRadioButtonId());
        setResult(RESULT_OK, intent);
        finish();
    }
}