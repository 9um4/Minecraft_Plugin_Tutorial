package guma.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;

	PluginDescriptionFile pdFile = this.getDescription();

	// �÷��̾� ä�� �󿡼�
	String chat_prefix = ChatColor.AQUA + "[DicePlugin] " + ChatColor.WHITE + "";
	String chat_info = ChatColor.YELLOW + "[Info] " + ChatColor.WHITE + "";
	String chat_error = ChatColor.DARK_RED + "[Error] " + ChatColor.RED + "";
	String chat_warning = ChatColor.DARK_RED + "[Warning] " + ChatColor.RED + "";
	String chat_plname = ChatColor.GREEN + pdFile.getName() + "";
	String chat_plvers = ChatColor.GREEN + pdFile.getVersion() + "";
	String chat_pname = chat_plname + " version : " + chat_plvers + "";
	String chat_cinfo = chat_info + ChatColor.YELLOW + chat_pname + ChatColor.WHITE + "";

	// �ܼ� â����
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
		console(dos_cinfo + "�� Ȱ��ȭ�ƽ��ϴ�!");
	}

	@Override
	public void onDisable() {
		console(dos_cinfo + "�� ��Ȱ��ȭ�ƽ��ϴ�.");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		Player player = (Player) sender;

		if (cmdlabel.equalsIgnoreCase("dice")) {
			if (args.length == 0) {
				player.sendMessage(chat_prefix + chat_error + "���� ���� �ʹ� �۰ų� �����ϴ�!" + yellow + " /dice help");
			}
			else if (args.length > 0) {
				if (args[0].equalsIgnoreCase("help")) {
					player.sendMessage(aqua + "--------------" + "[DicePlugin]" + "--------------");
					player.sendMessage(yellow + "/dice help : " + chat_plname + yellow + "�� ���� ������ ǥ���մϴ�.");
					player.sendMessage(yellow + "/dice msg : �ֻ����� �����ϴ�.");
				}
				else if (args[0].equalsIgnoreCase("msg")) {
					int random = (int) ((Math.random()*6)+1);
					player.sendMessage(chat_prefix + blue + Integer.toString(random) + yellow + "�� ���Խ��ϴ�!");
				}
				else {
					player.sendMessage(chat_prefix + chat_error + "���� ���� ���� �ʽ��ϴ�!" + yellow + " /dice help");
				}
			}
		}

		return false;
	}

	public void console(String msg) {
		Bukkit.getConsoleSender().sendMessage(msg);
	}

}
