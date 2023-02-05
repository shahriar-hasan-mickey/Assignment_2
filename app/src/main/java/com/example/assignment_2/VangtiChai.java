package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VangtiChai extends AppCompatActivity {
    private TextView amountView;
    private String value = "";
    private int amount = 0;
    String key[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private Button key1, key2, key3, key4, key5, key6, key7, key8, key9, key0, clearKey;
    private TextView tk1, tk2, tk5, tk10, tk20, tk50, tk100, tk200, tk500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vangti_chai);


//        Declaration
        tk1 = findViewById(R.id.tk1);
        tk2 = findViewById(R.id.tk2);
        tk5 = findViewById(R.id.tk5);
        tk10 = findViewById(R.id.tk10);
        tk20 = findViewById(R.id.tk20);
        tk50 = findViewById(R.id.tk50);
        tk100 = findViewById(R.id.tk100);
        tk200 = findViewById(R.id.tk200);
        tk500 = findViewById(R.id.tk500);
        amountView = findViewById(R.id.amountView);





        //TODO : key0
        key0 = findViewById(R.id.key0);
        key0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[0];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[0];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });



        //TODO : key1
        key1 = findViewById(R.id.key1);
        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[1];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[1];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });

        //TODO : key2
        key2 = findViewById(R.id.key2);
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[2];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[2];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });


        //TODO : key3
        key3 = findViewById(R.id.key3);
        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[3];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[3];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });


        //TODO : key4
        key4 = findViewById(R.id.key4);
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[4];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[4];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();

            }
        });


        //TODO : key5
        key5 = findViewById(R.id.key5);
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[5];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[5];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });


        //TODO : key6
        key6 = findViewById(R.id.key6);
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[6];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[6];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });


        //TODO : key7
        key7 = findViewById(R.id.key7);
        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[7];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[7];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });


        //TODO : key8
        key8 = findViewById(R.id.key8);
        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[8];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[8];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });



        //TODO : key9
        key9 = findViewById(R.id.key9);
        key9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                if(amount > 0){
                    value = Integer.toString(amount)+key[9];
                    amount = Integer.parseInt(value);
                }else {
                    value = Integer.toString(amount)+key[9];
                    amount = Integer.parseInt(value);
                }
                amountView.setText(Integer.toString(amount));
                noteChecker();
            }
        });





        //TODO : clearKey
        clearKey = findViewById(R.id.clearKey);
        clearKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Integer.parseInt(amountView.getText().toString());
                amount = 0;
                amountView.setText(Integer.toString(amount));
                setToZero();
            }
        });
    }


    private void setToZero(){
        tk1.setText("0");
        tk2.setText("0");
        tk5.setText("0");
        tk10.setText("0");
        tk20.setText("0");
        tk50.setText("0");
        tk100.setText("0");
        tk200.setText("0");
        tk500.setText("0");
    }

    private void noteChecker(){
        int val = 0;
        setToZero();





        if(amount >= 500){
            val = amount/500;
            amount = amount - val*500;
            tk500.setText(Integer.toString(val));
        }
        if(amount >= 200){
            val = amount/200;
            amount = amount - val*200;
            tk200.setText(Integer.toString(val));
        }
        if(amount >= 100){
            val = amount/100;
            amount = amount - val*100;
            tk100.setText(Integer.toString(val));
        }
        if(amount >= 50){
            val = amount/50;
            amount = amount - val*50;
            tk50.setText(Integer.toString(val));
        }
        if(amount >= 20){
            val = amount/20;
            amount = amount - val*20;
            tk20.setText(Integer.toString(val));
        }
        if(amount >= 10){
            val = amount/10;
            amount = amount - val*10;
            tk10.setText(Integer.toString(val));
        }
        if(amount >= 5){
            val = amount/5;
            amount = amount - val*5;
            tk5.setText(Integer.toString(val));
        }
        if(amount >= 2){
            val = amount/2;
            amount = amount - val*2;
            tk2.setText(Integer.toString(val));
        }
        if(amount >= 1){
            val = amount/1;
            amount = amount - val*1;
            tk1.setText(Integer.toString(val));
        }


    }

}