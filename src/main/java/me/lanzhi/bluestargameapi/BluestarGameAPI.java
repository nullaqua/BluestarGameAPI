package me.lanzhi.bluestargameapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class BluestarGameAPI extends JavaPlugin
{
    @Override
    public void onEnable()
    {
    }

    @Override
    public void onDisable()
    {
    }
    private static BluestarGamePluginInterface bluestarGamePlugin;
    public static BluestarGamePluginInterface getBluestarGame()
    {
        return bluestarGamePlugin;
    }
    public static void setBluestarGame(BluestarGamePluginInterface bluestarGamePlugin1)
    {
        bluestarGamePlugin=bluestarGamePlugin1;
    }
}
