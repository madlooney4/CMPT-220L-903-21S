public class Assignment 7 {
    public static void main(String[] args) {  
        int arr[] ={6,55,30,4,40,160,2};  
         
        System.out.println("Before Bubble Sort:");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);   
        System.out.println("After Bubble Sort:");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
 
}
