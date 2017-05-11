/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author w208079293
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Company> lst = new ArrayList();
        ReadFile rf = new ReadFile();
        lst = rf.readCSV("C:\\Users\\karen\\Documents\\NetBeansProjects\\Project-2\\src\\project\\pkg2\\newfile.txt");
        BST bst = new BST();

        for (int i = 0; i < lst.size(); i++) {
            if (i == 0) {
            } else {
                int diff = Math.abs(lst.get(i - 1).getSalary() - lst.get(i).getSalary());
                System.out.println("Number: " + lst.get(i).getSalary() + " Previous: " + lst.get(i - 1).getSalary() + " Diff: " + diff);
                bst.insert(lst.get(i));
            }
        }


        /*  Display tree  */
        System.out.print("\nPost order : ");
        bst.postorder();
        System.out.print("\nPre order : ");
        bst.preorder();
        System.out.print("\nIn order : ");
        bst.inorder();
    }

}
