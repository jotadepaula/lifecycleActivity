package com.jota.ActivityState;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jota on 05/01/14.
 */
public class Win2 extends CicloVidaActivity {
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        TextView view = new TextView(this);
        view.setText("Yeye");
        setContentView(view);
    }
}
