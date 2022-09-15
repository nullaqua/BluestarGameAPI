package me.lanzhi.bluestargameapi;

import me.lanzhi.api.config.YamlFile;
import me.lanzhi.bluestargameapi.managers.IBluestarGameManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public abstract class IBluestarGamePlugin extends JavaPlugin
{
    public abstract File getPlayerData();

    public abstract NumberFormat getNumberFormat();

    public abstract SimpleDateFormat getDateFormat();

    public abstract String getErrorMessageHead();

    public abstract String getMessageHead();

    @Override
    public abstract YamlFile getConfig();

    @Override
    public abstract void reloadConfig();

    @Override
    public abstract void saveConfig();

    public abstract YamlFile getData();

    public abstract YamlFile getPlayerMap();

    public abstract YamlFile getLang();

    public abstract IBluestarGameManager getBluestarGameManager();

    public abstract NumberFormat getBluestarNF();

    public abstract SimpleDateFormat getBluestarDateFormat();

    public abstract IBluestarGamePlugin getPlugin();
}
