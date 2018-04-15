package net.bartzdev.irank.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.util.StringUtil;

public class StringUtils {

    private StringUtils(){}

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String fixedColors(String text) {
        if (!text.isEmpty()) {
            return ChatColor.translateAlternateColorCodes('&', text);
        }
        return "";
    }

    public static boolean message(CommandSender sender, String message) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        return true;
    }
}
