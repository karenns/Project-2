/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author w208079293
 */
public class ReadFile {
    
    public List<Company> readCSV(String csvFile) {
        //public String[] readCSV(String csvFile) {
        //String csvFile = "/Users/mkyong/csv/country.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<Company> data = new ArrayList();
        //String[] data = null;
        //int interator = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] eachline = line.split(",");

                //System.out.println("State [state " + eachline[1] + " , solar=" + eachline[5] + "MWh]");
                //data[interator] = eachline[];
                //interator++;
                String employee_name = eachline[0];
                int salary = Integer.parseInt(eachline[1]);
            
                Company comp = new Company(employee_name, salary);
                data.add(comp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
