package dev.jam.quotegen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private String[] quotes;
    private Random random;
    private Button exit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        quoteTextView = findViewById(R.id.quoteTextView);
        exit = findViewById(R.id.exit);
        Button generateButton = findViewById(R.id.generateButton);


        // Array of sample quotes (you can replace these with your quotes)
        quotes = getResources().getStringArray(R.array.quotes);
        random = new Random();

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateQuote();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void generateQuote() {
        int randomIndex = random.nextInt(quotes.length);
        String randomQuote = quotes[randomIndex];
        quoteTextView.setText(randomQuote);
    }


}