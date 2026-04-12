package minecraft.psoftware.ru;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.event.PacketListenerPriority;

import minecraft.psoftware.ru.commands.CommandKit;
import minecraft.psoftware.ru.listeners.InventoryListener;
import minecraft.psoftware.ru.listeners.PacketEventsPacketListener;
import minecraft.psoftware.ru.listeners.PlayerJoinListener;

public class TutorialPlugin extends JavaPlugin  {

    @Override
    public void onLoad() {
        PacketEvents.getAPI().getEventManager().registerListener(new PacketEventsPacketListener(),
                PacketListenerPriority.NORMAL);
    }

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        this.getServer().getPluginManager().registerEvents(new InventoryListener(), this);
    }
    
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
