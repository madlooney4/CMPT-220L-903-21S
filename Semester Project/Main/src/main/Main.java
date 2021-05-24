package main;

public class Main {

    public static void main(String[] args) {
       
        BST bstObject = new BST();                                                  // creates object of the BST class 
        bstObject.insertnewNode(45);                                             // calls to insert function and passes integer value     
        bstObject.insertnewNode(20);                                            // calls to insert function and passes integer value
        bstObject.insertnewNode(50);                                            // calls to insert function and passes integer value
        bstObject.insertnewNode(30);                                            // calls to insert function and passes integer value
        bstObject.insertnewNode(60);                                            // calls to insert function and passes integer value
        
        System.out.println("\nPreOrder Traversal\n");
        bstObject.showPreOrder(bstObject.head);                      // calls to the pre order function and passes the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n In Order Traversal\n");
        bstObject.showInOrder(bstObject.head);                      // calls to the In order function and passes the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\nPost Order Traversal\n");
        bstObject.showPostOrder(bstObject.head);                 // calls to the post order function and passes the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findMaximum(bstObject.head);                  // calls to the find Maximum function and passes the head Node
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findMinimum(bstObject.head);                   
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findElements(20);                                      // calls to the findElement function and passes the specific value
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findNthLargestElement(bstObject.head, 3); // finds nth largest element like for 1st =1, second = 2 and so on. 
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        bstObject.findHeightBST(bstObject.head);            // finds height of the bst; assuming height of the root is 0. 
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\nDeleting the 45 element from BST\n");
        bstObject.deleteElement(bstObject.head, 45);       // deletes the specific element
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Showing BST elements after the deletion of 45");
        bstObject.showInOrder(bstObject.head);
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Depth First Search");
        bstObject.doDepthFirstSearch(bstObject.head);
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("\n -----------------------------------------------------------------------------------------------\n");
        System.out.println("Bredth First Search");
        bstObject.doBredthFirstSearch(bstObject.head);
        
        
        
     }
    
}
