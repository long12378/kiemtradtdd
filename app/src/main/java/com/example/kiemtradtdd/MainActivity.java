package com.example.kiemtradtdd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<congty> arrct;
    congtyadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        adapter = new congtyadapter(this,R.layout.listitem,arrct);
        lv.setAdapter(adapter);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                congty ct = (congty)arrct.get(position);
                showDe(ct);
                return true;
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                congty ct = (congty)arrct.get(i);
                //Toast.makeText(MainActivity.this, pp.getSdt(), Toast.LENGTH_SHORT).show();*/
                Intent myIntent=new Intent(MainActivity.this,  profile.class);
                myIntent.putExtra("name",ct.getTen());
                myIntent.putExtra("chuthich",ct.getChuthich());
                myIntent.putExtra("tich",ct.getTich());
                myIntent.putExtra("hinhanh", ct.getAnh());
                startActivity(myIntent);
            }
        });
    }
    public void anhxa(){
        lv = (ListView) findViewById(R.id.lv);
        arrct = new ArrayList<>();
        arrct.add(new congty(R.drawable.vinmart,"Vinmart","sản phẩm đa dạng, vận chuyển miễn phí","tích 5%"));
        arrct.add(new congty(R.drawable.meiji,"Meiji","Nhãn hiệu bán chạy sô 1 Nhật Bản","tích 5%"));
        arrct.add(new congty(R.drawable.bactom,"Bác Tôm","Thức phẩm sạch, đặc sản nông thôn","tích 5%"));
    }
    public void showDe(final congty name)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Bạn có muốn xóa không");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrct.remove(name);
                adapter.notifyDataSetChanged();
                dialogInterface.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}