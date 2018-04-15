package net.bartzdev.irank.user;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserManager {
    private final Map<UUID, PlayingUser> users = new HashMap<>();

    public PlayingUser createPlayingUserData(UUID uniqueId, String playerName) {
        PlayingUser playingUser = new PlayingUser(uniqueId, playerName);
        playingUser.
        this.users.put(uniqueId, playingUser);
        return playingUser;
    }


}
