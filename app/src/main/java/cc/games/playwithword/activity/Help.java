package cc.games.playwithword.activity;

import android.os.Bundle;

import android.view.MenuItem;
import cc.games.playwithword.R;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by chanpreet on 4/11/16.
 */

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
