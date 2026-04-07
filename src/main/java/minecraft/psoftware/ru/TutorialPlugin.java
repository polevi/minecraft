package minecraft.psoftware.ru;

import org.bukkit.plugin.java.JavaPlugin;

import minecraft.psoftware.ru.commands.CommandKit;
import minecraft.psoftware.ru.listeners.PlayerJoinListener;

/**
 * Hello world!
 */
public class TutorialPlugin extends JavaPlugin  {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

        System.out.println("Hehe");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
