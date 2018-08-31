package com.example.sajid.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText tbval1;
    private CheckBox cbIntofoo1;
    private CheckBox cbNautokm1;
    private CheckBox cbCeltofar1;
    private CheckBox cbInctocm1;
    private CheckBox cbLittogal1;
    private CheckBox cbPoutogra1;
    private Button btnCon1;
    private TextView tvres1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbval1 = findViewById(R.id.tbval);
        cbInctocm1 = findViewById(R.id.cbInctocm);
        cbIntofoo1 = findViewById(R.id.cbIntofoo);
        cbNautokm1 = findViewById(R.id.cbNautokm);
        cbCeltofar1 = findViewById(R.id.cbCeltofar);
        cbLittogal1 = findViewById(R.id.cbLittogal);
        cbPoutogra1 = findViewById(R.id.cbPoutogra);
        btnCon1 = findViewById(R.id.btnCon);
        tvres1 = findViewById(R.id.tvres);
        btnCon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=tbval1.getText().toString();
                String ans="";
                if(a != null && !a.isEmpty()){
                    double res=Double.parseDouble(a);
                    if(cbInctocm1.isChecked()){
                        double x= res*2.45;
                        ans=ans+a+" Inch = "+Double.toString(x)+" cm \n";
                    }
                    if(cbIntofoo1.isChecked()){
                        double x= res*0.0833333;
                        ans=ans+a+" Inch = "+Double.toString(x)+" Foot \n";
                    }
                    if(cbNautokm1.isChecked()){
                        double x= res*1.852;
                        ans=ans+a+" Nautiacal mile = "+Double.toString(x)+" km \n";
                    }
                    if(cbCeltofar1.isChecked()){
                        double x= res*1.8 +32;
                        ans=ans+a+" Celcius = "+Double.toString(x)+" Fahrenheit \n";
                    }
                    if(cbLittogal1.isChecked()){
                        double x= res*0.264172;
                        ans=ans+a+" Litre = "+Double.toString(x)+" Gallon \n";
                    }
                    if(cbPoutogra1.isChecked()){
                        double x= res*0.453592;
                        ans=ans+a+" Pound = "+Double.toString(x)+" Kg \n";
                    }
                }
                else{
                    ans="Please Insert a value";
                }
                tvres1.setText(ans);
            }
        });
    }
}
