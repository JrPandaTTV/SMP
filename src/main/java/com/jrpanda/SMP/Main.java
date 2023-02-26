package com.jrpanda.SMP;

import com.jrpanda.Listeners.ChatListener;
import com.jrpanda.Listeners.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public final class Main extends JavaPlugin {

    private File playerFolder, rankFolder, ranks, rom;
    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();

        playerFolder = new File(getDataFolder(), "PlayerData");
        playerFolder.mkdirs();

        rankFolder = new File(getDataFolder(), "Ranks");
        rankFolder.mkdirs();

        rom = new File(getDataFolder(), "ROM");
        rom.mkdirs();

        ranks = new File("plugins/SMP/Ranks", "ranks.yml");
        if(!ranks.exists()){
            try {
                ranks.createNewFile();
            } catch (IOException e) {
                getServer().getLogger().log(Level.SEVERE, "Can't create ranks.yml");
            }
        }
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands(){
        registerCommand("rank", new Ranks(this));
    }

    public void registerListeners(){
        registerListener(new PlayerConnection(this));
        registerListener(new ChatListener());

    }

    private void registerCommand(String name, CommandExecutor cmd){
        this.getCommand(name).setExecutor(cmd);
    }
    private void registerListener(Listener listener){ Bukkit.getServer().getPluginManager().registerEvents(listener, this); }

}
