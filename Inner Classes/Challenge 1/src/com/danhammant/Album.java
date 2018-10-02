package com.danhammant;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSong(Song song) {
        songList.addSong(song);
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        Song song = songList.findSong(index);

        if (song == null) {
            System.out.println("This album doesn't have track number " + trackNumber);
            return false;
        } else {
            playList.add(song);
            return true;
        }
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public void addSong(Song song) {
            if (findSong(song)) {
                System.out.println("Song already in album");
                return;
            }

            songs.add(song);
        }

        public boolean findSong(Song song) {
            for (Song checked : this.songs) {
                if (checked == song) {
                    return true;
                }
            }

            return false;
        }

        public Song findSong(int trackNumber) {
            if (trackNumber >= 0 && trackNumber < songs.size()) {
                return songs.get(trackNumber);
            } else {
                return null;
            }
        }
    }

}
