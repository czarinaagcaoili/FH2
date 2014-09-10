package net.bluemix.com.fh2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Fore extends ActionBarActivity {

    Button home, fore, hot, forecast1, forecast2, forecast3, forecast4;
    TextView line, line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set activity layout
        setContentView(R.layout.activity_fore);

        home = (Button) findViewById(R.id.homepo);
        fore = (Button) findViewById(R.id.fore);
        hot = (Button) findViewById(R.id.hot);
        forecast1 = (Button) findViewById(R.id.forecast1);
        forecast2 = (Button) findViewById(R.id.forecast2);
        forecast3 = (Button) findViewById(R.id.forecast3);
        forecast4 = (Button) findViewById(R.id.forecast4);
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
                startActivity(new Intent(Fore.this, Home.class));
                finish();
            }
        });

        forecast1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Fore.this, Forecast1.class));
                finish();
            }
        });

        forecast2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Fore.this, Forecast2.class));
                finish();
            }
        });


        forecast3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Fore.this, Forecast3.class));
                finish();
            }
        });

        forecast4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Fore.this, Forecast4.class));
                finish();
            }
        });

        hot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Fore.this, Hot.class));
                finish();
            }
        });

    }
}
