package me.lanzhi.bluestargameapi.managers;

import me.lanzhi.bluestargameapi.BluestarGamePluginInterface;
import me.lanzhi.bluestargameapi.api.PluginApiInterface;
import org.bukkit.configuration.ConfigurationSection;

public interface BluestarGameManagerInterface
{
    public PluginApiInterface getApi();

    public ConfigurationSection getMuted();

    public ConfigurationSection getElevators();

    public RandomEventMangerInterface getRandomEventManger();

    public SuperSpongeManagerInterface getSuperSpongeManager();

    public BluestarGamePluginInterface getPlugin();
}
