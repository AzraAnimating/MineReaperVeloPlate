package de.azraanimating.minereaperplate.listener;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import net.kyori.adventure.text.Component;

public class PlayerConnectListener {

    @Subscribe
    public void onPlayerConnect(ServerPreConnectEvent event) {
        event.getPlayer().disconnect(Component.text("§7Das muss noch Warten :3"));
    }

}
