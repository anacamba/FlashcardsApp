package com.example.anacambaflashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);


        findViewById(R.id.flashcard_cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivity(intent);
                finish();

                Intent i = new Intent(AddCardActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        findViewById(R.id.flashcard_save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent data = new Intent();

                String inputQuestion = ((EditText) findViewById(R.id.question_text)).getText().toString();
                String inputAnswer = ((EditText) findViewById(R.id.answer_text)).getText().toString();

                data.putExtra("QUESTION_KEY", inputQuestion);
                data.putExtra("ANSWER_KEY", inputAnswer);
                setResult(RESULT_OK, data);
                finish();

                Intent i = new Intent(AddCardActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);

            }
        });

        flashcardDatabase = new FlashcardDatabase(getApplicationContext());

    }
    FlashcardDatabase flashcardDatabase;
}