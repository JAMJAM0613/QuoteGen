// SplashScreenActivity.java
package dev.jam.quotegen;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Set a delay for the splash screen (e.g., 2000 milliseconds or 2 seconds)
        int splashScreenDuration = 4000;
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the splash screen
                Intent mainIntent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, splashScreenDuration);
    }
}
