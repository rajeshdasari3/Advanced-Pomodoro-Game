package apg;

import java.util.Scanner;

public class Main {
	static final String fileName = "data.txt";
	
	static void showMenu() {
		int n = 40;
		System.out.println("⌈●_●⌋:\t"
				+ "0. Show Menu\n\t"
				+"1. Start\n\t"
				+ "2. Gear Up\n\t"
				+ "3. Fight Mob\n\t"
				+ "4. Challenge Mid Boss\n\t"
				+ "5. Fight Final Boss\n\t"
				+ "6. view Data\n\t"
				+ "7. view File Info\n\t"
				+ "8. Quit");
		System.out.println("==".repeat(n));
	}
	
	public static void main(String[] args) {
		FileHandler fileHandler = new FileHandler(fileName);
		Game game = new Game();
		Scanner scan = new Scanner(System.in);
		int choice;

		System.out.println(AsciiArt.title);
		showMenu();
		
		boolean exit = false;
		while (!exit) {
			System.out.print("(¬_¬): ");
			choice = scan.nextInt();
			switch (choice) {
			case 0: showMenu(); break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: game.start(choice); break;
			case 6: fileHandler.viewFileContent(); break;
			case 7: fileHandler.getFileDetails(); break;
			case 8: game.saveData(); exit = true; break;
			default: System.out.println("⌈●_●⌋: Invalid Choice"); break;
			}
		}
		System.out.println("exit successuful");
		scan.close();
	}
}
