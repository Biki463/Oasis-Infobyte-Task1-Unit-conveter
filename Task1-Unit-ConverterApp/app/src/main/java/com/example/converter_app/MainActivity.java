package com.example.converter_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //widgets
        EditText editText =findViewById(R.id.editText);
        Button button =findViewById(R.id.button);
        TextView textView =findViewById(R.id.textView1);
        TextView textView2 =findViewById(R.id.textView2);

//GET THE KILOGRAM VALUE FROM THE USER



          //CONVERT THE KILOGRAM TO POUND
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kilogram =editText.getText().toString();

                float kilo = Float.parseFloat(kilogram);
                float gram =(float) (kilo * 1000);


                //set the textview with the result
                textView.setText(""+gram);
            }

        });






    }
}