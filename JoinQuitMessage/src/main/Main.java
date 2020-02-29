package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	PluginDescriptionFile pdFile = this.getDescription();
	
	// 플레이어 채팅 상에서
		String chat_prefix = ChatColor.AQUA + "[DicePlugin] " + ChatColor.WHITE + "";
		String chat_info = ChatColor.YELLOW + "[Info] " + ChatColor.WHITE + "";
		String chat_error = ChatColor.DARK_RED + "[Error] " + ChatColor.RED + "";
		String chat_warning = ChatColor.DARK_RED + "[Warning] " + ChatColor.RED + "";
		String chat_plname = ChatColor.GREEN + pdFile.getName() + "";
		String chat_plvers = ChatColor.GREEN + pdFile.getVersion() + "";
		String chat_pname = chat_plname + " version : " + chat_plvers + "";
		String chat_cinfo = chat_info + ChatColor.YELLOW + chat_pname + ChatColor.WHITE + "";

		// 콘솔 창에서
		String dos_prefix = "[Spota Plugin] ";
		String dos_info = "[Info] ";
		String dos_error = "[Error] ";
		String dos_warning = "[Warning] ";
		String dos_plname = pdFile.getName();
		String dos_plvers = pdFile.getVersion();
		String dos_pname = dos_plname + " version : " + dos_plvers + "";
		String dos_cinfo = dos_prefix + dos_info + dos_pname + "";

		String white = ChatColor.WHITE + "";
		String red = ChatColor.RED + "";
		String dred = ChatColor.DARK_RED + "";
		String gold = ChatColor.GOLD + "";
		String yellow = ChatColor.YELLOW + "";
		String green = ChatColor.GREEN + "";
		String dgreen = ChatColor.DARK_GREEN + "";
		String aqua = ChatColor.AQUA + "";
		String blue = ChatColor.BLUE + "";
		String dblue = ChatColor.DARK_BLUE + "";
		String gray = ChatColor.GRAY + "";
		
		@Override
		public void onEnable() {
			getServer().getPluginManager().registerEvents(this, this);
			console(dos_prefix + dos_info + "가 활성화되었습니다.");
		}
		
		@Override
		public void onDisable() {
			console(dos_prefix + dos_info + "가 비활성화되었습니다.");
		}
		
		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent e) {
			Player p = e.getPlayer();
			if (p.hasPlayedBefore()) {
				e.setJoinMessage(yellow + p.getName());
			}
			else {
				e.setJoinMessage(yellow + p.getName());
			}
		}
		
		@EventHandler
		public void onPlayerQuit(PlayerQuitEvent e) {
			Player p = e.getPlayer();
			e.setQuitMessage(yellow + p.getName());
		}
		
		public void console(String msg) {
			Bukkit.getConsoleSender().sendMessage(msg);
		}
}
