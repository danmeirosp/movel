package br.edu.utfpr.danielproenca.games;

import java.io.Serializable;

public class RegisterPubg implements Serializable {

    private String nickname;
    private int level;
    private int rounds;
    private int slaughter;

    public RegisterPubg(String nickname, int level, int rounds, int slaughter){
        setNickname(nickname);
        setLevel(level);
        setRounds(rounds);
        setSlaughter(slaughter);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getSlaughter() {
        return slaughter;
    }

    public void setSlaughter(int slaughter) {
        this.slaughter = slaughter;
    }

    @Override
    public String toString() {
        return "Name: " + nickname + "\n"
                + "Level: " + level + "\n"
                + "Rounds: " + rounds + "\n"
                + "Slaughter: " + slaughter;
    }
}
