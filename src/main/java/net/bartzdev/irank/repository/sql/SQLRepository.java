package net.bartzdev.irank.repository.sql;

import net.bartzdev.irank.IRankPlugin;
import net.bartzdev.irank.repository.Repository;
import net.bartzdev.irank.repository.data.Data;
import net.bartzdev.irank.repository.data.Record;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class SQLRepository<T extends Data> implements Repository<T> {
    protected SQLDatabase database = (SQLDatabase) IRankPlugin.getInstance().getDatabase();

    @Override
    public abstract void save(T t) throws SQLException;

    @Override
    public abstract void delete(T t);

    @Override
    public abstract void update(T t);

    @Override
    public abstract Record query(T t);

    protected PreparedStatement createStatement(String prefix, int columnCount, String suffix) throws SQLException {
        StringBuilder builder = new StringBuilder().append(prefix);
        for (int i = 0; i < columnCount; i++) {
            builder.append("?");
            if (i < columnCount-1) {
                builder.append(", ");
            }
        }

        builder.append(suffix);
        return this.database.getConnection().prepareStatement(builder.toString());
    }
}
