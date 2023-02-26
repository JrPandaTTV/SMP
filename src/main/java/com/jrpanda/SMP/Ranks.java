package com.jrpanda.SMP;

import com.jrpanda.Utils.CustomFile;
import com.jrpanda.Utils.Helper;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class Ranks implements CommandExecutor {
    private File file;

    private Main main;
    public Ranks(Main main){
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("rank")){
            if(args.length == 0){
                Helper.send(sender, "&2&l============ Ranks ============");
                Helper.send(sender, "&3&l/rank create <args>");
                Helper.send(sender, "&3&l/rank delete <args>");
                Helper.send(sender, "&3&l/rank edit <args>");
                Helper.send(sender, "&3&l/rank list");
                Helper.send(sender, "&3&l/rank <player> <args>");
                Helper.send(sender, "&3&l/rank promote <player");
                Helper.send(sender, "&3&l/rank demote <player");
                Helper.send(sender, "&2&l===============================");
                return true;
            }
            if(args.length == 1){

                if(args[0].equalsIgnoreCase("list")){


                } else {
                    return Helper.send(sender, "&cUnknown command.");
                }
            }
            if(args.length == 2){

                if(args[0].equalsIgnoreCase("create")){

                }
                if(args[0].equalsIgnoreCase("delete")){

                }
            }
        }

        return true;
    }

}
