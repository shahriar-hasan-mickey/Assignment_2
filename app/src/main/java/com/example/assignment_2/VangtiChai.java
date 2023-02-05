package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VangtiChai extends AppCompatActivity {
    private TextView amountView;
    private String value = "";
    private int amount = 0;
    String key[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vangti_chai);


//        textView.setText(textView.getText()+" 20");
    }

    public void key1(View view){

        if(amount > 0){
            value = Integer.toString(amount)+key[1];
            amount = Integer.parseInt(value);
        }else {
            value = Integer.toString(amount)+key[1];
            amount = Integer.parseInt(value);
        }
        amountView = findViewById(R.id.amountView);
        amountView.setText(Integer.toString(amount));
    }
}