package net.bartzdev.irank.repository.user;

import net.bartzdev.irank.repository.data.Record;
import net.bartzdev.irank.repository.sql.SQLRepository;
import net.bartzdev.irank.user.OfflineUser;
import org.apache.commons.lang.StringUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class OfflineUserSQLRepository extends SQLRepository<OfflineUser> implements OfflineUserRepository {
    private Connection connection = this.database.getConnection();

    @Override
    public void save(OfflineUser offlineUser) throws SQLException {
        Record record = offlineUser.serialize(new Record(offlineUser.getId()));
        List<Object> values = new ArrayList(record.values());
        PreparedStatement ps = super.createStatement("INSERT INTO iRank_Users VALUES (", values.size(), ");");
        for (int i = 0; i < values.size(); i++) {
            ps.setObject(i, values.get(i));
        }
        ps.executeUpdate();
    }

    @Override
    public void delete(OfflineUser offlineUser) {

    }

    @Override
    public void update(OfflineUser offlineUser) {

    }

    @Override
    public Record query(OfflineUser offlineUser) {
        return null;
    }

    @Override
    public void queryByPlayerName(String playerName, String query) {

    }

    @Override
    public void queryByUniqueId(UUID uniqueId, String query) {

    }
}
