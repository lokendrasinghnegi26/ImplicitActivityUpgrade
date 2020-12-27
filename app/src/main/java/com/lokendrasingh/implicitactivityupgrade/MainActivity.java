package com.lokendrasingh.implicitactivityupgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dosomething(View view) {
        switch (view.getId())
        {
            case R.id.web :
                Intent i1=  new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(i1);
                break;
            case R.id.call:
                Intent i2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9928517798"));
                startActivity(i2);
                break;
            case R.id.map:
                Intent i3= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,78.9629"));
                startActivity(i3);
                break;
        }
    }
}