package com.sample.kokou;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private TimeView timeView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        timeView = (TimeView)findViewById(R.id.currentTimeView);
    }
    
    public void setCurrentTime(View v) {
        timeView.setTime(System.currentTimeMillis());
    }
}