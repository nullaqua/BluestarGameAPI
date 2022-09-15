package me.lanzhi.bluestargameapi.managers;

import me.lanzhi.bluestargameapi.IBluestarGamePlugin;
import me.lanzhi.bluestargameapi.api.IPluginApi;
import org.bukkit.configuration.ConfigurationSection;

public interface IBluestarGameManager
{
    public IPluginApi getApi();

    public ConfigurationSection getMuted();

    public ConfigurationSection getElevators();

    public IRandomEventManger getRandomEventManger();

    public ISuperSpongeManager getSuperSpongeManager();

    public IBluestarGamePlugin getPlugin();
}
