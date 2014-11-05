/*
 * Copyright (c) IntellectualCrafters - 2014. You are not allowed to distribute
 * and/or monetize any of our intellectual property. IntellectualCrafters is not
 * affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 *
 * >> File = PlayerTeleportToPlotEvent.java >> Generated by: Citymonstret at
 * 2014-08-09 14:57
 */

package com.intellectualcrafters.plot.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.intellectualcrafters.plot.Plot;

/**
 * Called when a player teleports to a plot
 */
public class PlayerTeleportToPlotEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final Location           from;
    private final Plot               plot;

    private boolean                  cancelled;

    /**
     * PlayerTeleportToPlotEvent: Called when a player teleports to a plot
     *
     * @param player
     * @param from
     * @param plot
     */
    public PlayerTeleportToPlotEvent(final Player player, final Location from, final Plot plot) {
        super(player);
        this.from = from;
        this.plot = plot;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Get the from location
     *
     * @return Location
     */
    public Location getFrom() {
        return this.from;
    }

    /**
     * Get the plot involved
     *
     * @return Plot
     */
    public Plot getPlot() {
        return this.plot;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
}