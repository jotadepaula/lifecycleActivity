package com.jota.ActivityState;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by jota on 05/01/14.
 */
public class OpenWindow extends CicloVidaActivity implements View.OnClickListener {
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        Button btn = new Button(this);
        btn.setText("Clicque aqui Para Ir pra outra Tela");
        btn.setOnClickListener(this);
        setContentView(btn);
    }
    public void onClick(View view){
        Intent it = new Intent(this, Win2.class);
        startActivity(it);
    }
}
