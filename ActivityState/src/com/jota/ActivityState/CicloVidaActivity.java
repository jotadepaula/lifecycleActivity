package com.jota.ActivityState;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CicloVidaActivity extends Activity {
 protected static final String CATEGORIA = "Exemplos";

    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        Log.i(CATEGORIA, getLocalClassName()+ ".onCreate() chamado: " +icicle);
        TextView t = new TextView(this);
        t.setText("Exemplo do Clico de Vida \n Consulte os logs no LogCat.");
        setContentView(t);
    }
    protected void onStart(){
        super.onStart();
        Log.i(CATEGORIA, getLocalClassName()+ ".onStart() chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(CATEGORIA, getLocalClassName()+ ".onRestart() chamado.");
    }
    protected void onResume(){
        super.onResume();
        Log.i(CATEGORIA, getLocalClassName()+ ".onResume() chamado.");
    }
    protected void onPause(){
        super.onPause();
        Log.i(CATEGORIA, getLocalClassName()+ ".onPause() chamado.");
    }
    protected void onStop(){
        super.onStop();
        Log.i(CATEGORIA, getLocalClassName()+ ".onStop() chamado.");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(CATEGORIA, getLocalClassName()+ ".onDestroy() chamado.");
    }
    private String getClassName(){
        //Retorna o nome da Classe sem o Pacote
        String str = getClass().getName();
        return str.substring(str.lastIndexOf("."));
    }
}
