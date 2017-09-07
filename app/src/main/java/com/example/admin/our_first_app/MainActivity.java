package com.example.admin.our_first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        final EditText edit = (EditText) findViewById(R.id.edit_text);
        final ListView list_view = (ListView) findViewById(R.id.list_view);
        edit.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_ENTER){
                    list.add(edit.getText().toString());
                    list_view.setAdapter(list);
                    edit.setText("");
                    return true;
                }
                else
                    return false;
            }
        });
    }
}
