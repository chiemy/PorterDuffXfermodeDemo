package com.chiemy.demo.xfermodedemo;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
    private XfermodeView xfermodeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xfermodeView = (XfermodeView) findViewById(R.id.xfermodeView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = item.getTitle().toString();
        setTitle(title);
        xfermodeView.setXfermode(PorterDuff.Mode.valueOf(title));
        return super.onOptionsItemSelected(item);
    }
}
