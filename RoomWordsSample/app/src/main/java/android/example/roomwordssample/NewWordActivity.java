package android.example.roomwordssample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.roomwordssample.REPLY";
    public static final String EXTRA_REPLY_ID = "com.example.android.roomwordssample.REPLY_ID";

    private EditText mEditWordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        mEditWordView = findViewById(R.id.edit_word);

        final Bundle extras = getIntent().getExtras();
        // If we are passed content, fill it in for the user to edit.
        if (extras != null) {
            String word = extras.getString(MainActivity.EXTRA_DATA_UPDATE_WORD, "");
            if(!word.isEmpty()) {
                mEditWordView.setText(word);
                mEditWordView.setSelection(word.length());
                mEditWordView.requestFocus();
            }
        } // Otherwise, start with empty fields.

        final Button button = findViewById(R.id.button_save);
        // When the user presses the Save button, create a new Intent for the reply.
        // THe reply Intent will be sent back to the calling activity (in this case, MainActivity).
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditWordView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String word = mEditWordView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    if (extras != null && extras.containsKey(MainActivity.EXTRA_DATA_ID)) {
                        int id = extras.getInt(MainActivity.EXTRA_DATA_ID, -1);
                        if (id != -1) { replyIntent.putExtra(EXTRA_REPLY_ID, id); }
                    }
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}
