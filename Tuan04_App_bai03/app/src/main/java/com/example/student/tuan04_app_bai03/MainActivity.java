package com.example.student.tuan04_app_bai03;

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

public class MainActivity extends AppCompatActivity {

    TextView txtKQ;
    EditText edtTen;
    Button btnNhap;
    ListView list;

    ArrayAdapter<String> adapter;
    ArrayList<String> arrays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.edtTen);
        btnNhap = findViewById(R.id.btnNhap);
        list = findViewById(R.id.listView);

        arrays = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrays);
        list.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtTen.getText().toString();

                arrays.add(ten);
                adapter.notifyDataSetChanged();
            }
        });

        txtKQ = findViewById(R.id.txtKQ);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "position: " + i;
                msg += " ; values: " + adapterView.getItemAtPosition(i).toString();

                txtKQ.setText(msg);
            }
        });
    }
}
