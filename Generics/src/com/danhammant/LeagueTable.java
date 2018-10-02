package com.danhammant;

import java.util.ArrayList;
import java.util.Collections;


public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public LeagueTable(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public boolean addTeam(T team) {
        if (!teams.contains(team)) {
            teams.add(team);
            System.out.println(team.getName() + " added");
            return true;
        } else {
            System.out.println(team.getName() + " already in league");
            return false;
        }
    }

    public void matchResults(T firstTeam, int firstScore, T secondTeam, int secondScore) {
        String beat = " beat ";
        String firstTeamName = firstTeam.getName();
        String secondTeamName = secondTeam.getName();

        if (firstScore > secondScore) {
            firstTeam.win();
            secondTeam.lose();
            System.out.println(firstTeamName + beat + secondTeamName);
        } else if (firstScore < secondScore) {
            firstTeam.lose();
            secondTeam.win();
            System.out.println(secondTeamName + beat + firstTeamName);
        } else {
            firstTeam.tie();
            secondTeam.tie();
            System.out.println(firstTeamName + " tied with " + secondTeamName);
        }
    }

    public void printLeague() {
        Collections.sort(teams);

        System.out.println();
        System.out.println("===============");
        System.out.println();

        for (Team team : teams) {
            System.out.println(team);
        }

        System.out.println();
        System.out.println("===============");
    }


}
