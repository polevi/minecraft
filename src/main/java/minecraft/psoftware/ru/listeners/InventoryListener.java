package minecraft.psoftware.ru.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if(e.getWhoClicked() instanceof Player) {
            if(e.isRightClick()) {
            var clickedItem = e.getCurrentItem();
                clickedItem.setType(Material.DIAMOND);
                var meta = clickedItem.getItemMeta();
                meta.setDisplayName(ChatColor.AQUA + "DIAMOND");
                clickedItem.setItemMeta(meta);
            }
        }
    }
}
