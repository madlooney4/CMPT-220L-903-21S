package main;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class BST {                   // class BST can execute functions like insertion, deletion, and searching 
    
    public NodeBst head;        // creates the head node which is a reference of NodeBst Class 
    
    BST()                               // default constructor; is called when object is created
    {
        head = null;               //  head is initially null 
    }

   public void insertnewNode(int nodeParameterValue)            // adds integer value when making a new node
  {
      NodeBst newNode = new NodeBst (nodeParameterValue);   // creates the object of NodeBst Class and passes the value to the constructor
      
        
      if(head==null)                                                    //  head is initially null 
      {
        
         head = newNode;                                        // head is the first node of the BST Tree
      }
      
      else
      {
          NodeBst currentNode = head;           
          NodeBst parent; 
          
          while(true)
          {
              parent = currentNode; 
              
              if(nodeParameterValue<parent.element)    //  if the value is less than the value in the tree
              {
                  currentNode = currentNode.leftChild;      // places the new node to the left of the Node
                  
                  if(currentNode ==null)
                  {
                      parent.leftChild = newNode; 
                      return ;
                  }
              }
              else                                              //  if the value is less than the value in the tree
              {
                  currentNode = currentNode.rightChild; // places the new node to the left of the Node
                  
                  if(currentNode ==null)
                  {
                      parent.rightChild = newNode;
                      return;
                  }
              }
          }
      }
      
     
      
  } 
   
   public void  findElements(int element)  // takes one integer variable 
   {
       NodeBst current = head;              // current node is head and head is the starting point of BST 
       
       if(element==head.element)        // if the first value in BST is equal to the element that the user is searching for
       {
           System.out.println("your element is found successfully in the BST:"+head.element);   // displays the value
       }
       
       else                         
       {
                 while(current!=null)       // executes untill current is null 
       {
           
           
           if(element<current.element)  // if the user key is less than the element of the tree 
           {
               current = current.leftChild;     // updates the current to the left sub tree 
               if(element ==current.element)        // compares both values 
               {
                   System.out.println("your element is found successfully in the BST:"+current.element); // displays the search key 
                   break; // breaks the loop 
               }  
               
           }  
           
           if(element>current.element)  // if the user key is less than the element of the tree 
           {
               current = current.rightChild;        // updates the current to the left sub tree
               if(element ==current.element)        // compares both values 
               {
                   System.out.println("your element is found successfully in the BST:"+current.element);  // displays the search key 
                   break;               // breaks the loop 
               }  
               
           } 
       }
       }
      
   }
   
   public void findMaximum(NodeBst startNode)
   {
       NodeBst current = startNode;    // current node which is the start node or root node
       if(current!=null)        // until current is null
         {
            while(current.rightChild!=null)     // executes the right most leaf node to find maximum element
             {
                   current = current.rightChild;    // updates the current to the right child 
             }
      
         }
     System.out.println( "\nThe maximum in the Binary Search Tree is :"+current.element);  // shows the maximum element in BST
       return;
      
   }
   
    public int findMinimum(NodeBst startNode)
   {
       NodeBst current = startNode;     // current node which is the start node or root node
       if(current!=null)        // until current is null
         {
            while(current.leftChild!=null)      // executes the right most leaf node to find maximum element
            {
                current = current.leftChild;        // updates current to the right child 
            }
         }
     System.out.println( "\nThe minimum in the Binary Search Tree is :"+current.element);    // shows the maximum element in BST
       return current.element;
      
   }
   //======================================================================
  // function that traverses the BST inOrder order
  public void showInOrder(NodeBst startNode)
  {
      if(startNode!=null)    // base condition
          {
           showInOrder(startNode.leftChild);     // recursively calls and passes the left child of the BST
          System.out.println(startNode.element);
          showInOrder(startNode.rightChild);        // recursively calls and passes the right child of the BST
          }
         
      }
  //======================================================================
  // function that traverses the BST in pre order
  public void showPreOrder(NodeBst startNode)
  {
       if(startNode!=null)       // base condition
          {
             System.out.println(startNode.element);    // displays the element
             showPreOrder(startNode.leftChild);          // recursively calls and passes the left child of the BST
             showPreOrder(startNode.rightChild);       // recursively calls and passes the right child of the BST
          }
         
      }
  //======================================================================
  // function that traverses the BST in post order
    public void showPostOrder(NodeBst startNode)
   {
      if(startNode!=null)        // base condition 
          {
           showPostOrder(startNode.leftChild);     // recursively calls and passes the left child of the BST
           showPostOrder(startNode.rightChild);     // recursively calls and passes the right child of the BST
           System.out.println(startNode.element);   // displays the element
          }
         
  }
  
  //======================================================================
    
    public void findNthLargestElement(NodeBst startNode,int nthNumber)
    {
       NodeBst current = startNode;
       
       if(nthNumber==1)     // if the user pass nthNumber equal to 1 then find the largest element 
       {
          if(current!=null)
           {
                  while(current.rightChild!=null)       // executes until the right child of the current node is null 
                   {
                      current = current.rightChild;     // updates current to the right child 
                   }
           }
         System.out.println( "\nThe first Largest in the Binary Search Tree is :"+current.element); 
     }
      else   if(nthNumber==2)       // if the user pass nthNumber equal to 2 then find the Second largest element 
       {
          if(current!=null)     // checks for current if it is null or not
           {
                  while(current.rightChild.rightChild!=null)        // executes until the parent of leaf child 
                   {
                      current = current.rightChild;     // updates to the right 
                   }
           }
         System.out.println( "\nThe Second Largest in the Binary Search Tree is :"+current.element); 
     }
       else   if(nthNumber==3)      // if the user pass nthNumber equal to 2 then find the Second largest element 
       {
          if(current!=null)     // checks for current if it is null or not
           {
                  while(current.rightChild.rightChild.rightChild!=null) // executes the grand parent of the leaf node 
                   {
                      current = current.rightChild;  // updates the current to right child 
                   }
           }
         System.out.println( "\nThe Third Largest in the Binary Search Tree is :"+current.element); 
     }
       else
       {
           System.out.println( "\n You can find Nth Largest Element up to 3"); 
       }
       
       
      return;      
    }
    //======================================================================
    
    public void findHeightBST(NodeBst startNode)
    {
        int count = 0;    // starts the count variable at 0
        NodeBst current = startNode;   // sets current node to the root node which stores the reference to the start of BST 
        while(current.rightChild!=null)     // executes untill the last right child of the BST
        {
            count++;                        // increases count by 1
            current = current.rightChild;   // updates the current to the right 
            
        }
        
        System.out.println("Height is"+" "+count);      // shows the height of the tree
       
    }
    //======================================================================
    // deletes specific element from the BST
    public NodeBst deleteElement(NodeBst startNode,int element)
    {
        NodeBst current = startNode;
        // First Case: if the BST is empty
        if (current == null)
            return current;
 
        // if the elemet is less than the currentNode element then skip to other node in the left sub tree
        if (element < current.element)
            current.leftChild = deleteElement(current.leftChild, element);          // recursively calls function
        // if the elemet is greater than the currentNode element then skip to further other node in the right sub tree
        else if (element > current.element)
            current.rightChild = deleteElement(current.rightChild, element);    // recursively calls to function
        
        else {
            // Second Case: if node has one child or no child 
            
            // current Node has only one child or no child 
            if (current.leftChild == null) // if there is no left child of the current node
                return current.rightChild;
            else if (current.rightChild == null)    // if there is no right child of the current node
                return current.leftChild;       
 
            // Third Case: if the node has two child: left child and right child 
            // finds successor which is smallest value in the right sub tree 
            current.element = findMinimum(current.rightChild);   // calls to findMinimum funtion to return the smallest element in the right sub tree
 
            // deletes the successor
            current.rightChild= deleteElement(current.rightChild, current.element); // recursively calls the function 
        }
 
        return current;
    }
    
    //======================================================================
    
    public void doDepthFirstSearch(NodeBst startNode)
    {
        if(startNode!=null)       // base condition
          {
             System.out.println(startNode.element);    // displays the element
             doDepthFirstSearch(startNode.leftChild);          // recursively calls and passes the left child of the BST
             doDepthFirstSearch(startNode.rightChild);       // recursively calls and passes the right child of the BST
          }
    }
    
    // function that uses queue for the visited nodes and travers the tree 
    public void doBredthFirstSearch(NodeBst startNode)
    {
        //declares the queue	
        Queue<NodeBst> q= new LinkedList<>();
        q.add(startNode);   // adds the root node to the q 
       
        while(!(q.isEmpty()))       // executes until it is not empty 
        {
             startNode = q.remove();    // removes the first node and stores the reference to the startNode
            System.out.println(startNode.element);      // displays the visited Node 
            if(startNode.leftChild!=null)                   // if the left child is not null of the node
            {
                q.add(startNode.leftChild);             // adds the neighbouring node to the queue
            }
          if(startNode.rightChild!=null)          // if the right child is not null of the node
           {
            q.add(startNode.rightChild);    // adds the neighbouring node to the queue
          } 
      }  
        
  } 
    
}  
