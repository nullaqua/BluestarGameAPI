package me.lanzhi.bluestargameapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class BluestarGameAPI extends JavaPlugin
{
    Papi papi;
    @Override
    public void onEnable()
    {
        papi=new Papi();
    }

    @Override
    public void onDisable()
    {
        papi.unregister();
    }
}
