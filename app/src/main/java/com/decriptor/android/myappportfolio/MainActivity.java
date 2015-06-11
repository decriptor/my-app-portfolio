package com.decriptor.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button spotifyButton = (Button) findViewById(R.id.spotify_app);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(spotifyButton.getText());
            }
        });

        final Button scoresButton = (Button) findViewById(R.id.scores_app);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(scoresButton.getText());
            }
        });

        final Button libraryButton = (Button) findViewById(R.id.library_app);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(libraryButton.getText());
            }
        });

        final Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_app);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(buildItBiggerButton.getText());
            }
        });

        final Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader_app);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(xyzReaderButton.getText());
            }
        });

        final Button capstoneButton = (Button) findViewById(R.id.capstone_app);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToastMessage(capstoneButton.getText());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void showToastMessage (final CharSequence buttonName) {
        runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(getApplicationContext(), getToastMessage(buttonName), Toast.LENGTH_SHORT).show();
            }
        });
    }

    String getToastMessage (CharSequence buttonName) {
        return "This button will launch my " + buttonName.toString().toLowerCase();
    }
}
