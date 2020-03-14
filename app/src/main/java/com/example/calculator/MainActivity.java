package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text;
    private Button nine_btn;
    private Button eight_btn;
    private Button seven_btn;
    private Button six_btn;
    private Button five_btn;
    private Button four_btn;
    private Button three_btn;
    private Button two_btn;
    private Button one_btn;
    private Button zero_btn;
    private Button multiply_btn;
    private Button divide_btn;
    private Button plus_btn;
    private Button minus_btn;
    private Button point_btn;
    private Button del_btn;
    private Button equal_btn;
    private float nr1, nr2;
    private int nr;
    private boolean muliplay, divide, plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nine_btn = (Button) findViewById(R.id.nine_btn);
        nine_btn.setOnClickListener(this);

        eight_btn = (Button) findViewById(R.id.eight_btn);
        eight_btn.setOnClickListener(this);

        seven_btn = (Button) findViewById(R.id.seven_btn);
        seven_btn.setOnClickListener(this);

        six_btn = (Button) findViewById(R.id.six_btn);
        six_btn.setOnClickListener(this);

        five_btn = (Button) findViewById(R.id.five_btn);
        five_btn.setOnClickListener(this);

        four_btn = (Button) findViewById(R.id.four_btn);
        four_btn.setOnClickListener(this);

        three_btn = (Button) findViewById(R.id.three_btn);
        three_btn.setOnClickListener(this);

        two_btn = (Button) findViewById(R.id.two_btn);
        two_btn.setOnClickListener(this);

        one_btn = (Button) findViewById(R.id.one_btn);
        one_btn.setOnClickListener(this);

        zero_btn = (Button) findViewById(R.id.zero_btn);
        zero_btn.setOnClickListener(this);

        multiply_btn = (Button) findViewById(R.id.multiply_btn);
        multiply_btn.setOnClickListener(this);

        divide_btn = (Button) findViewById(R.id.divide_btn);
        divide_btn.setOnClickListener(this);

        plus_btn = (Button) findViewById(R.id.plus_btn);
        plus_btn.setOnClickListener(this);

        minus_btn = (Button) findViewById(R.id.minus_btn);
        minus_btn.setOnClickListener(this);

        point_btn = (Button) findViewById(R.id.point_btn);
        point_btn.setOnClickListener(this);

        del_btn = (Button) findViewById(R.id.del_btn);
        del_btn.setOnClickListener(this);

        equal_btn = (Button) findViewById(R.id.equal_btn);
        equal_btn.setOnClickListener(this);

        text = (EditText) findViewById(R.id.editText);
        muliplay = false;
        divide = false;
        plus = false;
        minus = false;
        nr = 0;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one_btn: {
                text.setText(text.getText() + "1");
                nr +=1;
                break;
            }
            case R.id.two_btn: {
                text.setText(text.getText() + "2");
                nr +=1;
                break;
            }
            case R.id.three_btn: {
                text.setText(text.getText() + "3");
                nr +=1;
                break;
            }
            case R.id.four_btn: {
                text.setText(text.getText() + "4");
                nr +=1;
                break;
            }
            case R.id.five_btn: {
                text.setText(text.getText() + "5");
                nr +=1;
                break;
            }
            case R.id.six_btn: {
                text.setText(text.getText() + "6");
                nr +=1;
                break;
            }
            case R.id.seven_btn: {
                text.setText(text.getText() + "7");
                nr +=1;
                break;
            }
            case R.id.eight_btn: {
                text.setText(text.getText() + "8");
                nr +=1;
                break;
            }
            case R.id.nine_btn: {
                text.setText(text.getText() + "9");
                nr +=1;
                break;
            }
            case R.id.zero_btn: {
                text.setText(text.getText() + "0");
                nr +=1;
                break;
            }
            case R.id.point_btn: {
                text.setText(text.getText() + ".");
                nr +=1;
                break;
            }
            case R.id.multiply_btn: {
                if(text == null){
                    text.setText("");
                }else{
                    nr1 = Float.parseFloat((text.getText() + ""));
                    nr = 0;
                    muliplay = true;
                    text.setText(text.getText() +" * ");
                }
                break;
            }
            case R.id.divide_btn: {
                if(text == null){
                    text.setText("");
                }else{
                    nr1 = Float.parseFloat((text.getText() + ""));
                    nr = 0;
                    divide = true;
                    text.setText(text.getText() + " / ");
                }
                break;
            }
            case R.id.plus_btn: {
                if(text == null){
                    text.setText("");
                }else{
                    nr1 = Float.parseFloat((text.getText() + ""));
                    plus= true;
                    nr = 0;
                    text.setText(text.getText() + " + ");
                }
                break;
            }
            case R.id.minus_btn: {

                if(text == null){
                    text.setText("");
                }else{
                    nr1 = Float.parseFloat((text.getText() + ""));
                    minus= true;
                    nr = 0;
                    text.setText(text.getText() +" - ");
                }
                break;
            }
            case R.id.equal_btn: {
                String s = text.getText().toString();
                nr2 = Float.parseFloat(s.substring(s.length() - nr));


                if(muliplay == true){
                    nr1 *= nr2;
                }else if(divide == true){
                    nr1 /= nr2;
                }else  if(plus == true){
                    nr1 += nr2;
                }else if(minus == true){
                    nr1 -= nr2;
                }
                text.setText(text.getText() + " = " + nr1);
                break;
            }
            case R.id.del_btn: {
                text.setText("");
                muliplay = false;
                divide = false;
                plus = false;
                minus = false;
                nr = 0;
                break;
            }


            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }
}
