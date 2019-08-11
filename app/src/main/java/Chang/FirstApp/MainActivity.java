package Chang.FirstApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double answer = 0.0;
    double add1 = 0.0;
    double add2 = 0.0;
    StringBuilder input1 = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.Btn0);

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("0");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn1 = findViewById(R.id.Btn1);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("1");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn2 = findViewById(R.id.Btn2);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("2");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn3 = findViewById(R.id.Btn3);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("3");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn4 = findViewById(R.id.Btn4);

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("4");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn5 = findViewById(R.id.Btn5);

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("5");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn6 = findViewById(R.id.Btn6);

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("6");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn7 = findViewById(R.id.Btn7);

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("7");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn8 = findViewById(R.id.Btn8);

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("8");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btn9 = findViewById(R.id.Btn9);

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                input1.append("9");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(input1);
            }
        });

        Button btnAdd = findViewById(R.id.BtnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView resultTextView = findViewById(R.id.resultTextView);
                add1 = Double.parseDouble(input1.toString());
                input1 = new StringBuilder();
            }
        });

        Button btnEqual = findViewById(R.id.BtnEqual);

        btnEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView resultTextView = findViewById(R.id.resultTextView);

                add2 = Double.parseDouble(input1.toString());
                add1 += add2;
                resultTextView.setText(Double.toString(add1));
            }
        });

    }
}
