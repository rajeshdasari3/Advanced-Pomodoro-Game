package apg;

import java.awt.Toolkit;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Game {
	int totalWorkDuration = 0;
	int totalBreakDuration = 0;
	final String fileName = "data.txt";
	String[] phases = {"start", "gearup", "fightmob", "challengemidboss", "fightfinalboss"};
	public LinkedHashMap<String, int[]> modes = new LinkedHashMap<>();
	public HashMap<String, String[]> prompts = new HashMap<>();

	// initializing modes and prompts using instance block.
	{
		modes.put("start", new int[] {5, 0});
		modes.put("gearup", new int[] {15, 3});
		modes.put("fightmob", new int[] {25, 5});
		modes.put("challengemidboss", new int[] {50, 10});
		modes.put("fightfinalboss", new int[] {90, 25});
		
		prompts.put("start", new String[]{"starting the Game", "Successfully started the Game"});
		prompts.put("gearup", new String[]{"Searching for new gear", "Successfully Equipped new gear"});
		prompts.put("fightmob", new String[]{"Fighting fightmobs", "Killed all fightmobs"});
		prompts.put("challengemidboss", new String[]{"You challenged the Mid Boss", "Won the fight with Mid Boss"});
		prompts.put("fightfinalboss", new String[]{"Intence Battle with Final Boss", "Successfully slayed the Final Boss (COMPLETE VICTORY)"});
	}
	
	public void timer(int duration) {
		for (int i = duration; i > 0; i--) {
			System.out.println(i + " minutes..");
			try {
				Thread.sleep(1 * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void repetedTimer(int times) {
		for (int i = 0; i < times; i++) {
			Toolkit.getDefaultToolkit().beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shedule(int workDuration, int breakDuration, String taskName) {
		System.out.println("⌈●_●⌋: "+prompts.get(taskName)[0] + " (Duration: " + workDuration + "minutes)");
		this.timer(workDuration);
		System.out.println("⌈●_●⌋: " + prompts.get(taskName)[1]);
		this.repetedTimer(5);
		if (breakDuration <= 0) {
			System.out.println("⌈●_●⌋: Your HP is full. Directly move to next phase");
		} else {
			System.out.println("⌈●_●⌋: Your Hp is down. Recover Your Health (Duration: " + breakDuration + "minutes)");
			this.timer(breakDuration);
			this.repetedTimer(5);
			System.out.println("⌈●_●⌋: Recovery comleted");
		}
	}
	
	void start(int userChoice) {
		int workDuration = 0;
		int breakDuration = 0;
		String taskName = phases[userChoice - 1];
		if (modes.containsKey(taskName)) {
			System.out.println(AsciiArt.monsters[userChoice - 1]);
			workDuration = modes.get(taskName)[0];
			breakDuration = modes.get(taskName)[1];
			
			this.shedule(workDuration, breakDuration, taskName);
			
			this.totalWorkDuration += workDuration; 
			this.totalBreakDuration+= breakDuration;
		} else {
			System.out.println("⌈●_●⌋: Invalid Choice");
		}
	}
	
	public void saveData() {
		FileHandler fileHandler = new FileHandler(this.fileName);
		fileHandler.writeToFile(this.totalWorkDuration, this.totalBreakDuration);
	}
	
}
