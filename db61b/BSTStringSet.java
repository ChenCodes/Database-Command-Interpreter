import java.util.HashMap;
import java.util.*;


/** A BST with Set interface implemented. 
 *  @author Yuxi Chen*/
public class BSTStringset implements StringSet{
    public Object root;
    private BSTStringSet leftChild;
    private BSTStringSet rightChild;




    private class BSTStringSet(Object root, BSTStringSet leftChild, BSTStringSet, rightChild) {
        this.root = root;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    // private class Node {
    //     private String s;
    //     private Node left;
    //     private Node right;
    // }



    static void put(String s) {
        if (root == null) {
            this.root = s;
        }

        else if (s.compareTo(root) < 0){
            root.leftChild = put(s);
        } else if (s.compareTo(root) > 0) {
            root.rightChild = put(s);
        } else if (s.compareTo(root) == 0) {
            break;
        }
    }


    static boolean contains(String s) {
        if (root == null) {
            return false;
        } else if (root.compareTo(s) == 0) {
            return true;
        } else if (root.compareTo(s) < 0) {
            root.leftChild = root.leftChild.contains(s);
        } else if (root.compareTo(s) > 0) {
            root.rightChild = root.rightChild.contains(s);
        }

    }












