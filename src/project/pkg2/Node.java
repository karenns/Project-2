/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author w208079293
 */
public class Node {

    Node left, right;
    //int data;
    Company data;

    /* Constructor */
    public Node(Company n) {
        left = null;
        right = null;
        data = n;
    }
}
