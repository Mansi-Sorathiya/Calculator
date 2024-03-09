package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textDis;
    Button btnc,btnrb,btnpr,btndiv,btndel,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnmul,btnmin,btnpl,btnequ,btndot;
    private String temp;
    private int n1,n2,total;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDis=findViewById(R.id.txtdis);
        btnc=findViewById(R.id.btnc);
        btnrb=findViewById(R.id.btnrb);
        btnpr=findViewById(R.id.btnpr);
        btndiv=findViewById(R.id.btndiv);
        btnmul=findViewById(R.id.btnmul);
        btnmin=findViewById(R.id.btnmin);
        btnpl=findViewById(R.id.btnpl);
        btndel=findViewById(R.id.btndel);

        btnequ=findViewById(R.id.btnequ);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btndot=findViewById(R.id.btndot);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnc.setOnClickListener(this);
        btnrb.setOnClickListener(this);
        textDis.setOnClickListener(this);
        btnpr.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnpl.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btnequ.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==btn1.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"1");
        }
        if(view.getId()==btn2.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"2");
        }
        if(view.getId()==btn3.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"3");
        }
        if(view.getId()==btn4.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"4");
        }
        if(view.getId()==btn5.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"5");
        }
        if(view.getId()==btn6.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"6");
        }
        if(view.getId()==btn7.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"7");
        }
        if(view.getId()==btn8.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"8");
        }
        if(view.getId()==btn9.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"9");
        }
        if(view.getId()==btn0.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+"0");
        }
        if(view.getId()==btndot.getId())
        {
            temp=textDis.getText().toString();
            textDis.setText(""+temp+".");
        }
        if(view.getId()==btnc.getId())
        {
            textDis.setText("");

        }
        if(view.getId()==btndel.getId())
        {
            temp= temp.substring(0,textDis.getText().toString().length()-1);
            textDis.setText(""+temp);

        }
        if(view.getId()==btnpl.getId())
        {
            n1= Integer.parseInt(textDis.getText().toString());
            textDis.setText("");
            operator="plus";
        }

        if(view.getId()==btnmin.getId())
        {
            n1= Integer.parseInt(textDis.getText().toString());
            textDis.setText("");
            operator="min";
        }
        if(view.getId()==btnmul.getId())
        {
            n1= Integer.parseInt(textDis.getText().toString());
            textDis.setText("");
            operator="mul";
        }
        if(view.getId()==btndiv.getId())
        {
            n1= Integer.parseInt(textDis.getText().toString());
            textDis.setText("");
            operator="div";
        }
        if(view.getId()==btnpr.getId())
        {
            n1= Integer.parseInt(textDis.getText().toString());
            textDis.setText("");
            operator="pr";
        }
        if(view.getId()==btnequ.getId())
        {
            n2 = Integer.parseInt(textDis.getText().toString());
            if (operator.equals("plus"))
            {
                total = n1 + n2;
                textDis.setText("" + total);
            }
            if (operator.equals("mul"))
            {
                total = n1 * n2;
                textDis.setText("" + total);
            }
            if (operator.equals("min"))
            {
                total = n1 - n2;
                textDis.setText("" + total);
            }
            if (operator.equals("pr"))
            {
                total=n1*n2/100;
                textDis.setText("" + total);
            }
            if (operator.equals("div"))
            {
                total = n1 / n2;
                textDis.setText("" + total);
            }
//            textDis.setText("" + total);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
