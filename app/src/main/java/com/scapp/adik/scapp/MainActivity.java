package com.scapp.adik.scapp;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.scapp.adik.scapp.adapter.JadwalAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    Toolbar toolbar;
    SearchView searchView;
    BottomNavigationView bottomNavigationView;
    List<Jadwal> jadwalList = new ArrayList<>();
    RecyclerView recyclerView;
    JadwalAdapter jadwalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        toolbar.inflateMenu(R.menu.toolbar_menu);

        toolbar.setOnMenuItemClickListener(this);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        searchView = (SearchView)findViewById(R.id.cari_makul);

        recyclerView = (RecyclerView)findViewById(R.id.recycler);

        jadwalAdapter = new JadwalAdapter(jadwalList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(jadwalAdapter);

        dataJadwal();

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNavigationView.setSelectedItemId(R.id.hari_ini);


    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_notifikasi:
                Toast.makeText(this, "Notifikasi",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, NotifikasiActivity.class);
                startActivity(intent);
                return true;
        }
        return true;
    }

    private void dataJadwal(){
        Jadwal jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.mipmap.ava_arap, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);

    }
}
