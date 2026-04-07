package minecraft.psoftware.ru;

import org.bukkit.plugin.java.JavaPlugin;

import minecraft.psoftware.ru.commands.CommandKit;

/**
 * Hello world!
 */
public class TutorialPlugin extends JavaPlugin  {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("kit").setExecutor(new CommandKit());
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
