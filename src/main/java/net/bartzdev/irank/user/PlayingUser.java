package net.bartzdev.irank.user;

import net.bartzdev.irank.repository.data.Record;

import java.util.UUID;

//in memory
public class PlayingUser extends User {

    private String lastOpponent;

    public PlayingUser(UUID uniqueId, String playerName) {
        super(uniqueId, playerName);
    }

    public String getLastOpponent() {
        return this.lastOpponent;
    }

    public void setLastOpponent(String lastOpponent) {
        this.lastOpponent = lastOpponent;
    }
}
