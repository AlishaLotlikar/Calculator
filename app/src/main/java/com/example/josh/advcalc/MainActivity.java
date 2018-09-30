package com.example.josh.advcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    TextView input,result;
    Button add,sub,div,mul;
    Button clear,dec,equal;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Toast toast;
    char act;
    final char ADD='+';
    final char SUB='-';
    final char MUL='*';
    final char DIV='/';
    final char EQ='=';
    Double n1=Double.NaN;
    Double n2=0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseButtons();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"9");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString()+"0");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act=ADD;
                String str=input.getText().toString();
                if(input.getText().toString()=="" && result.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }
                else if(input.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                    result.setText(String.valueOf(n1)+"+");
                }
                else if(str.equals(".")){

                }
                else{
                    calculate();
                    result.setText(String.valueOf(n1) + "+");
                    input.setText(null);
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act=SUB;
                String str=input.getText().toString();
                if(input.getText().toString()=="" && result.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }
                else if(input.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                    result.setText(String.valueOf(n1)+"-");
                }
                else if(str.equals(".")){

                }
                else {
                    calculate();
                    result.setText(String.valueOf(n1) + "-");
                    input.setText(null);
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act=MUL;
                String str=input.getText().toString();
                if(input.getText().toString()=="" && result.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }
                else if(input.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                    result.setText(String.valueOf(n1)+"*");
                }
                else if(str.equals(".")){

                }

                else {
                    calculate();
                    result.setText(String.valueOf(n1) + "*");
                    input.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act=DIV;
                String str=input.getText().toString();
                if(input.getText().toString()=="" && result.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                }
                else if(input.getText().toString()==""){
                    toast.makeText(getApplicationContext(),"Enter Number",Toast.LENGTH_SHORT).show();
                    result.setText(String.valueOf(n1)+"/");
                }
                else if(str.equals(".")){

                }
                else {
                    calculate();
                    result.setText(String.valueOf(n1) + "/");
                    input.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //act=EQ;
                String check=result.getText().toString();
                if(input.getText().toString()=="" | result.getText().toString()==""){ }
                else if(check.contains("=")){
                    result.setText(null);
                    n1=Double.NaN;
                    n2=Double.NaN;
                    input.setText(null);
                }
                else{
                    calculate();
                    result.setText(result.getText().toString()+String.valueOf(n2)+"="+String.valueOf(n1));
                    input.setText(null);
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=input.getText().toString();
                int len=str.length();
                String blank="";
                if(str==""){
                    result.setText(null);
                    n1=Double.NaN;
                    n2=Double.NaN;
                    input.setText(null);
                }
                else{
                    for(int i=0;i<len-1;i++){
                        blank += str.charAt(i);
                    }
                    input.setText(blank);
                }
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=input.getText().toString();

                if(str.contains(".")){

                }
                else{
                    input.setText(input.getText().toString()+".");
                }
            }
        });


    }

    public void calculate(){
        if(!Double.isNaN(n1)){
            n2=Double.parseDouble(input.getText().toString());
            switch(act){
                case ADD: n1=n1+n2;break;
                case SUB: n1=n1-n2;break;
                case MUL: n1=n1*n2;break;
                case DIV: n1=n1/n2;break;
                case EQ: break;
            }

        }
        else{
            n1=Double.parseDouble(input.getText().toString());
        }
    }


    public void initialiseButtons(){
        one=findViewById(R.id.btn1);
        two=findViewById(R.id.btn2);
        three=findViewById(R.id.btn3);
        four=findViewById(R.id.btn4);
        five=findViewById(R.id.btn5);
        six=findViewById(R.id.btn6);
        seven=findViewById(R.id.btn7);
        eight=findViewById(R.id.btn8);
        nine=findViewById(R.id.btn9);
        zero=findViewById(R.id.btn0);
        add=findViewById(R.id.btnadd);
        mul=findViewById(R.id.btnmul);
        sub=findViewById(R.id.btnsub);
        div=findViewById(R.id.btndiv);
        clear=findViewById(R.id.clr);
        equal=findViewById(R.id.eq);
        input=findViewById(R.id.op);
        result=findViewById(R.id.res);
        dec=findViewById(R.id.dec);

    }


}

