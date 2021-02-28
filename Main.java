package com.cs401;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

   // Creat new Menu
	var menu = new Menu();
	//Call @Menu method to get file from user



    // Creat And passing @param to AddressEntry
	var addressEntry1 = new AddressEntry("Hao", "Do", "200 Carlo Bee Blvd", "Hayward" ,
            "CA", "95111", "408-400-5050","howard@gmail.com");
        System.out.println(addressEntry1.toString());

        File file1 = new File("test.txt");
        PrintWriter writing;

        writing = new PrintWriter(file1);
        writing.println(addressEntry1.toString());
        writing.close();


        var addressEntry2 = new AddressEntry("Hao-2", "Do-2", "200 Carlo Bee Blvd-2", "Hayward-2" ,
                "CA-2", "95111-2", "408-400-5050-2","howard@gmail.com-2");
        System.out.println(addressEntry2.toString());

        var ab = new AddressBook();
        ab.readingFile();

       //PrintWriter writing2;
       //writing2 = new PrintWriter(file1);
       //writing2.println(addressEntry2.toString());
        //writing2.close();

// Reading from file name: file
        //File file2 = new File("Menu.prompt_File()");
        //AddressBook readingfile = new AddressBook();
        //readingfile.readingFile(file2);

        /*  File file1 = new File ("test.txt");
        File file2 = new File("file.txt");



        Scanner reading = new Scanner(file2);

        while(reading.hasNextLine()) {

            String FNA = reading.nextLine();
            String LNA = reading.nextLine();
            String STR = reading.nextLine();
            String CTY = reading.nextLine();
            String STA = reading.nextLine();
            String ZIP = reading.nextLine();
            String EMA = reading.nextLine();
            String PHN = reading.nextLine();


            var addressEntry3 = new AddressEntry(FNA, LNA, STR, CTY, STA, ZIP, EMA, PHN);

            try {
                BufferedWriter out;
                FileWriter fileStream = new FileWriter(file1, true);
                out = new BufferedWriter(fileStream);

                out.write(addressEntry3.toString());
                out.write("\n");
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        reading.close();




*/





    }
}
