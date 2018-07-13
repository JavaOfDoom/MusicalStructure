package com.example.joe.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> musicList) {
        super(context, 0, musicList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item
            , parent, false);
        }

        Music currentMusicInfo = getItem(position);

        TextView primaryMusicInfo = listItemView.findViewById(R.id.primary_music_info);

        assert currentMusicInfo != null;
        primaryMusicInfo.setText(currentMusicInfo.getPrimaryMusicInfo());

        TextView secondaryMusicInfo = listItemView.findViewById(R.id.secondary_music_info);

        secondaryMusicInfo.setText(currentMusicInfo.getSecondaryMusicInfo());

        ImageView albumCoverId = listItemView.findViewById(R.id.album_art_icon);

        albumCoverId.setImageResource(currentMusicInfo.getAlbumCoverId());

        return listItemView;
    }
}
