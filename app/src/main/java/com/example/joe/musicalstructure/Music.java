package com.example.joe.musicalstructure;

public class Music {

    private String mPrimaryMusicInfo;

    private String mSecondaryMusicInfo;

    private int mAlbumCoverId;

    public Music(String primaryMusicInfo, String secondaryMusicInfo, int albumCoverId) {
        mPrimaryMusicInfo = primaryMusicInfo;
        mSecondaryMusicInfo = secondaryMusicInfo;
        mAlbumCoverId = albumCoverId;
    }

    public String getPrimaryMusicInfo() {
        return mPrimaryMusicInfo;
    }

    public String getSecondaryMusicInfo() {
        return mSecondaryMusicInfo;
    }

    public int getAlbumCoverId() {
        return mAlbumCoverId;
    }
}
