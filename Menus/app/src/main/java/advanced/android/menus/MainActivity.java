package advanced.android.menus;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.colour_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.red:
                changeColour(Color.RED, "RED");
                return true;
            case R.id.green:
                changeColour(Color.GREEN, "GREEN");
                return true;
            case R.id.blue:
                changeColour(Color.BLUE, "BLUE");
                return true;
            case R.id.yellow:
                changeColour(Color.YELLOW, "YELLOW");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void changeColour(Integer colour, String strColour)
    {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        constraintLayout.setBackgroundColor(colour);

        TextView textView = findViewById(R.id.colour_text);
        textView.setText(strColour);
    }
}
