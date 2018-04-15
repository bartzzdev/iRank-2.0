package net.bartzdev.irank.user;

import net.bartzdev.irank.repository.data.Data;
import net.bartzdev.irank.repository.data.Record;

import java.util.UUID;

public class OfflineUser extends User implements Data {

    private long id;
    private long lastPlayed;

    public OfflineUser(long id, UUID uniqueId, String playerName) {
        super(uniqueId, playerName);
        this.id = id;
    }

    @Override
    public Record serialize(Record record) {
        record.put("uniqueId", this.getUniqueId());
        record.put("playerName", this.getPlayerName());
        record.put("points", this.getPoints());
        record.put("kills", this.getKills());
        record.put("deaths", this.getDeaths());
        record.put("winStreak", this.getWinStreak());
        record.put("lastPlayed", this.getLastPlayed());
        return Data.super.serialize(record);
    }

    @Override
    public long getId() {
        return this.id;
    }

    public long getLastPlayed() {
        return this.lastPlayed;
    }

    public void setLastPlayed(long lastPlayed) {
        this.lastPlayed = lastPlayed;
    }
}
