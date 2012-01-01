package com.sample.kokou;


import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

public class TimeView extends TextView {
    private long time;
    private SimpleDateFormat df;

    public TimeView(Context context) {
        this(context, null, 0);
    }

    public TimeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TimeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        time = 0;
        df = new SimpleDateFormat("HH:mm:ss");
    }
    
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Date date = new Date(time);
        setText(df.format(date));
    }
    
    public void setTime(long time) {
        if ( time >= 0 ) this.time = time;
        invalidate();
    }
    
    public long getTime() { return time; }
}
