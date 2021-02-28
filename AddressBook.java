package com.cs401;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {



       // Reading a file

       public void readingFile() {
              Menu getfile = new Menu();

              File file1 = new File(String.valueOf(getfile.prompt_File()));
              File file2 = new File("test.txt");
              Scanner reading = null;
              try {
                     reading = new Scanner(file1);
              } catch (FileNotFoundException e) {
                     e.printStackTrace();
              }

              while (reading.hasNextLine()) {
                    for (int i =0; i++){
                            for (int j= 0; j<=7; j++){
                                   List<List<String>> a = new ArrayList<List<String>>();
                            }


                     /*String FNA = reading.nextLine();
                     String LNA = reading.nextLine();
                     String STR = reading.nextLine();
                     String CTY = reading.nextLine();
                     String STA = reading.nextLine();
                     String ZIP = reading.nextLine();
                     String EMA = reading.nextLine();
                     String PHN = reading.nextLine();


                     var addressEntry3 = new AddressEntry(FNA, LNA, STR, CTY, STA, ZIP, EMA, PHN);*/
                  var addressEntry3 = new AddressEntry()

                     try {
                            BufferedWriter out;
                            FileWriter fileStream = new FileWriter(file2, true);
                            out = new BufferedWriter(fileStream);

                            out.write(addressEntry3.toString());
                            out.write("\n");

                            out.close();
                     } catch (IOException e) {
                            e.printStackTrace();
                     }


              }
              reading.close();
       }

       }


