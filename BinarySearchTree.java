import java.util.*;
import static java.lang.Math.*;


public class BinarySearchTree {
   BinaryNode root;
   public void add(BinaryNode x)
   {
       if(root == null)
       {
           root = x;
           return;
       }
       add(root, x);
   }
   public void add(BinaryNode parent, BinaryNode x) {
       if (parent == null)
           return;

       if (x.getValue().compareTo(parent.getValue()) < 0) {
           if (parent.left() == null) {
               parent.setLeft(x);
           } else {
               add(parent.left(), x);
           }
       }else{
           if(parent.right()==null){
               parent.setRight(x);
           }else{
               add(parent.right(), x);
           }
       }
   }
   }


