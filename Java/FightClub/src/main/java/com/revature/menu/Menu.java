package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Fight fight= new Fight();
	
	static Scanner scan=new Scanner(System.in);
	public static void startMenu() {
		System.out.println("Welcome to the game!");
		System.out.println("Please enter a choice:");
		System.out.println("[c]reate a new warrior");
		System.out.println("[f]ight!");
		System.out.println("[q]uit the game");
		String choice=scan.nextLine();
		switch(choice.toLowerCase()) {
			case "c":
				createMenu();
				break;
			case "f":
				fightMenu();
				break;
			case "q":
				System.out.println("BYE");
				break;
			default:
				System.out.println("Try again nerd");
				startMenu();
				break;
		}
			
	}
	
	public static void createMenu() {
		System.out.println("Create a new Warrior!");
		System.out.println("Please enter a name for your warrior");
		String warriorName=scan.nextLine();
		System.out.println("Please enter your Warrior's HP");
		int warriorHP= Integer.parseInt(scan.nextLine());
		System.out.println("Please enter your Warrior's Attack Power");
		int warriorAttackPower= Integer.parseInt(scan.nextLine());
		Warrior a=new Warrior(warriorName,warriorHP,warriorAttackPower);
		LogThis.LogIt("info", a.getName()+ " was created");
		System.out.println(Roster.warriorList.toString());
		
	System.out.println("Would you like to make a new Warrior? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			createMenu();
		}else if(choice.equalsIgnoreCase("n")) {
			startMenu();
		}else {
			System.out.println("Too bad, you're going back to the Main Menu");
			startMenu();
		}
		
	}
	public static void fightMenu() {
		System.out.println("Enter the name of your first Warrior");
		String first= scan.nextLine();
		Warrior a=Roster.findWarriorByName(first);
		System.out.println("Enter the name of the Second Warrior");
		String second= scan.nextLine();
		Warrior b= Roster.findWarriorByName(second);
		System.out.println("LET THE BATTLE BEGIN!");
		fight.fightTime(a, b);
		LogThis.LogIt("info", a.getName()+" just punched "+ b.getName()+ " and it costs them "+ a.getAttackPower()+ " points of damage");
		System.out.println(a.getName()+" just punched "+ b.getName()+ " and it costs them "+ a.getAttackPower()+ " points of damage");
		System.out.println(b.getName()+"'s HP is now " + b.getHp());
	}
}
