package com.example.sourabh.customviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] HeadingNames={"Dog1","Dog2","Dog3","Dog4","Dog5","Dog6","Dog7","Dog8"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(new CustomAdapter(this,HeadingNames));
    }
}
