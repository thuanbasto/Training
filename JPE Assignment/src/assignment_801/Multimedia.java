package assignment_801;

import java.util.Scanner;


public abstract class Multimedia {
	public String name;
	public double duration;
	
	public Multimedia() {
	}

	public Multimedia(String name, double duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\t Duration: " + duration;
	}
	
	@SuppressWarnings("resource")
	public void createMultimedia() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (name == null) {
					System.out.print("Enter name: ");
					this.name = scanner.nextLine();
				}
				if (duration == 0) {
					System.out.print("Enter duration: ");
					this.duration = Double.valueOf(scanner.nextLine());
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
}
