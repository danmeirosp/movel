package br.edu.utfpr.danielproenca.games;

import java.io.Serializable;

public class RegisterSoccer implements Serializable {

    private String team;
    private int goals;
    private int rounds;

    public RegisterSoccer(String team, int goals, int rounds){
        setNickname(team);
        setGoalsl(goals);
        setRounds(rounds);
    }

    public String getNickname() {
        return team;
    }

    public void setNickname(String nickname) {
        this.team = nickname;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoalsl(int goals) {
        this.goals = goals;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }


    @Override
    public String toString() {
        return "Name: " + team + "\n"
                + "Level: " + goals + "\n"
                + "Rounds: " + rounds;
    }
}
