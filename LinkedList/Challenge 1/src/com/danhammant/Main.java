package com.danhammant;


import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album smiths = new Album("The Smiths", "The Smiths");
        smiths.addSong(new Song("Reel Around the Fountain", 5.56));
        smiths.addSong(new Song("You've Got Everything Now", 3.59));
        smiths.addSong(new Song("Miserable Lie", 4.27));
        smiths.addSong(new Song("Pretty Girls Make Graves", 3.43));
        smiths.addSong(new Song("The Hand That Rocks the Cradle", 4.38));
        smiths.addSong(new Song("This Charming Man", 2.43));
        smiths.addSong(new Song("Still Ill", 3.20));
        smiths.addSong(new Song("Hand in Glove", 3.22));
        smiths.addSong(new Song("What Difference Does it Make", 3.49));
        smiths.addSong(new Song("I Don't Owe You Anything", 4.04));
        smiths.addSong(new Song("Suffer Little Children", 5.30));

        albums.add(smiths);

        Album pattiSmith = new Album("Horses", "Patti Smith");
        pattiSmith.addSong(new Song("Gloria", 5.57));
        pattiSmith.addSong(new Song("Redondo Beach", 3.26));
        pattiSmith.addSong(new Song("Birdland", 9.15));
        pattiSmith.addSong(new Song("Free Money", 3.52));
        pattiSmith.addSong(new Song("Kimberly", 4.27));
        pattiSmith.addSong(new Song("Break It Up", 4.04));
        pattiSmith.addSong(new Song("Land", 9.25));
        pattiSmith.addSong(new Song("Elegie", 2.56));
        pattiSmith.addSong(new Song("My Generation", 3.16));

        albums.add(pattiSmith);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addSongToPlaylist(5, playlist);
        albums.get(0).addSongToPlaylist(7, playlist);
        albums.get(1).addSongToPlaylist(5, playlist);
        albums.get(1).addSongToPlaylist(8, playlist);
        albums.get(0).addSongToPlaylist(22, playlist);
        albums.get(0).addSongToPlaylist(1, playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner reader = new Scanner(System.in);
        ListIterator<Song> iterator = playlist.listIterator();
        boolean quit = false;
        boolean forward = true;

        if (playlist.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next());
        }

        printMenu();

        while(!quit) {
            int action = reader.nextInt();
            reader.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Exiting playlist");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }

                    if(iterator.hasNext()) {
                        System.out.println("Now playing " + iterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist");
                    }
                    break;

                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println("Now playing " + iterator.previous());
                    } else {
                        System.out.println("Reached the start of the playlist");
                    }
                    break;

                case 3:
                    if (forward) {
                        System.out.println("Now playing " + iterator.previous());
                        forward = false;
                    } else {
                        System.out.println("Now playing " + iterator.next());
                        forward = true;
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (!playlist.isEmpty()) {
                        iterator.remove();

                        if (iterator.hasNext()) {
                            System.out.println("Now playing " + iterator.next());
                        } else if (iterator.hasPrevious()) {
                            System.out.println("Now playing " + iterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator iterator = playlist.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printMenu() {
        System.out.println("0. Quit\n" +
                            "1. Next track\n" +
                            "2. Previous track\n" +
                            "3. Repeat track\n" +
                            "4. Print playlist\n" +
                            "5. Print menu\n" +
                            "6. Remove current track");
    }
}
