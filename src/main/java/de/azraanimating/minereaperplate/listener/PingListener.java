package de.azraanimating.minereaperplate.listener;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.proxy.server.ServerPing;
import com.velocitypowered.api.util.Favicon;
import net.kyori.adventure.text.Component;

public class PingListener {

    @Subscribe
    public void onProxyPing(final ProxyPingEvent event) {
        event.setPing(
                ServerPing
                        .builder()
                        .version(new ServerPing.Version(0, ""))
                        .description(Component.text("                   §aMine§2Reaper§7.de§r\n                  - Coming soon -"))
                        .favicon(new Favicon("data:image/png;base64,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"))
                        .maximumPlayers(0)
                        .onlinePlayers(0)
                        .build()
        );
    }

}