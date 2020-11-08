package com.rajendra.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rajendra.vacationtourapp.adapter.RecentsAdapter;
import com.rajendra.vacationtourapp.adapter.TopPlacesAdapter;
import com.rajendra.vacationtourapp.model.RecentsData;
import com.rajendra.vacationtourapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("IMPACT HOTEl","Thailand","From ฿1,499+",R.drawable.bb));
        recentsDataList.add(new RecentsData("OYO HOTEl","Thailand","From ฿448+",R.drawable.oo));
        recentsDataList.add(new RecentsData("IMPACT HOTEl","Thailand","From ฿1,499+",R.drawable.bb));
        recentsDataList.add(new RecentsData("OYO HOTEl","Thailand","From ฿448+",R.drawable.oo));
        recentsDataList.add(new RecentsData("IMPACT HOTEl","Thailand","From ฿1,499+",R.drawable.bb));
        recentsDataList.add(new RecentsData("OYO HOTEl","Thailand","From ฿448+",R.drawable.oo));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("IMPACT HOTEl","Thailand","From ฿1,499 - ฿1,699",R.drawable.bb));
        topPlacesDataList.add(new TopPlacesData("โครงการเราเที่ยวด้วยกัน","Thailand","ส่วนลด 40 %",R.drawable.ty));
        topPlacesDataList.add(new TopPlacesData("IMPACT HOTEl","Thailand","From ฿1,499 - ฿1,699",R.drawable.bb));
        topPlacesDataList.add(new TopPlacesData("โครงการเราเที่ยวด้วยกัน","Thailand","ส่วนลด 40 %",R.drawable.ty));


        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

    // Hi all, today we are going to make a holiday tour app.
    // so lets see i will show you what we are going to build
    // so lets get started.
    // before getting started make sure to subscribe and hit the bell i con to get notified
    // everytime i post a video.
    // lets first import image assets
    // Now we will add a recycler view for recents data.
    // lets make a model class first.
    // now we create a adapter class for holding data
    // our adapter class is ready now we will setup recyclerview

    // So we have setup recents items recyclerview
    //Now we do same setup for top places
    // lets do it fast.
    // Now i will add a bottom navigation
    // now we will set the details activity
    // when user click on any of places details activity will open
    // So this app is done.
    // Please like share and subscribe
    // if any question plz do comment
    // Thanks for watching see you in the next tutorial

}
