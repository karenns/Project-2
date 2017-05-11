/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author w208079293
 */
public class LinkedListBST {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BST */
        BST bst = new BST();
        
        System.out.println("Linked List Binary Search Tree Test\n");
        char ch;
        /*  Accept input  */
        do {
            System.out.println("Enter integer element to insert");
            Company data = new Company();
            data.setEmployee_name(scan.next());
            data.setSalary(scan.nextInt());
            bst.insert(data);

            /*  Display tree  */
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
