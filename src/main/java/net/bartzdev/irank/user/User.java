package net.bartzdev.irank.user;

import net.bartzdev.irank.repository.data.Data;
import net.bartzdev.irank.repository.data.Record;

import java.util.UUID;

public class User extends Record {

    private final UUID uniqueId;
    private final String playerName;

    private int points;
    private int kills;
    private int deaths;
    private int winStreak;

    public User(UUID uniqueId, String playerName) {
        this.uniqueId = uniqueId;
        this.playerName = playerName;
    }

    public UUID getUniqueId() {
        return this.uniqueId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getKills() {
        return this.kills;
    }

    public void setKills() {
        this.kills = kills;
    }

    public int getDeaths() {
        return this.deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getWinStreak() {
        return this.winStreak;
    }

    public void setWinStreak(int winStreak) {
        this.winStreak = winStreak;
    }
}
