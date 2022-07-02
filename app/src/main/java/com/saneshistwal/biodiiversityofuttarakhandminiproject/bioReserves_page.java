package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bioReserves_page extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_reserves_page);
        lv = findViewById(R.id.listViewBioReserveValue);
        List<String> list=new ArrayList<>();

        Collections.addAll(list,"Jim Corbett National Park",
                "Rajaji National Park",
                "Gangotri National Park",
                "Govind Pashu Vihar National park",
                "Nanda Devi National Park",
                "Valley of flowers national park",
                "Askot musk deer sanctuary",
                "Pawalgarh Conservation Reserve",
                "Jhilmil conservation reserve",
                "Kedarnath Wildlife Sanctuary",
                "Binsar Wildlife Sanctuary",
                "Benog Mountain Quail Wildlife SanctuaryBenog",
                "Nandhaur Wildlife Sanctuary",
                "Sonanadi Wildlife Sanctuary");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);

        lv.setAdapter(arrayAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Jim corbett National park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://www.corbettnationalpark.in/");
                }
                else if(i==1)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Rajaji National Park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://www.rajajinationalpark.co.in/");
                }
                else if(i==2)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Gangotri National Park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.m.wikipedia.org/wiki/Gangotri_National_Park");
                }
                else if(i==3)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Govind Pashu Vihar National Park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.m.wikipedia.org/wiki/Govind_Pashu_Vihar_National_Park");
                }
                else if(i==4)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Nanda Devi National Park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.m.wikipedia.org/wiki/Nanda_Devi_National_Park");
                }
                else if(i==5)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Valley of flowers park", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.m.wikipedia.org/wiki/Valley_of_Flowers_National_Park");
                }
                else if(i==6)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Askot musk deer sanctuary", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.wikipedia.org/wiki/Askot_Musk_Deer_Sanctuary#:~:text=Askot%20Musk%20Deer%20Sanctuary%20is,to%20conserve%20this%20rare%20species.");
                }
                else if(i==7)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Pawalgarh Conservation Reserve", Toast.LENGTH_SHORT).show();
                    gotoUrl("http://www.pawalgarh.org/about-pawalgarh.html");
                }
                else if(i==8)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Jhilmil conservation reserve", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://jhilmil.in/");
                }
                else if(i==9)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Kedarnath Wildlife Sanctuary", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.wikipedia.org/wiki/Kedarnath_Wildlife_Sanctuary");
                }
                else if(i==10)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Binsar Wildlife Sanctuary", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.wikipedia.org/wiki/Binsar_Wildlife_Sanctuary");
                }
                else if(i==11)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Benog Mountain Quail Wildlife SanctuaryBenog", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.wikipedia.org/wiki/Mussoorie");
                }
                else if(i==12)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Nandhaur Wildlife Sanctuary", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://en.wikipedia.org/wiki/Nandhaur_Wildlife_Sanctuary/");
                }
                else if(i==13)
                {
                    Toast.makeText(bioReserves_page.this, "Directing you to information about Sonanadi Wildlife Sanctuary", Toast.LENGTH_SHORT).show();
                    gotoUrl("https://www.jimcorbettjunglesafari.com/sonanadi-wildlife-sanctury.php");
                }

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}