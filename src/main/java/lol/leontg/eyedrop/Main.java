package lol.leontg.eyedrop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of the plugin.
 *
 * @author LeonTG
 */
public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void on(PlayerDeathEvent event) {
                event.getDrops().add(new ItemStack(Material.ENDER_EYE));
            }
        }, this);
    }
}
