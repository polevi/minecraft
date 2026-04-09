package minecraft.psoftware.ru.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandKit implements CommandExecutor  {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setDisplayName(ChatColor.RED + "Magic sword");
            ArrayList<String> swordDescription = new ArrayList<>();
            swordDescription.add("Adds knockback");
            swordMeta.setLore(swordDescription);
            swordMeta.addEnchant(Enchantment.KNOCKBACK, 1000, true);
            sword.setItemMeta(swordMeta);
            player.getInventory().addItem(sword);
        }

        return true;
    }
}
