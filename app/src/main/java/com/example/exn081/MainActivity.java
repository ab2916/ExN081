package com.example.exn081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent si;
    EditText et1;
    double sum;
    int op = 0;
    double uAnswer;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        si = new Intent(this,Credits.class);
    }

    public boolean checkInput(String st) {
        return st.matches("-?\\d+(\\.\\d+)?");
    }

    public void opFunc(int op, double kelet) {
        if(op == 1)
        {
            sum = sum + kelet;
        }
        else if(op == 2)
        {
            sum = sum - kelet;
        }
        else if(op == 3)
        {
            sum = sum * kelet;
        }
        else if(op == 4)
        {
            sum = sum / kelet;
        }
    }

    public void addition(View view) {
        st = et1.getText().toString();
        if(checkInput(st)) {
            uAnswer = Double.parseDouble(st);
            if (op == 0) {
                sum = uAnswer;
            }
            else {
                opFunc(op, uAnswer);
            }
            op = 1;
            et1.setText("");
            et1.setHint(st + " +");
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void subtraction(View view) {
        st = et1.getText().toString();
        if(checkInput(st)) {
            uAnswer = Double.parseDouble(st);
            if (op == 0) {
                sum = uAnswer;
            }
            else {
                opFunc(op, uAnswer);
            }
            op = 2;
            et1.setText("");
            et1.setHint(st + " -");
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplication(View view) {
        st = et1.getText().toString();
        if(checkInput(st)) {
            uAnswer = Double.parseDouble(st);
            if (op == 0) {
                sum = uAnswer;
            }
            else {
                opFunc(op, uAnswer);
            }
            op = 3;
            et1.setText("");
            et1.setHint(st + " *");
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void division(View view) {
        st = et1.getText().toString();
        if(checkInput(st)) {
            uAnswer = Double.parseDouble(st);
            if (op == 0) {
                sum = uAnswer;
            }
            else {
                opFunc(op, uAnswer);
            }
            op = 4;
            et1.setText("");
            et1.setHint(st + " /");
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void ac(View view) {
        et1.setText("");
        et1.setHint("0");
        sum = 0;
        op = 0;
    }

    public void ans(View view) {
        st = et1.getText().toString();
        if(checkInput(st)) {
            uAnswer = Double.parseDouble(st);
            opFunc(op, uAnswer);
            st = Double.toString(sum);
            op = 5;
            et1.setText("");
            et1.setText(st);
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void newAc(View view) {
        st = Double.toString(sum);
        si.putExtra("193hadorel",st);
        startActivity(si);
    }
}