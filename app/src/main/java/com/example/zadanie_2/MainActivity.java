package com.example.zadanie_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editText);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            int clickcount=0;
            @Override
            public void onClick(View v) {

                String nameString = editText.getText().toString();
                Toast.makeText(getApplicationContext(), nameString, Toast.LENGTH_SHORT).show();

                clickcount++;
                String strInt = String.valueOf(clickcount);
                if(textView.getText().toString().equals("")){
                    textView.setText(strInt);
                }
                else {
                    int count = Integer.parseInt(textView.getText().toString());
                    count++;
                    String strCount = String.valueOf(count);
                    textView.setText(strCount);
                }
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            int clickcount=0;
            @Override
            public void onClick(View v) {
                clickcount++;
                String strInt = String.valueOf(clickcount);
                if(textView.getText().toString().equals("")){
                    textView.setText(strInt);
                }
                else {
                    int count = Integer.parseInt(textView.getText().toString());
                    count++;
                    String strCount = String.valueOf(count);
                    textView.setText(strCount);
                }
            }
        });
    }

    public void CheckBoxClicked(View view)
    {
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);

        if(checkbox.isChecked())
        {
            button1.setEnabled(true);
            button2.setEnabled(true);
            radioButton1.setEnabled(true);
            radioButton2.setEnabled(true);
            textView.setEnabled(true);
            editText.setEnabled(true);
        }
        else {
            button1.setEnabled(false);
            button2.setEnabled(false);
            radioButton1.setEnabled(false);
            radioButton2.setEnabled(false);
            textView.setEnabled(false);
            editText.setEnabled(false);
        }
    }

    public void See(View view)
    {
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);

        checkbox.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
        editText.setVisibility(View.VISIBLE);
    }

    public void NotSee(View view)
    {
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);

        checkbox.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        editText.setVisibility(View.INVISIBLE);
    }


}