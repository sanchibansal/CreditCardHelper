package com.example.sakshi.creditcardhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button compute, clear;
    EditText balance,rate,payment, final_balance, months, interest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compute=(Button)findViewById(R.id.compute);
        clear=(Button)findViewById(R.id.clear);
        balance=(EditText)findViewById(R.id.balance);
        rate=(EditText)findViewById(R.id.rate);
        payment=(EditText)findViewById(R.id.minPayment);
        final_balance=(EditText)findViewById(R.id.finalBalance);
        months=(EditText)findViewById(R.id.month);
        interest=(EditText)findViewById(R.id.interest);
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String bal, ra, pay, fi, mon, inte;
                bal=balance.getText().toString();
                ra=rate.getText().toString();
                pay=payment.getText().toString();

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balance.setText(null);
                rate.setText(null);
                payment.setText(null);
                final_balance.setText(null);
                months.setText(null);
                interest.setText(null);

            }
        });

    }
}
