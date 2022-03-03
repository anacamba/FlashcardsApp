package com.example.anacambaflashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQuestion = findViewById(R.id.flashcard_question_textview);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer_textview);
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }

            });

        findViewById(R.id.flashcard_answer_textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change back to question flashcard
                ((TextView) findViewById(R.id.flashcard_answer_textview)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.flashcard_question_textview)).setVisibility(View.VISIBLE);
            }
        });


    }
}