package com.danhammant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        if (songInAlbum(song)) {
            System.out.println("Song already in album");
            return;
        }

        songs.add(song);
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;

        if (index >= 0 && index < songs.size()) {
            playList.add(songs.get(index));
            return true;
        }

        System.out.println("This album doesn't have track number " + trackNumber);
        return false;
    }

    private boolean songInAlbum(Song song) {
        for (Song checked : this.songs) {
            if (checked == song) {
                return true;
            }
        }

        return false;
    }

}
