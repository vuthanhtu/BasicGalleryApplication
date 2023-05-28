package com.example.galleryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridViewAnh;
    ArrayList<HinhAnh> listHinhAnh;
    HinhAnhAdapter hinhAnhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        hinhAnhAdapter = new HinhAnhAdapter(this,R.layout.dong_hinh_anh,listHinhAnh);
        gridViewAnh.setAdapter(hinhAnhAdapter);
        gridViewAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,listHinhAnh.get(i).getTen(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void AnhXa(){
        gridViewAnh = (GridView) findViewById(R.id.gridviewAnh);
        listHinhAnh = new ArrayList<>();
        listHinhAnh.add(new HinhAnh("Hình ảnh 1",R.drawable.anh1));
        listHinhAnh.add(new HinhAnh("Hình ảnh 2",R.drawable.anh2));
        listHinhAnh.add(new HinhAnh("Hình ảnh 3",R.drawable.anh3));
    }

}