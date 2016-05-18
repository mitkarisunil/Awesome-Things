package com.example.welcome.awesome_things;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by Mitkare's on 31-03-2015.
 */
public class Lin extends Activity {
    TextView textView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lin);
        textView= (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        String[] array= getResources().getStringArray(R.array.awesome_Names);
        //int imageId=i.getIntExtra("id",position
             textView.setMovementMethod(LinkMovementMethod.getInstance());
             textView.setText(Html.fromHtml(array[position]));

    }
}
