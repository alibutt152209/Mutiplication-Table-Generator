package com.ali.mutiplicationtablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView table1, table2, table3, table4, table5, table6, table7, table8, table9, table10;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);table1 = findViewById(R.id.table1);
        table2 = findViewById(R.id.table2);
        table3 = findViewById(R.id.table3);
        table4 = findViewById(R.id.table4);
        table5 = findViewById(R.id.table5);
        table6 = findViewById(R.id.table6);
        table7 = findViewById(R.id.table7);
        table8 = findViewById(R.id.table8);
        table9 = findViewById(R.id.table9);
        table10 = findViewById(R.id.table10);
        editText = findViewById(R.id.edittxt);
        button = findViewById(R.id.create);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double val = Integer.parseInt(editText.getText().toString());
                table1.setText(val + " x 1 = " + val*1);
                table2.setText(val + " x 2 = " + val*2);
                table3.setText(val + " x 3 = " + val*3);
                table4.setText(val + " x 4 = " + val*4);
                table5.setText(val + " x 5 = " + val*5);
                table6.setText(val + " x 6 = " + val*6);
                table7.setText(val + " x 7 = " + val*7);
                table8.setText(val + " x 8 = " + val*8);
                table9.setText(val + " x 9 = " + val*9);
                table10.setText(val + " x 10 = " + val*10);
            }
        });
    }
}