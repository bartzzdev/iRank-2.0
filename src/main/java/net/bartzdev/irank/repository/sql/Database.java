package net.bartzdev.irank.repository.sql;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;

public abstract class Database {
    private ExecutorService executor;

    public abstract void connect();

    public abstract void disconnect();

    public abstract Connection getConnection();

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public void setExecutor(ExecutorService executor) {
        this.executor = executor;
    }
}
