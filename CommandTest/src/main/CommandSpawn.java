package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			player.teleport(player.getWorld().getSpawnLocation());
			player.sendMessage("스폰으로 이동하였습니다.");
		}
		return true;
	}

}
