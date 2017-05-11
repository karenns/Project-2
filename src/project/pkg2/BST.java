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
public class BST {

    private Node root;

    /* Constructor */
    public BST() {
        root = null;
    }

    /* Functions to insert data */
    public void insert(Company data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */
    private Node insert(Node node, Company data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (Math.abs(node.data.getSalary() - data.getSalary()) > 3000) {
                if (data.getSalary() <= node.data.getSalary()) {
                    node.left = insert(node.left, data);
                } else {
                    node.right = insert(node.right, data);
                }
            }
        }
        return node;
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data.getEmployee_name() + " " + r.data.getSalary() + " ");
            inorder(r.right);
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data.getEmployee_name() + " " + r.data.getSalary() + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data.getEmployee_name() + " " + r.data.getSalary() + " ");
        }
    }
}
