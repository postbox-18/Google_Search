package com.example.google_search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
    }

    public void ggsearch(View view) {
        Uri uri = Uri.parse("http://www.google.com/search?q=" + input.getText().toString());
        Intent ggsearchIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(ggsearchIntent);
    }
}