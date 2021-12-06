package com.example.cuadradomagico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtInsert, txtResultado, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9,
            txt10, txt11, txt12, txt13, txt14,txt15, txt16;
    private TextView txtV1, txtV2;
    private Button btnIniciar, btnObtener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInsert = (EditText) findViewById(R.id.txtInsert);
        txtResultado = (EditText) findViewById(R.id.txtReesultado);
        txtResultado.setEnabled(false);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt1.setEnabled(false);
        txt2 = (EditText) findViewById(R.id.txt2);
        txt2.setEnabled(false);
        txt3 = (EditText) findViewById(R.id.txt3);
        txt3.setEnabled(false);
        txt4 = (EditText) findViewById(R.id.txt4);
        txt4.setEnabled(false);
        txt5 = (EditText) findViewById(R.id.txt5);
        txt5.setEnabled(false);
        txt6 = (EditText) findViewById(R.id.txt6);
        txt6.setEnabled(false);
        txt7 = (EditText) findViewById(R.id.txt7);
        txt7.setEnabled(false);
        txt8 = (EditText) findViewById(R.id.txt8);
        txt8.setEnabled(false);
        txt9 = (EditText) findViewById(R.id.txt9);
        txt9.setEnabled(false);
        txt10 = (EditText) findViewById(R.id.txt10);
        txt10.setEnabled(false);
        txt11 = (EditText) findViewById(R.id.txt11);
        txt11.setEnabled(false);
        txt12 = (EditText) findViewById(R.id.txt12);
        txt12.setEnabled(false);
        txt13 = (EditText) findViewById(R.id.txt13);
        txt13.setEnabled(false);
        txt14 = (EditText) findViewById(R.id.txt14);
        txt14.setEnabled(false);
        txt15 = (EditText) findViewById(R.id.txt15);
        txt15.setEnabled(false);
        txt16 = (EditText) findViewById(R.id.txt16);
        txt16.setEnabled(false);
        txtV1 = (TextView) findViewById(R.id.txtV1);
        txtV1.setEnabled(false);
        txtV2 = (TextView) findViewById(R.id.txtV2);
    }

    public void semilla (View view){
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16;
        int numero = Integer.parseInt(txtInsert.getText().toString());
        n1 = numero;
        n2 = numero+1;
        n3 = numero+2;
        n4 = numero+3;
        n5 = numero+4;
        n6 = numero+5;
        n7 = numero+6;
        n8 = numero+7;
        n9 = numero+8;
        n10 = numero+9;
        n11 = numero+10;
        n12 = numero+11;
        n13 = numero+12;
        n14 = numero+13;
        n15 = numero+14;
        n16 = numero+15;
        txt1.setText(n1);
        txt2.setText(n2);
        txt3.setText(n3);
        txt4.setText(n4);
        txt5.setText(n5);
        txt6.setText(n6);
        txt7.setText(n7);
        txt8.setText(n8);
        txt9.setText(n9);
        txt10.setText(n10);
        txt11.setText(n11);
        txt12.setText(n12);
        txt13.setText(n13);
        txt14.setText(n14);
        txt15.setText(n15);
        txt16.setText(n16);
        txtV1.setText("Resultado: " +n1+ "," +n2+ "," +n3+ "," +n4+ "," +n5+ "," +n6+ "," +n7+ "," +n8+ "," +n9+ "," +n10+ "," +n11+ "," +n12+ "," +n13+ "," +n14+ "," +n15+ "," +n16);
    }

    public void resultado(View view){
        int numeros = Integer.parseInt(txtInsert.getText().toString());
        int r1, r2, r3, r4, r5, r6, r7 , r8, r9, r10, r;

        int p1 = Integer.parseInt(txt1.getText().toString());
        int p2 = Integer.parseInt(txt2.getText().toString());
        int p3 = Integer.parseInt(txt3.getText().toString());
        int p4 = Integer.parseInt(txt4.getText().toString());
        int p5 = Integer.parseInt(txt5.getText().toString());
        int p6 = Integer.parseInt(txt6.getText().toString());
        int p7 = Integer.parseInt(txt7.getText().toString());
        int p8 = Integer.parseInt(txt8.getText().toString());
        int p9 = Integer.parseInt(txt9.getText().toString());
        int p10 = Integer.parseInt(txt10.getText().toString());
        int p11 = Integer.parseInt(txt11.getText().toString());
        int p12 = Integer.parseInt(txt12.getText().toString());
        int p13 = Integer.parseInt(txt13.getText().toString());
        int p14 = Integer.parseInt(txt14.getText().toString());
        int p15 = Integer.parseInt(txt15.getText().toString());
        int p16 = Integer.parseInt(txt16.getText().toString());

        r1 = p1 + p5 + p9 +p13;
        r2 = p2 + p6 + p10 + p14;
        r3 = p3 + p7 + p11 + p15;
        r4 = p4 + p8 + p12 + p16;

        r5 = p1 + p2 + p3 + p4;
        r6 = p5 + p6 + p7 + p8;
        r7 = p9 + p10 + p11 + p12;
        r8 = p13 + p14 + p15 + p16;

        r9 = p1 + p6 + p11 + p16;
        r10 = p4 + p7 + p10 + p13;

        r=r1;

        if (r1 == r && r2 == r && r3 == r && r4 == r && r5 == r && r6 == r && r7 == r && r8 == r && r9 == r && r10 == r){
            txtResultado.setText("Lo has Logrado");
        }else{
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
           // txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
            txt12.setText("");
            txt13.setText("");
            txt14.setText("");
            txt15.setText("");
            txt16.setText("");
            txtResultado.setText("Intentelo Otra Vez");
        }


    }
}