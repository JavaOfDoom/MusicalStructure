package com.example.joe.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music("Dawn Metropolis", "Anamanaguchi", R.drawable.dawnmetropolis));
        musicList.add(new Music("Endless Fantasy", "Anamanaguchi", R.drawable.endlessfantasy));
        musicList.add(new Music("Space Oddity", "David Bowie", R.drawable.spaceoddity));
        musicList.add(new Music("Aladdin Sane", "David Bowie", R.drawable.aladdinsane));
        musicList.add(new Music("Pin Ups", "David Bowie", R.drawable.pinups));
        musicList.add(new Music("Young Americans", "David Bowie", R.drawable.youngamericans));
        musicList.add(new Music("The Dethalbum", "Dethklok", R.drawable.thedethalbum));
        musicList.add(new Music("Dethalbum II", "Dethklok", R.drawable.dethalbum2));
        musicList.add(new Music("Dethalbum III", "Dethklok", R.drawable.dethalbum3));
        musicList.add(new Music("A Night at the Opera", "Queen", R.drawable.anightattheopera));
        musicList.add(new Music("News of the World", "Queen", R.drawable.newsoftheworld));
        musicList.add(new Music("Flash Gordon", "Queen", R.drawable.flashgordon));
        musicList.add(new Music("Hot Space", "Queen", R.drawable.hotspace));
        musicList.add(new Music("Fly by Night", "Rush", R.drawable.flybynight));
        musicList.add(new Music("Hemispheres", "Rush", R.drawable.hemispheres));
        musicList.add(new Music("Permanent Waves", "Rush", R.drawable.permanentwaves));
        musicList.add(new Music("Speak Now", "Taylor Swift", R.drawable.speaknow));
        musicList.add(new Music("Red", "Taylor Swift", R.drawable.red));
        musicList.add(new Music("Reputation", "Taylor Swift", R.drawable.reputation));

        MusicAdapter adapter = new MusicAdapter(this, musicList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
