package me.lanzhi.bluestargameapi;

import me.lanzhi.bluestarapi.Api.config.YamlFile;
import me.lanzhi.bluestargameapi.managers.BluestarGameManagerInterface;

import java.io.File;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public interface BluestarGamePluginInterface
{
    File getPlayerData();

    NumberFormat getNumberFormat();

    SimpleDateFormat getDateFormat();

    String getErrorMessageHead();

    String getMessageHead();

    YamlFile getConfig();

    void reloadConfig();

    void saveConfig();

    YamlFile getData();

    YamlFile getPlayerMap();

    BluestarGameManagerInterface getBluestarGameManager();

    NumberFormat getBluestarNF();

    SimpleDateFormat getBluestarDateFormat();

    BluestarGameManagerInterface getPlugin();
}
