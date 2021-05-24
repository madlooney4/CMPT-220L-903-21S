package main;
//======================================================================
public class NodeBst {                // BST class 
    public NodeBst leftChild;       // left child of the BST
    public NodeBst rightChild;     // right child of the BST
    public int element;                 // element or data in the BST
    
    //======================================================================
    
   public  NodeBst(int element)      // constructor; takes the element 
    {
        
        this.element = element;         // sets the element of the Node 
      System.out.println("Insertion is done successfully"+this.element);
    }
    
    //======================================================================
    public String toString()        // function that displays the elements of the node
    {
        return "key"+element;
    }
    
}
//======================================================================