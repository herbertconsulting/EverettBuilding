/*
Advanced Java Review: Classes, File I/O, ArrayList

created by hteverett on 1/16/2017

This program reads in a file with building information, parses the line into
attributes and displays the formatted results.

I abide by the GTCC Academic Integrity Policy. This program is my original work.
 */

import java.io.*;               // import java.io utility
import java.util.ArrayList;     // import ArrayList utility
import java.util.Scanner;       // import scanner

// main class
public class EverettMain{
    public static void main(String[] args) throws FileNotFoundException {
        File fileInput = new File("src/BuildingData.txt");  // read in the file by its path

        Scanner sc = new Scanner(fileInput);    // create the scanner

        ArrayList<Building> bldgs = new ArrayList<>();  // create the ArrayList to store the data


        while(sc.hasNextLine()) {                           // read each line of data then parse into attributes
            String line = sc.nextLine();
            String[] elements = line.split(" ");
            String campus = elements[0];
            String name = elements[1];
            double lat = Double.parseDouble(elements[2]);
            double lon = Double.parseDouble(elements[3]);
            String imageName = elements[4];
            String buildingCode = elements[5];

            try {
                Coordinate c = new Coordinate(lat, lon);
                Building l = new Building(campus, name, c, imageName, buildingCode);
                bldgs.add(l);       // add the line to the ArrayList
            } catch (InvalidLatitudeException e) {
                System.out.println(e.getMessage());
            } catch (InvalidLongitudeException e) {
                System.out.println(e.getMessage());
            }

        }
        sc.close();  // close the scanner

        for (Building s : bldgs) {      // print the lines formatted in the toString in the Building class
            System.out.println(s);
        }

    }


}
