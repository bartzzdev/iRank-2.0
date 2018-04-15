package net.bartzdev.irank;

import net.bartzdev.irank.repository.sql.Database;
import net.bartzdev.irank.repository.sql.SQLDatabase;
import org.bukkit.plugin.java.JavaPlugin;

public class IRankPlugin extends JavaPlugin {
    private static IRankPlugin instance;

    private final Database database = new SQLDatabase("localhost", "root", "", "irank_users", 3306);

    @Override
    public void onLoad() {
        IRankPlugin.instance = this;

        this.database.connect();
    }

    public static IRankPlugin getInstance() {
        if (IRankPlugin.instance == null) {
            throw new IllegalStateException("Cannot get iRank instance before invoke onLoad() method.");
        }
        return IRankPlugin.instance;
    }

    public Database getDatabase() {
        return this.database;
    }
}
