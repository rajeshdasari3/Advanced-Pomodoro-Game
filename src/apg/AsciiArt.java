package apg;

public class AsciiArt {
	public static String title = "\r\n"
			+ "██████╗  ██████╗ ███╗   ███╗ ██████╗ ██████╗  ██████╗ ██████╗  ██████╗      ██████╗  █████╗ ███╗   ███╗███████╗\r\n"
			+ "██╔══██╗██╔═══██╗████╗ ████║██╔═══██╗██╔══██╗██╔═══██╗██╔══██╗██╔═══██╗    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝\r\n"
			+ "██████╔╝██║   ██║██╔████╔██║██║   ██║██║  ██║██║   ██║██████╔╝██║   ██║    ██║  ███╗███████║██╔████╔██║█████╗  \r\n"
			+ "██╔═══╝ ██║   ██║██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██╔══██╗██║   ██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  \r\n"
			+ "██║     ╚██████╔╝██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝██║  ██║╚██████╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗\r\n"
			+ "╚═╝      ╚═════╝ ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝\r\n"
			+ "                                                                                                               \r\n"
			+ "";
	
	public static String[] monsters = {"\r\n"
			+ "███████ ████████  █████  ██████  ████████ \r\n"
			+ "██         ██    ██   ██ ██   ██    ██    \r\n"
			+ "███████    ██    ███████ ██████     ██    \r\n"
			+ "     ██    ██    ██   ██ ██   ██    ██    \r\n"
			+ "███████    ██    ██   ██ ██   ██    ██    \r\n"
			+ "                                          \r\n"
			+ "                                          \r\n"
			+ "",
			"\r\n"
			+ " ██████  ███████  █████  ██████      ██    ██ ██████  \r\n"
			+ "██       ██      ██   ██ ██   ██     ██    ██ ██   ██ \r\n"
			+ "██   ███ █████   ███████ ██████      ██    ██ ██████  \r\n"
			+ "██    ██ ██      ██   ██ ██   ██     ██    ██ ██      \r\n"
			+ " ██████  ███████ ██   ██ ██   ██      ██████  ██      \r\n"
			+ "                                                      \r\n"
			+ "                                                      \r\n"
			+ "",
			"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠟⣧⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⣠⣴⣞⡛⠋⠉⠉⠉⠙⠛⠓⠶⣤⣀⠀⠀⠀⣼⠃⠼⣧⣀⣠⣤⣤⣤⣤⣄⣀⣠⡟⠀⢹⡇⠀⣤⣶⠛⠛⠉⠉⠉⠉⠉⠉⠙⠛⠲⢦⣄⡀⠀⠀⠀⠀⠀\r\n"
			+ "⠉⠉⠉⠙⠳⣄⠀⠀⠀⠀⠀⠀⢈⣽⠗⠀⢀⣿⡀⠷⠛⠉⠁⠀⠀⠀⠀⠈⠿⠋⠀⠀⣸⠇⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠳⣦⡀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⣼⠁⠀⢠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠟⢷⡀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣤⣬⣻⣦⠀\r\n"
			+ "⠀⠀⠀⠀⣰⡏⠀⠀⠀⠀⠀⠀⣿⠀⣰⢟⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⡄⠀⣾⡀⠀⠀⠀⠀⠀⠀⠀⢸⠋⠀⠀⠀⠀⠀⠀⠙⠃\r\n"
			+ "⠀⠀⠀⡴⠿⠖⠒⠶⣦⡀⠀⠀⠹⣧⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣼⠃⠁⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠉⣷⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⣤⡀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⢠⣤⠾⠋⠁⠀⠀⠀⣠⡶⠒⠓⠶⢦⣄⣷⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣤⠴⠶⣾⠀⠀⠀⠀⠀⢀⢻⠁⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠿⠳⢶⣦⣤⣀⠀⣿⠀⠀⠀⠀⠀⠈⠙⠷⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠁⠀⠀⢹⡗⠀⠀⠀⠀⠛⠉⠉⠉⠙⠛⠶⣦⠄⠀⠀⠀⠀⠀⠀⠀⢸⠃⠀⠉⠳⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢦⣤⣀⡀⠀⠀⠀⠀⠀⠀⣀⠀⠀⡶⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢻⣟⢻⡟⠛⠛⠛⠹⣦⢰⡇⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠾⠃⠀⠀⠀⠀⠹⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
			
			"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⡼⠀⢀⡀⣀⢱⡄⡀⠀⠀⠀⢲⣤⣤⣤⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⣿⡿⠛⠋⠁⣤⣿⣿⣿⣧⣷⠀⠀⠘⠉⠛⢻⣷⣿⣽⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⢀⣴⣞⣽⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠠⣿⣿⡟⢻⣿⣿⣇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣟⢦⡀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⣠⣿⡾⣿⣿⣿⣿⣿⠿⣻⣿⣿⡀⠀⠀⠀⢻⣿⣷⡀⠻⣧⣿⠆⠀⠀⠀⠀⣿⣿⣿⡻⣿⣿⣿⣿⣿⠿⣽⣦⡀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⣼⠟⣩⣾⣿⣿⣿⢟⣵⣾⣿⣿⣿⣧⠀⠀⠀⠈⠿⣿⣿⣷⣈⠁⠀⠀⠀⠀⣰⣿⣿⣿⣿⣮⣟⢯⣿⣿⣷⣬⡻⣷⡄⠀⠀⠀\r\n"
			+ "⠀⠀⢀⡜⣡⣾⣿⢿⣿⣿⣿⣿⣿⢟⣵⣿⣿⣿⣷⣄⠀⣰⣿⣿⣿⣿⣿⣷⣄⠀⢀⣼⣿⣿⣿⣷⡹⣿⣿⣿⣿⣿⣿⢿⣿⣮⡳⡄⠀⠀\r\n"
			+ "⠀⢠⢟⣿⡿⠋⣠⣾⢿⣿⣿⠟⢃⣾⢟⣿⢿⣿⣿⣿⣾⡿⠟⠻⣿⣻⣿⣏⠻⣿⣾⣿⣿⣿⣿⡛⣿⡌⠻⣿⣿⡿⣿⣦⡙⢿⣿⡝⣆⠀\r\n"
			+ "⠀⢯⣿⠏⣠⠞⠋⠀⣠⡿⠋⢀⣿⠁⢸⡏⣿⠿⣿⣿⠃⢠⣴⣾⣿⣿⣿⡟⠀⠘⢹⣿⠟⣿⣾⣷⠈⣿⡄⠘⢿⣦⠀⠈⠻⣆⠙⣿⣜⠆\r\n"
			+ "⢀⣿⠃⡴⠃⢀⡠⠞⠋⠀⠀⠼⠋⠀⠸⡇⠻⠀⠈⠃⠀⣧⢋⣼⣿⣿⣿⣷⣆⠀⠈⠁⠀⠟⠁⡟⠀⠈⠻⠀⠀⠉⠳⢦⡀⠈⢣⠈⢿⡄\r\n"
			+ "⣸⠇⢠⣷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⠿⠋⠀⢻⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢾⣆⠈⣷\r\n"
			+ "⡟⠀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣤⡀⢸⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⢹\r\n"
			+ "⡇⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠈⣿⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⢸\r\n"
			+ "⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠶⣶⡟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼\r\n"
			+ "⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡁⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣼⣀⣠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
			"⠀⠀⠀⠀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⢸⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢀⣼⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⢸⣇⠙⢷⣤⣀⣠⣴⠶⠶⠶⠶⠶⠶⣦⣄⣀⣤⡾⠋⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⢻⣆⠀⠈⠛⠿⣦⠀⠀⠀⠀⠀⠀⢰⠿⠛⠁⠀⣴⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠙⣷⣦⣄⣴⠏⠀⠀⠀⠀⠀⠀⠹⣦⣠⣴⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⣤⣄⠀⣿⡆⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⣿⠀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⣿⡟⠿⣿⡇⢳⣦⣄⣀⡀⠀⠀⢀⣀⣠⣴⣟⠀⣿⠿⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⡇⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⣿⡃⠀⣿⡇⠹⣷⣍⣽⡿⠛⠛⢿⣯⣩⣾⠟⠀⣿⠇⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⡇⠀⠀⠀⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠈⠻⠶⣿⡇⠀⠈⠉⠉⠀⠀⠀⠀⠉⠉⠁⠀⠀⣿⠶⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⡇⠀⠀⠺⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⣿⡁⠀⠀⢠⣤⣤⣤⣤⣤⣤⡄⠀⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸⠀⠀⢀⡖⢻⠀⠀⡤⠖⠒⠒⢆⡀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⢸⠀⠀⢀⡤⠤⠒⠦⣄⡀⠀\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠘⣷⡀⠀⠘⣿⣾⠋⠀⠀⠀⠀⠀⢀⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⡇⠀⠀⡇⠀⡇⠀⡏⠀⢀⡤⣄⡀⠳⡀⠀⠀⠀⠀⠀⠀⢸⠀⠀⣇⣠⠤⠤⠤⣄⡀⠀⠀⡇⠀⢧⠀⡏⠀⠀⣀⣤⡀⠀⠙⢦\r\n"
			+ "⠀⠀⠀⠀⠀⠀⠀⠈⢻⣶⣤⣈⣁⣀⣀⣀⣀⣤⣶⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡖⠋⠓⠋⠀⡇⠀⢸⠀⠀⡇⠀⡇⠀⣯⡀⣸⠀⠈⡇⡀⠀⢀⣀⡀⠀⡇⠀⡥⢤⠤⠤⡄⠀⠈⢳⠀⡜⠀⠀⡇⡇⠀⢸⠁⠀⠀⠙⡆⢰⠃⠀\r\n"
			+ "⠀⠀⢀⣀⣀⣤⣤⣴⠾⠃⠈⠉⠉⠉⠉⠉⠉⠁⠘⠷⣦⣤⣤⣀⣀⡀⠀⠀⡼⠁⢰⠋⢹⠀⡼⠀⠀⡇⠀⢸⠀⠳⡄⠀⠉⠉⠀⠀⣷⡈⠛⠁⠀⢸⠀⡞⠀⠈⠑⠒⠢⠴⠃⠀⢰⠃⢀⡇⢰⠃⠸⣄⠀⠉⠑⠒⠋⠀⡜⠀⠀⠀⠀\r\n"
			+ "⢠⡾⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⢷⡄⠀⠀⠀⢧⡀⠉⠉⠁⢠⡇⠀⢧⣀⣸⠀⠀⠀⠓⠦⠤⠴⠚⠁⠓⠒⠚⠉⠀⠀⠧⠤⠤⠤⠤⠤⠤⠒⠋⠀⠀⣸⠥⢼⠀⠀⠀⠈⠉⠓⠒⠊⠁⠀⠀⠀\r\n"
			+ "⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"
			
	};
}
