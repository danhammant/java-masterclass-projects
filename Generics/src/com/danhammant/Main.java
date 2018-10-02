package com.danhammant;


public class Main {
    public static void main(String[] args) {
        LeagueTable<FootballTeam> premierLeague = new LeagueTable<>("Premier League");

        FootballTeam manU = new FootballTeam("Manchester Utd.");
        FootballTeam manCity = new FootballTeam("Manchester City");
        FootballTeam astonVilla = new FootballTeam("Aston Villa");
        FootballTeam tottenham = new FootballTeam("Tottenham");
        FootballTeam arsenal = new FootballTeam("Arsenal");

        premierLeague.addTeam(manU);
        premierLeague.addTeam(manCity);
        premierLeague.addTeam(astonVilla);
        premierLeague.addTeam(tottenham);
        premierLeague.addTeam(arsenal);

        


        premierLeague.matchResults(arsenal, 2, astonVilla, 1);
        premierLeague.matchResults(manCity, 2, manU, 1);
        premierLeague.matchResults(tottenham, 1, manCity, 1);
        premierLeague.matchResults(arsenal, 2, manU, 7);
        premierLeague.matchResults(astonVilla, 5, manCity, 5);
        premierLeague.matchResults(arsenal, 2, tottenham, 1);

        premierLeague.printLeague();


    }
}
