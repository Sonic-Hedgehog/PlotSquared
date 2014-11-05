/*
 * Copyright (c) IntellectualCrafters - 2014. You are not allowed to distribute
 * and/or monetize any of our intellectual property. IntellectualCrafters is not
 * affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 *
 * >> File = Claim.java >> Generated by: Citymonstret at 2014-08-09 01:41
 */

package com.intellectualcrafters.plot.commands;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import com.intellectualcrafters.plot.PlayerFunctions;
import com.intellectualcrafters.plot.Plot;
import com.intellectualcrafters.plot.PlotMain;
import com.intellectualcrafters.plot.database.DBFunc;

/**
 * @author Citymonstret
 */
public class DebugSaveTest extends SubCommand {

    public DebugSaveTest() {
        super(Command.DEBUGCLAIMTEST, "This debug command will force the recreation of all plots in the DB", "claim", CommandCategory.DEBUG, false);
    }

    @Override
    public boolean execute(final Player plr, final String... args) {
        if (plr == null) {
            final ArrayList<Plot> plots = new ArrayList<Plot>();
            plots.addAll(PlotMain.getPlots());
            DBFunc.createPlots(plots);
            DBFunc.createAllSettingsAndHelpers(plots);
        }
        else {
            PlayerFunctions.sendMessage(plr, "This debug command can only be executed by console as it has been deemed unsafe if abused.");
        }
        return true;
    }
}