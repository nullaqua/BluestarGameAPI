package me.lanzhi.bluestargameapi.api;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;
import java.util.UUID;

public interface XiaoMoBankInterface
{
    public long getBorrow(@NotNull OfflinePlayer player);

    public long getBorrow(@NotNull UUID uuid);

    public long getSave(@NotNull OfflinePlayer player);

    public long getSave(@NotNull UUID uuid);

    public Date getBorrowTime(@NotNull OfflinePlayer player);

    public Date getSaveTime(@NotNull OfflinePlayer player);

    @Nullable
    public Date getBorrowTime(@NotNull UUID uuid);

    @Nullable
    public Date getSaveTime(@NotNull UUID uuid);

    public double getShoutRepay(@NotNull OfflinePlayer player);

    public double getShoutRepay(@NotNull OfflinePlayer player,@NotNull Date to);

    public double getShoutRepay(@NotNull UUID uuid);

    public double getShoutRepay(@NotNull UUID uuid,@NotNull Date to);

    public double getShoutGet(@NotNull OfflinePlayer player);

    public double getShoutGet(@NotNull OfflinePlayer player,@NotNull Date to);

    public double getShoutGet(@NotNull UUID uuid);

    public double getShoutGet(@NotNull UUID uuid,@NotNull Date to);

    public double getShoutRepay(long money,@NotNull Date borrowDate,@NotNull Date to);

    public double getShoutRepay(long money,@NotNull Date borrowDate);

    public double getShoutGet(long money,@NotNull Date saveDate,@NotNull Date to);

    public double getShoutGet(long money,@NotNull Date saveDate);
}
