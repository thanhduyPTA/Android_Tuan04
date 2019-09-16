package com.example.student.tuan04_app_bai04;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    TextView txtKQ;
    EditText edtTen;
    Button btnNhap;
 //   ListView list;

    ArrayAdapter<String> adapter;
    ArrayList<String> arrays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.edtTen);
        btnNhap = findViewById(R.id.btnNhap);
//        list = findViewById(android.R.id.list);
        txtKQ = findViewById(R.id.txtKQ);

        arrays = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrays);
        setListAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtTen.getText().toString();

                arrays.add(ten);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String item = (String)getListAdapter().getItem(position);
        txtKQ.setText("position: " + position + " ; values: " + item.toString());
    }
}
