package com.github.jackkell.datebook.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.jackkell.datebook.R;
import com.github.jackkell.datebook.adapter.DateCardRecyclerViewAdapter;
import com.github.jackkell.datebook.dataobject.RomanticDate;

import java.util.ArrayList;
import java.util.List;

public class DateSelectActivity extends AppCompatActivity {

    private static String TAG = "CardViewActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView dateList = (RecyclerView) findViewById(R.id.rvDateList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        dateList.setLayoutManager(linearLayoutManager);

        List<RomanticDate> dates = new ArrayList<>();
        RomanticDate romanticDate = new RomanticDate("Movies", "Go see star wars right now.", "Fun", "2 hours", "20 dollars", "Car");
        dates.add(romanticDate);

        for (int i = 0; i < 20; i++) {
            romanticDate = new RomanticDate("Title", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting.", "Type", "Time", "Cost", "Needs");
            dates.add(romanticDate);
        }

        DateCardRecyclerViewAdapter dateCardRecyclerViewAdapter = new DateCardRecyclerViewAdapter(dates);
        dateList.setAdapter(dateCardRecyclerViewAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
