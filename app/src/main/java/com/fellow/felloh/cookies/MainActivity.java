package com.fellow.felloh.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView beforeCookieImageView = (ImageView) findViewById(R.id.before_cookie_image_view);
        beforeCookieImageView.setImageResource(R.drawable.aftercookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView statusInitialTextView = (TextView) findViewById(R.id.status_initial_text_view);
        statusInitialTextView.setText("I am Totally full");

    }
}

