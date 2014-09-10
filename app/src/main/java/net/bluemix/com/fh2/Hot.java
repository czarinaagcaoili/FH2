package net.bluemix.com.fh2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Hot extends ActionBarActivity {

    Button home, fore, hot;
    TextView line, line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set activity layout
        setContentView(R.layout.activity_hot);

        home = (Button) findViewById(R.id.homepo);
        fore = (Button) findViewById(R.id.fore);
        hot = (Button) findViewById(R.id.hot);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);

        home.setBackgroundColor(Color.BLACK);
        fore.setBackgroundColor(Color.BLACK);
        hot.setBackgroundColor(Color.BLUE);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);

        fore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Hot.this, Fore.class));
                finish();
            }
        });


        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Hot.this, Home.class));
                finish();
            }
        });
    }
}

