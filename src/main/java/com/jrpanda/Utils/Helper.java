package com.jrpanda.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Helper {
    public static boolean send(CommandSender sender, String msg){
        sender.sendMessage(Helper.toColor(msg));
        return true;
    }
    public static String toColor(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static Inventory createInventory(int size, String name){ return Bukkit.createInventory(null, size, toColor(name)); }

    public static void fillBorders(Inventory inv, ItemStack border){
        ItemStack item = border;
        int size = inv.getSize();
        for(int i=0; i<size; i++){inv.setItem(i, item);}
    }

    public static void fillOuterBorders(Inventory inv, ItemStack border){
        ItemStack item = border;
        int size = inv.getSize();
        for(int i=0; i<size; i++){
            if((i<9) || (i>size-10)){inv.setItem(i, item);}
            if((i%9==8) || (i%9==0)){inv.setItem(i, item);}
        }
    }

    public static ItemStack getItemStack(Player player){ return player.getInventory().getItemInMainHand(); }


}
