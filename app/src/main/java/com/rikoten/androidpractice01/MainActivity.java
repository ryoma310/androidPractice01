package com.rikoten.androidpractice01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.textViewForResult);

        myfunc();
    }




    /*ここから下を作ってください*/
    private void myfunc(){

    }
    /*ここまでを作ってください*/








    private boolean firstPrint = true;
    private void myPrint(String text){
        System.out.println(text);

        if(firstPrint) {
            firstPrint = false;
            result.append("\n\n" + text + "\n");
        } else
            result.append(text + "\n");

    }


}
