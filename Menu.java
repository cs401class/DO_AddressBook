package com.cs401;
import java.util.Scanner;
import java.io.*;

public class Menu {

    //Prompt for @file to load and @return the file
    public File prompt_File() {
        String inputFileName;
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Please Enter file name to load: ");
            inputFileName = user.nextLine().trim();
        }
        File input = new File(inputFileName);
        try (Scanner scan = new Scanner(input)) {
        }catch (IOException e) {
            e.printStackTrace();}

        return input;
    }

    // Prompt for First Name
    public void prompt_FirstName(){
            System.out.println("First Name:");
        }

    // Prompt for Last Name
    public void prompt_LastName(){
        System.out.println("Last Name:");
    }

    // Prompt for Number & Street
    public void prompt_Street(){
        System.out.println("Number & Street:");
    }

    // Prompt for City
    public void prompt_City(){
        System.out.println("City:");
    }

    // Prompt for State
    public void prompt_State(){
        System.out.println("State:");
    }

    // Prompt for Zipcode
    public void prompt_Zipcode(){
        System.out.println("Zipcode:");
    }

    // Prompt for Email
    public void prompt_Email(){
        System.out.println("Email:");
    }

    // Prompt for Phone
    public void prompt_Phone(){
        System.out.println("Phone:");
    }


}
