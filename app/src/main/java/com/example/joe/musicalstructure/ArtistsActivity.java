package com.example.joe.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music("Dethklock", "The Dethalbum", R.drawable.thedethalbum));

        MusicAdapter adapter = new MusicAdapter(this, musicList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
