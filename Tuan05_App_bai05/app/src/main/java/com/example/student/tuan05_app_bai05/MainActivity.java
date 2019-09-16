package com.example.student.tuan05_app_bai05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtID, edtTen;
    Button btnNhap;
    RadioGroup radGroup;
    ListView list;

    ArrayList<Employee> arrayEmployee = new ArrayList<>();
    ArrayAdapter<Employee> arrayAdapter;
    Employee employee = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtID = findViewById(R.id.edID);
        edtTen = findViewById(R.id.edtTen);
        btnNhap = findViewById(R.id.btnNhap);
        radGroup = findViewById(R.id.radGroup);
        list = findViewById(R.id.lvList);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayEmployee);
        list.setAdapter(arrayAdapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhap();
            }
        });
    }

    public void nhap() {
        int radId = radGroup.getCheckedRadioButtonId();
        String id = edtID.getText().toString();
        String name = edtTen.getText().toString();

        if(radId == R.id.radCT)
            employee = new EmployeePFullTime();
        else
            employee = new EmployeePartTime();

        employee.setId(id);
        employee.setName(name);

        arrayEmployee.add(employee);
        arrayAdapter.notifyDataSetChanged();
    }

//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//        Employee e = (Employee) getListAdapter().getItem(position);
//        Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
//    }
}
