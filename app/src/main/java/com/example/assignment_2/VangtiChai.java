package com.example.assignment_2;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VangtiChai extends AppCompatActivity {
    private TextView amountView;
    private String value = "";
    private long amount = 0;
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
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[0];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[0];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key1
        key1 = findViewById(R.id.key1);
        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[1];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[1];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key2
        key2 = findViewById(R.id.key2);
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[2];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[2];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key3
        key3 = findViewById(R.id.key3);
        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[3];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[3];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key4
        key4 = findViewById(R.id.key4);
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[4];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[4];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }

            }
        });


        //TODO : key5
        key5 = findViewById(R.id.key5);
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[5];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[5];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key6
        key6 = findViewById(R.id.key6);
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[6];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[6];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key7
        key7 = findViewById(R.id.key7);
        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[7];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[7];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key8
        key8 = findViewById(R.id.key8);
        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[8];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[8];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : key9
        key9 = findViewById(R.id.key9);
        key9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amountView.getText().toString().length() < 16) { //limiting the length of the digits to 10^16
                    amount = Long.parseLong(amountView.getText().toString());
                    if (amount > 0) {
                        value = Long.toString(amount) + key[9];
                        amount = Long.parseLong(value);
                    } else {
                        value = Long.toString(amount) + key[9];
                        amount = Long.parseLong(value);
                    }
                    amountView.setText(Long.toString(amount));
                    noteChecker();
                }
            }
        });


        //TODO : clearKey
        clearKey = findViewById(R.id.clearKey);
        clearKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Long.parseLong(amountView.getText().toString());
                amount = 0;
                amountView.setText(Long.toString(amount));
                setToZero();
            }
        });
    }



//    TODO : FOR HANDLING AND SAVING ACTIVITY DATA ON CHANGING SCREEN ORIENTATION
    private CharSequence data;
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState: ->");
        data = amountView.getText();
        outState.putCharSequence("amountView", data);
        data = tk1.getText();
        outState.putCharSequence("tk1", data);
        data = tk2.getText();
        outState.putCharSequence("tk2", data);
        data = tk5.getText();
        outState.putCharSequence("tk5", data);
        data = tk10.getText();
        outState.putCharSequence("tk10", data);
        data = tk20.getText();
        outState.putCharSequence("tk20", data);
        data = tk50.getText();
        outState.putCharSequence("tk50", data);
        data = tk100.getText();
        outState.putCharSequence("tk100", data);
        data = tk200.getText();
        outState.putCharSequence("tk200", data);
        data = tk500.getText();
        outState.putCharSequence("tk500", data);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState: ->");
        data = savedInstanceState.getCharSequence("amountView");
        amountView.setText(data);
        data = savedInstanceState.getCharSequence("tk1");
        tk1.setText(data);
        data = savedInstanceState.getCharSequence("tk2");
        tk2.setText(data);
        data = savedInstanceState.getCharSequence("tk5");
        tk5.setText(data);
        data = savedInstanceState.getCharSequence("tk10");
        tk10.setText(data);
        data = savedInstanceState.getCharSequence("tk20");
        tk20.setText(data);
        data = savedInstanceState.getCharSequence("tk50");
        tk50.setText(data);
        data = savedInstanceState.getCharSequence("tk100");
        tk100.setText(data);
        data = savedInstanceState.getCharSequence("tk200");
        tk200.setText(data);
        data = savedInstanceState.getCharSequence("tk500");
        tk500.setText(data);
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
        long val = 0;
        setToZero();

        if(amount >= 500){
            val = amount/500;
            amount = amount - val*500;
            tk500.setText(Long.toString(val));
        }
        if(amount >= 200){
            val = amount/200;
            amount = amount - val*200;
            tk200.setText(Long.toString(val));
        }
        if(amount >= 100){
            val = amount/100;
            amount = amount - val*100;
            tk100.setText(Long.toString(val));
        }
        if(amount >= 50){
            val = amount/50;
            amount = amount - val*50;
            tk50.setText(Long.toString(val));
        }
        if(amount >= 20){
            val = amount/20;
            amount = amount - val*20;
            tk20.setText(Long.toString(val));
        }
        if(amount >= 10){
            val = amount/10;
            amount = amount - val*10;
            tk10.setText(Long.toString(val));
        }
        if(amount >= 5){
            val = amount/5;
            amount = amount - val*5;
            tk5.setText(Long.toString(val));
        }
        if(amount >= 2){
            val = amount/2;
            amount = amount - val*2;
            tk2.setText(Long.toString(val));
        }
        if(amount >= 1){
            val = amount/1;
            amount = amount - val*1;
            tk1.setText(Long.toString(val));
        }


    }


//    TODO : https://stackoverflow.com/questions/8430805/clicking-the-back-button-twice-to-exit-an-activity
//  pressing twice to exit
    boolean isDoubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if(isDoubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        isDoubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click Back again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                isDoubleBackToExitPressedOnce = false;
            }
        }, 1000);
    }


}