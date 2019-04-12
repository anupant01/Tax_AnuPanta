package com.tax_anupanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etsalary;
    TextView tvresult;
    Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etsalary=findViewById(R.id.etsalary);
        tvresult=findViewById(R.id.tvresult);
        btncalculate=findViewById(R.id.btncalculate);


        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double salary,result;

                salary= Double.parseDouble(etsalary.getText().toString()) * 12;

                Tax_Calculator tax = new Tax_Calculator((salary));
                result=tax.Tax();
                tvresult.setText(Double.toString(result));


            }
        });
    }
}
