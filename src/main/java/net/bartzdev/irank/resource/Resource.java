package net.bartzdev.irank.resource;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public abstract class Resource {

    private final File file;

    public Resource(File file) {
        this.file = file;
    }

    public YamlConfiguration getYaml() {
        return YamlConfiguration.loadConfiguration(this.file);
    }

    public abstract void load();

    public abstract void save();
}
