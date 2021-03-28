package de.azraanimating.minereaperplate;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import de.azraanimating.minereaperplate.listener.PingListener;
import de.azraanimating.minereaperplate.listener.PlayerConnectListener;

import javax.inject.Inject;
import java.util.logging.Logger;

@Plugin(id = "mrpl-1", name = "MineReaper Velocity Plate", version = "1.0")
public class MineReaperPlate {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public MineReaperPlate(final ProxyServer server, final Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onInitialize(final ProxyInitializeEvent event) {
        this.server.getEventManager().register(this, new PingListener());
        this.server.getEventManager().register(this, new PlayerConnectListener());
    }


}
