package apg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileHandler{
	String fileName;
	File file;
	
	public FileHandler(String fileName) {
		this.fileName = fileName;
		file = new File(fileName);
		if (!file.exists()) {
			this.createFile();
		}
	}

	private void createFile() {
		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
	        System.out.println("An error occurred while creating file.");
	        e.printStackTrace();
	      }
	}


	private String getFileContent() {
		StringBuilder fileContent= new StringBuilder();
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				fileContent.append(data);
				fileContent.append("\n");
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while getting file content.");
			e.printStackTrace();
		}
		return fileContent.toString();
	}

	public void getFileDetails() {
		if (file.exists()) {
		      System.out.println("File name: " + file.getName());
		      System.out.println("Absolute path: " + file.getAbsolutePath());
		      System.out.println("Writeable: " + file.canWrite());
		      System.out.println("Readable " + file.canRead());
		      System.out.println("File size in bytes " + file.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
	}

	public void viewFileContent() {
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while viewing file content.");
			e.printStackTrace();
		}
	}

	public void writeToFile(int workDuration, int breakDuration) {
		if (workDuration <= 0 && breakDuration <= 0) {
			return;
		}
		StringBuilder content = new StringBuilder(this.getFileContent());
		LocalDateTime today = LocalDateTime.now();
		content.append(today.getDayOfMonth() + "-" + today.getMonthValue() + "-" + today.getYear() + " ");
		content.append(today.getHour() + ":" + today.getMinute() + "\t");
		content.append(workDuration + "min\t");
		content.append(breakDuration + "min\t");
		content.append(workDuration + breakDuration + "min\n");
		try {
			FileWriter myWriter = new FileWriter(fileName);
			myWriter.write(content.toString());
			myWriter.close();
			System.out.println("⌈●_●⌋: Data saved to " + this.file.getName());
		} catch (IOException e) {
			System.out.println("An error occurred while writing to file.");
			e.printStackTrace();
		}
	}

}
