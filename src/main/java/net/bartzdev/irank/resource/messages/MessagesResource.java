package net.bartzdev.irank.resource.messages;

import net.bartzdev.irank.IRankPlugin;
import net.bartzdev.irank.resource.Resource;
import net.bartzdev.irank.util.StringUtils;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.lang.reflect.Field;

public class MessagesResource extends Resource {
    private final IRankPlugin plugin = IRankPlugin.getInstance();
    private final Messages messages = new Messages();

    private YamlConfiguration yaml;

    public MessagesResource(File file) {
        super(file);
        this.yaml = super.getYaml();
    }

    @Override
    public void load() {
        Class<?> clazz = messages.getClass();
        for (String s : yaml.getKeys(false)) {
            try {
                Field field = clazz.getDeclaredField(s);
                if (s != null) {
                    field.set(this.messages, StringUtils.fixedColors(yaml.getString(s)));
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void save() {
        //TODO saving default messages to file.
    }
}
