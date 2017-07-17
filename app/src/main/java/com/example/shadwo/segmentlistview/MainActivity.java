package com.example.shadwo.segmentlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    private ListView lvCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCountry = (ListView) findViewById(R.id.lvCountry);

        final ArrayList<Item> countryList = new ArrayList<Item>();
        // Header
        countryList.add(new SectionItem("Asia"));
        // State Name
        countryList.add(new EntryItem("India", "o"));
        countryList.add(new EntryItem("China", "o"));
        countryList.add(new EntryItem("Hong Kong", "o"));
        countryList.add(new EntryItem("Nepal", "o"));

        // Header
        countryList.add(new SectionItem("North Asia"));
        // State Name
        countryList.add(new EntryItem("Belarus", "o"));
        countryList.add(new EntryItem("Moldova", "o"));
        countryList.add(new EntryItem("Russian Federation", "o"));
        countryList.add(new EntryItem("Ukraine", "o"));

        // Header
        countryList.add(new SectionItem("North America"));
        // State Name
        countryList.add(new EntryItem("Canada", "o"));
        countryList.add(new EntryItem("Saint Pierre and Miquelon", "o"));
        countryList.add(new EntryItem("United States", "o"));

        // Header
        countryList.add(new SectionItem("North & Central America"));
        // State Name
        countryList.add(new EntryItem("Caribbean Islands", "o"));
        countryList.add(new EntryItem("Anguilla", "o"));
        countryList.add(new EntryItem("Antigua and Barbuda", "o"));
        countryList.add(new EntryItem("Aruba", "o"));

        final CountryAdapter adapter = new CountryAdapter(this, countryList);
        lvCountry.setAdapter(adapter);
        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(countryList.get(i).isSection()){
                    Toast.makeText(getApplicationContext(),"it is section:"+String.valueOf(i),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"it is object:"+String.valueOf(i),Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
