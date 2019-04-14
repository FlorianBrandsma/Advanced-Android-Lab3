package advanced.android.zoo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    ImageView topLeft;
    ImageView topRight;
    ImageView bottomLeft;
    ImageView bottomRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topLeft = (ImageView) findViewById(R.id.top_left);
        topRight = (ImageView) findViewById(R.id.top_right);
        bottomLeft = (ImageView) findViewById(R.id.bottom_left);
        bottomRight = (ImageView) findViewById(R.id.bottom_right);

        setMammals();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mammals:
                setMammals();
                return true;
            case R.id.birds:
                setBirds();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setMammals(){

        topLeft.setImageResource(R.drawable.bear);
        topRight.setImageResource(R.drawable.wolf);
        bottomLeft.setImageResource(R.drawable.elephant);
        bottomRight.setImageResource(R.drawable.lamb);

        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.bear);
                mediaPlayer.start();
            }
        });

        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wolf);
                mediaPlayer.start();
            }
        });

        bottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.elephant);
                mediaPlayer.start();
            }
        });

        bottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lamb);
                mediaPlayer.start();
            }
        });
    }

    private void setBirds(){

        topLeft.setImageResource(R.drawable.huuhkaja);
        topRight.setImageResource(R.drawable.peippo);
        bottomLeft.setImageResource(R.drawable.peukaloinen);
        bottomRight.setImageResource(R.drawable.punatulkku);

        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
        });

        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
        });

        bottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        });

        bottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
        });
    }
}
