package advanced.android.eggtimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String SECONDS = "Might as well be empty";

    EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.start_button);
        editText = (EditText) findViewById(R.id.edit_text);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText.getText().toString().length() > 0)
                    startTimer(view);
            }
        });
    }

    public void startTimer(View view) {

        Intent intent = new Intent(this, TimerActivity.class);

        Integer seconds = Integer.parseInt(editText.getText().toString());
        intent.putExtra(SECONDS, seconds);
        startActivity(intent);
    }
}
