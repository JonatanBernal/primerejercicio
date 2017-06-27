package com.jonatan.jonatanbernal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    Button buttonOne, buttonTwo, buttonThree;
    TextView texto;

    private void setText(String text) {
        texto.setText(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "SOY EL BOTON 1 DESDE LA VARIABLE");
            }
        };
        buttonOne.setOnClickListener(listener);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "SOY EL BOTON 1");
                setText("SOY EL BOTON 1");
            }
        });

        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        texto = (TextView) findViewById(R.id.texto);
        setText("HOLA");

    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Log.v(TAG, "SOY EL BOTON 1 EN THIS");
                break;
            case R.id.button2:
                Log.v(TAG, "SOY EL BOTON 2");
                setText("SOY EL BOTON 2");
                break;
            case R.id.button3:
                Log.v(TAG, "SOY EL BOTON 3");
                setText("SOY EL BOTON 3");
                break;
        }

    }

    public void mehanhechoclick (View v) {
        Log.v(TAG, "SOY EL BOTON 4");
        setText("SOY EL BOTON 4");

    }
}
