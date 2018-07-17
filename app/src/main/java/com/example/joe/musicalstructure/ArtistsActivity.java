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
        musicList.add(new Music("Anamanaguchi", "Electronic", R.drawable.endlessfantasy));
        musicList.add(new Music("David Bowie", "Glam Rock", R.drawable.pinups));
        musicList.add(new Music("Dethklock", "Death Metal", R.drawable.thedethalbum));
        musicList.add(new Music("Queen", "Rock", R.drawable.newsoftheworld));
        musicList.add(new Music("Rush", "Progressive Rock", R.drawable.flashgordon));
        musicList.add(new Music("Taylor Swift", "Pop", R.drawable.reputation));

        MusicAdapter adapter = new MusicAdapter(this, musicList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
