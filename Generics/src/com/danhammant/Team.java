package com.danhammant;


public class Team <T> implements Comparable<Team<T>>{
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void win() {
        wins++;
    }

    public void lose() {
        losses++;
    }

    public void tie() {
        ties++;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int ranking() {
        return (wins * 2) + ties;
    }

    @Override
    public String toString() {
        return name + ", Wins: " + wins + ", Ranking, " + ranking();
    }

    @Override
    public int compareTo(Team<T> otherTeam) {
        if (this.ranking() > otherTeam.ranking()) {
            return -1;
        } else if (this.ranking() < otherTeam.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
