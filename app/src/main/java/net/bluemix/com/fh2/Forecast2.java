package net.bluemix.com.fh2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Forecast2 extends ActionBarActivity {

    Button home, fore, hot;
    TextView line, line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set activity layout
        setContentView(R.layout.activity_forecast2);

        home = (Button) findViewById(R.id.homepo);
        fore = (Button) findViewById(R.id.fore);
        hot = (Button) findViewById(R.id.hot);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);


        home.setBackgroundColor(Color.BLACK);
        fore.setBackgroundColor(Color.BLUE);
        hot.setBackgroundColor(Color.BLACK);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);

        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Forecast2.this, Home.class));
                finish();

            }
        });

        fore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Forecast2.this, Fore.class));
                finish();

            }
        });

        hot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Forecast2.this, Hot.class));
                finish();

            }
        });

    }
}

