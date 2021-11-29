package com.mprzenzak;

import java.util.Scanner;

public class Service {
    private final Scanner scanner = new Scanner(System.in);

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printInfoMessage(String message) {
        System.out.println(message);
        enterString("Nacisnij ENTER");
    }

    public void clearConsole(){
        System.out.println("\n\n");
    }

    public String enterString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public Integer enterInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
