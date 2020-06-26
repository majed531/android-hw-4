package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 char grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText first = findViewById(R.id.first);
        final EditText second = findViewById(R.id.second);
        final EditText third = findViewById(R.id.third);
        final EditText fourth = findViewById(R.id.fourth);
        final TextView answer = findViewById(R.id.answer);
        Button calc = findViewById(R.id.button);
        Button reset = findViewById(R.id.button2);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final    String a = first.getText().toString();
                final   String b = second.getText().toString();
                final   String c = third.getText().toString();
                final String d = fourth.getText().toString();
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
                int n3 = Integer.parseInt(c);

                int n4 = Integer.parseInt(d);
                int sambosa = n1 + n2 + n3 + n4;
                if (sambosa >= 90) {
                    grade = 'A';
                    answer.setText("congratz "+grade);

                }
                else if (sambosa >= 80){
                    grade ='B';
                    answer.setText("great work "+ grade);

                }
                else if (sambosa >= 70){
                    grade = 'C';
                    answer.setText("not bad " +grade);

                }
                else if (sambosa >= 60){
                    grade = 'D';
                    answer.setText("you should work hard "+ grade);

                }
                else if (sambosa < 60){
                    grade = 'F';
                    answer.setText("YOU FAILED"+ grade);


                }



            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText(null);
                first.dispatchDisplayHint(View.VISIBLE );
                second.setText(null);
                second.dispatchDisplayHint(View.VISIBLE );
                third.setText(null);
                third.dispatchDisplayHint(View.VISIBLE );
                fourth.setText(null);
                fourth.dispatchDisplayHint(View.VISIBLE );
                answer.setText("");
            }
        });


    }
}
