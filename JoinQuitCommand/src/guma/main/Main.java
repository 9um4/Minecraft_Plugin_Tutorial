package guma.main;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public static Main plugin;
	
	PluginDescriptionFile pdFile = this.getDescription();
	
	@Override
	public void onEnable() {
		this.logger.info("[" + pdFile.getName() + "] " + pdFile.getName() + " version : " + pdFile.getVersion() + "이 활성화됐습니다!" );
	}
	
	@Override
	public void onDisable() {
		this.logger.info("[" + pdFile.getName() + "] " + pdFile.getName() + " version : " + pdFile.getVersion() + "이 비활성화됐습니다.");
	}

}
