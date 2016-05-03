package com.example.dell.convertinchtocm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvInchToCm = (Button) findViewById(R.id.buttonConvInchToCm);
        buttonConvInchToCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxInch = (EditText) findViewById(R.id.editTextInch);
                EditText textBoxCm = (EditText) findViewById(R.id.editTextCm);
                double vInch = Double.valueOf(textBoxInch.getText().toString());
                double vCm = vInch / 2.54;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxCm.setText(formatVal.format(vCm));
            }
        });
        Button buttonConvCmToInch = (Button) findViewById(R.id.buttonConvCmToInch);
        buttonConvCmToInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxInch = (EditText) findViewById(R.id.editTextInch);
                EditText textBoxCm = (EditText) findViewById(R.id.editTextCm);
                double vCm = Double.valueOf(textBoxCm.getText().toString());
                double vInch = vCm * 2.54;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxInch.setText(formatVal.format(vInch));
            }
        });
    }
}
