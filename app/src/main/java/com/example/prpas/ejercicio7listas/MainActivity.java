
package com.example.prpas.ejercicio7listas;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter la = crearAdapter();
        setListAdapter(la);
    }

    protected ListAdapter crearAdapter() {
        String[] s = new String[]{
                "Elemento1",
                "Elemento2",
                "Elemento3"
        };
        ListAdapter la2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, s);
        return la2;
    }
}
