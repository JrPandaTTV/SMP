package com.jrpanda.SMP;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands(){
        //registerCommand("workbench", new CommandWorkbench());
    }

    public void registerListeners(){
        //registerListener(new PlayerConnection(this));

    }

    private void registerCommand(String name, CommandExecutor cmd){
        this.getCommand(name).setExecutor(cmd);
    }
    private void registerListener(Listener listener){ Bukkit.getServer().getPluginManager().registerEvents(listener, this); }

}
