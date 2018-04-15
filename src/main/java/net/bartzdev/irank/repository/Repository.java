package net.bartzdev.irank.repository;

import net.bartzdev.irank.repository.data.Data;
import net.bartzdev.irank.repository.data.Record;

import java.sql.SQLException;

public interface Repository<T extends Data> {

    void save(T t) throws SQLException;

    void delete(T t);

    void update(T t);

    Record query(T t);
}
