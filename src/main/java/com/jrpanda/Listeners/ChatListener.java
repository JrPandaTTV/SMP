package com.jrpanda.Listeners;

import com.jrpanda.Utils.Helper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler
    public void asyncChat(AsyncPlayerChatEvent event){
        if(event.getMessage().contains("<3")){event.setMessage(event.getMessage().replace("<3", Helper.toColor("&c&l❤")));}
    }
}
