package main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("hello").setExecutor(new CommandHello());
		getCommand("spawn").setExecutor(new CommandSpawn());
	}
}
