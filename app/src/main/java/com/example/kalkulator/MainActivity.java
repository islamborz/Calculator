package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonadd, buttonsub, buttonmul, buttondiv;
    EditText editTextN1, EditTextN2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        buttonadd = findViewById(R.id.btn_add);
        buttonsub = findViewById(R.id.btn_sub);
        buttonmul = findViewById(R.id.btn_mul);
        buttondiv = findViewById(R.id.btn_div);
        editTextN1 = findViewById(R.id.number1);
        EditTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
    }
    public int getIntFromEditText(EditText editText){
        if (editTextN1.getText().toString().equals("")){
            Toast.makeText(this, "Enter number",Toast.LENGTH_LONG).show();
            return 0;
        }else
        return Integer.parseInt(editText.getText().toString());
    }
    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(EditTextN2);
        if (view.getId() == R.id.btn_add) {
            textView.setText("Javob = " + (num1+num2));
        }
        if (view.getId() == R.id.btn_sub) {
            textView.setText("Javob = " + (num1-num2));
        }
        if (view.getId() == R.id.btn_div) {
            textView.setText("Javob = " + (num1/num2));
        }
        if (view.getId() == R.id.btn_mul) {
            textView.setText("Javob = " + ((float)num1*(float) num2));
        }

    }
}