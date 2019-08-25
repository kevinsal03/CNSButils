package me.kevsal.minecraft.cnsbutils;

        import org.bukkit.Bukkit;
        import org.bukkit.plugin.java.JavaPlugin;

public class CNSButils extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getLogger().info("Enabling ClubNetwork Skyblock Utilities by Kevinsal03 (Kevinjss1)");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("CNSB Utils Disabled!");
    }

}
