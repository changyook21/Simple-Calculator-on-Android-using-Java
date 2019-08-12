package Chang.FirstApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double answer = 0.0;
    double firstInput = 0.0;
    double secondInput = 0.0;
    boolean firstBool = true;

    boolean add = false;
    boolean substraction = false;
    boolean division = false;
    boolean multiplication = false;
    boolean dot = false;

    StringBuilder screen = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.Btn0);

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("0");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn1 = findViewById(R.id.Btn1);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("1");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn2 = findViewById(R.id.Btn2);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("2");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn3 = findViewById(R.id.Btn3);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("3");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn4 = findViewById(R.id.Btn4);

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("4");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn5 = findViewById(R.id.Btn5);

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("5");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn6 = findViewById(R.id.Btn6);

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("6");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn7 = findViewById(R.id.Btn7);

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("7");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn8 = findViewById(R.id.Btn8);

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("8");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btn9 = findViewById(R.id.Btn9);

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                screen.append("9");
                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText(screen);
            }
        });

        Button btnAdd = findViewById(R.id.BtnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                add = true;
                if (firstBool) {
                    firstInput = Double.parseDouble(screen.toString());
                }
                firstBool = true;

                screen = new StringBuilder();
            }
        });

        Button btnMin = findViewById(R.id.BtnMin);

        btnMin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                substraction = true;
                if (firstBool) {
                    firstInput = Double.parseDouble(screen.toString());
                }
                firstBool = true;

                screen = new StringBuilder();
            }
        });

        Button btnMult = findViewById(R.id.BtnMult);

        btnMult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                multiplication = true;
                if (firstBool) {
                    firstInput = Double.parseDouble(screen.toString());
                }
                firstBool = true;

                screen = new StringBuilder();
            }
        });

        Button btnDiv = findViewById(R.id.BtnDiv);

        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                division = true;
                if (firstBool) {
                    firstInput = Double.parseDouble(screen.toString());
                }
                firstBool = true;

                screen = new StringBuilder();
            }
        });

        Button btnSqr = findViewById(R.id.BtnSqr);

        btnSqr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                TextView resultTextView = findViewById(R.id.resultTextView);
                firstInput = Math.sqrt(Double.parseDouble(screen.toString()));
                resultTextView.setText(Double.toString(firstInput));
                firstBool = false;
            }
        });

        Button btnMod = findViewById(R.id.BtnMod);

        btnMod.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                TextView resultTextView = findViewById(R.id.resultTextView);
                firstInput = 0.01 * Double.parseDouble(screen.toString());
                resultTextView.setText(Double.toString(firstInput));
                firstBool = false;
            }
        });

        Button btnFrac = findViewById(R.id.BtnFrac);

        btnFrac.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                TextView resultTextView = findViewById(R.id.resultTextView);
                firstInput = 1 / Double.parseDouble(screen.toString());
                resultTextView.setText(Double.toString(firstInput));
                firstBool = false;
            }
        });

        Button btnLog = findViewById(R.id.BtnLog);

        btnLog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }
                TextView resultTextView = findViewById(R.id.resultTextView);
                firstInput = Math.log10(Double.parseDouble(screen.toString()));
                resultTextView.setText(Double.toString(firstInput));
                firstBool = false;
            }
        });

        Button btnEqual = findViewById(R.id.BtnEqual);

        btnEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (screen.length() == 0) {
                    return;
                }

                TextView resultTextView = findViewById(R.id.resultTextView);
                secondInput = Double.parseDouble(screen.toString());
                if (add) {
                    add = false;
                    firstInput += secondInput;
                    resultTextView.setText(Double.toString(firstInput));
                }

                if (substraction) {
                    substraction = false;
                    firstInput -= secondInput;
                    resultTextView.setText(Double.toString(firstInput));
                }

                if (multiplication) {
                    multiplication = false;
                    firstInput *= secondInput;
                    resultTextView.setText(Double.toString(firstInput));
                }

                if (division) {
                    division = false;
                    firstInput /= secondInput;
                    resultTextView.setText(Double.toString(firstInput));
                }

                firstBool = false;
                dot = true;
            }
        });

        Button btnReset = findViewById(R.id.BtnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView resultTextView = findViewById(R.id.resultTextView);
                resultTextView.setText("0");
                answer = 0.0;
                firstInput = 0.0;
                secondInput = 0.0;
                firstBool = true;
                add = false;
                substraction = false;
                division = false;
                multiplication = false;
                dot = false;
                screen = new StringBuilder();
            }
        });

        Button btnDot = findViewById(R.id.BtnDot);

        btnDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (dot) {
                    return;
                }
                TextView resultTextView = findViewById(R.id.resultTextView);
                screen.append(".");
                resultTextView.setText(screen);
                dot = true;

            }
        });
        Button btnMinus = findViewById(R.id.BtnMinus);

        btnMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView resultTextView = findViewById(R.id.resultTextView);

                firstInput *= -1;

                screen = new StringBuilder(resultTextView.getText());
                double current = Double.parseDouble(screen.toString());
                current *= -1;
                screen = new StringBuilder(Double.toString(current));
                resultTextView.setText(screen);
            }
        });

        Button btnBack = findViewById(R.id.BtnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                TextView resultTextView = findViewById(R.id.resultTextView);

                if (resultTextView.getText().length() == 1) {
                    resultTextView.setText("0");
                    return;

                }
                StringBuilder temp = new StringBuilder(resultTextView.getText());
                if (temp.charAt(temp.length() - 1) == '.') {
                    dot = false;
                }
                temp.deleteCharAt(temp.length() - 1);
                resultTextView.setText(temp);
                firstInput = Double.parseDouble(temp.toString());
            }
        });
    }

}
