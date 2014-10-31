package com.example.expandabletextviewinlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        ListView listview = (ListView) findViewById(R.id.listview);
        ListviewAdapter adapter = new ListviewAdapter(this);
        listview.setAdapter(adapter);
    }
}
