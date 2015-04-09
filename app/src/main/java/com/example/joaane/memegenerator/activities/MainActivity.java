package com.example.joaane.memegenerator.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.joaane.memegenerator.R;
import com.example.joaane.memegenerator.fragments.BottomSectionFragment;
import com.example.joaane.memegenerator.fragments.TopSectionFragment;
import com.example.joaane.memegenerator.fragments.listeners.TopSectionFragmentListener;


public class MainActivity extends Activity implements TopSectionFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //gets called when button in topsectionfragment is clicked
    @Override
    public void createMeme(String top, String bottom) {

        //TopSectionFragment topSectionFragment = (TopSectionFragment) getFragmentManager().findFragmentById(R.id.topFragment);
        BottomSectionFragment bottomSectionFragment = (BottomSectionFragment) getFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomSectionFragment.setMemeText(top, bottom);
    }
}
