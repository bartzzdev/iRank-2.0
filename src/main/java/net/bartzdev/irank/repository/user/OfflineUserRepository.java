package net.bartzdev.irank.repository.user;

import net.bartzdev.irank.repository.Repository;
import net.bartzdev.irank.repository.sql.SQLRepository;
import net.bartzdev.irank.user.OfflineUser;

import java.util.UUID;

public interface OfflineUserRepository extends Repository<OfflineUser> {

    void queryByPlayerName(String playerName, String query);

    void queryByUniqueId(UUID uniqueId, String query);
}
