package me.lanzhi.bluestargameapi;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.lanzhi.bluestartpscontrol.BluestarTpsControlAPI;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Papi extends PlaceholderExpansion
{
    public Papi()
    {
        this.register();
    }

    @Override
    @NotNull
    public String getIdentifier()
    {
        return "BluestarGame";
    }

    @Override
    @NotNull
    public String getName()
    {
        return "BluestarPAPI";
    }

    @Override
    @NotNull
    public String getAuthor()
    {
        return "lanzhi";
    }

    @Override
    @NotNull
    public String getVersion()
    {
        return "2.5.1";
    }

    @Override
    public @Nullable String getRequiredPlugin()
    {
        return "BluestarGameAPI";
    }

    @Override
    @Nullable
    public String onRequest(@Nullable OfflinePlayer player,@Nullable String params)
    {
        if (params==null||params.isEmpty())
        {
            BluestarTpsControlAPI tpsControlAPI=Bukkit.getServicesManager().load(BluestarTpsControlAPI.class);
            return tpsControlAPI==null?"null":tpsControlAPI.tpsFormat(
                    Bukkit.getServer().getTPS()[0]);
        }
        switch (params)
        {
            case "save":
            {
                final IBluestarGamePlugin plugin=Bukkit.getServicesManager().load(
                        IBluestarGamePlugin.class);
                if (plugin==null)
                {
                    return "null";
                }
                if (player==null)
                {
                    return "null";
                }
                return plugin.getNumberFormat().format(
                        plugin.getBluestarGameManager().getApi().getXiaoMoBank().getSave(player));
            }
            case "canGet":
            {
                final IBluestarGamePlugin plugin=Bukkit.getServicesManager().load(
                        IBluestarGamePlugin.class);
                if (plugin==null)
                {
                    return "null";
                }
                if (player==null)
                {
                    return "null";
                }
                return plugin.getNumberFormat().format(
                        plugin.getBluestarGameManager().getApi().getXiaoMoBank().getShoutGet(player));
            }
            case "borrow":
            {
                final IBluestarGamePlugin plugin=Bukkit.getServicesManager().load(
                        IBluestarGamePlugin.class);
                if (plugin==null)
                {
                    return "null";
                }
                if (player==null)
                {
                    return "null";
                }
                return plugin.getNumberFormat().format(
                        plugin.getBluestarGameManager().getApi().getXiaoMoBank().getBorrow(player));
            }
            case "shouldRepay":
            {
                final IBluestarGamePlugin plugin=Bukkit.getServicesManager().load(
                        IBluestarGamePlugin.class);
                if (plugin==null)
                {
                    return "null";
                }
                if (player==null)
                {
                    return "null";
                }
                return plugin.getNumberFormat().format(
                        plugin.getBluestarGameManager().getApi().getXiaoMoBank().getShoutRepay(player));
            }
            default:
            {
                BluestarTpsControlAPI bluestarTpsControlAPI=Bukkit.getServicesManager().load(
                        BluestarTpsControlAPI.class);
                return bluestarTpsControlAPI==null?"null":bluestarTpsControlAPI.tpsFormat(
                        Bukkit.getServer().getTPS()[0]);
            }
        }
    }
}
