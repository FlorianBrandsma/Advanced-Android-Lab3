package advanced.android.eggtimer;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Intent intent = getIntent();
        Integer seconds = intent.getIntExtra(MainActivity.SECONDS, 0);

        textView = findViewById(R.id.time_left_text);
        textView.setText(seconds.toString());

        startTimer(seconds);
    }

    private void startTimer(Integer seconds){

        new CountDownTimer(seconds * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                finish();
            }
        }.start();
    }
}
