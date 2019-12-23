/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_arrays;

/**
 *
 * @author gawitt
 */
public class Lab_Arrays {

    final int CAPACITY = 30; //Max
    int size = 0; // starting amount
    
    int[] list = new int[CAPACITY];
      
     
    /** Load with index 
    */
    
    public void loadWithIndex(){
        for(int i = 0; i < list.length; i++){
            list[i] = i; //
            //echo
            System.out.println(i);
            
        }//for

        size = list.length; // load the size 
        
    }// loadwithIndex Method
    
    public void loadWithRandom(int number){
       for(int i = 0; i < list.length; i++){
           list[i] = (int) ( number * Math.random() + 1);
           System.out.println( "Index of " + i + "\n has the value of: " + list[i] );
           
       } // for loop
       
       size = list.length;
       
    }// Random number method 
    
    public int CalcofSum(){
      int  sum = 0; // initializer
      
    for(int i = 0; i < size; i ++){
            sum += list[i]; // accumulator 
        }// for loop
        
    return sum;
        
    }// CalcofSum
    
    public double calcAvg(){
       if (size > 0 )
        return  (double) CalcofSum() / size;
       else
        return 0;
    }// avg
    
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(list[i] + ",");
           if((i + 1) % 15 == 0) System.out.println("");
             
        }// for 
    }// display
            
    public int findLargest(){
        int largest = -1;
                
        for(int i = 0;i < size; i++){
            if( list[i] > largest){
                largest = list[i];
                System.out.println("Largest is now :" + largest + "at index " + i);
            }//if
           
        }//for
            
        return largest;
    }//findLargest
    
    public void listNumbersOver(int number){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(list[i] > number){
               System.out.println(list[i] + ","); 
               count++;
        }//if
    }// for
        
        System.out.println("there are " + count + " numbers over " + number);
    }// listNumbersOver
    
    public void add(int number){
        if (size < CAPACITY-1){
          
          list[size] = number;
          size++;
            System.out.println(number + "is added.");
          System.out.println("size is" + size);
        }//if
        else {
            System.out.println("at capacity");
        }// else
    }//add
    
    public int delete(int number){
        int temp = number;
        //search
        boolean found = false;
        int i = 0;
        while(!found && (i < size)){
            
            if(list[i] == number){    
                System.out.println("Found it!!");
                for(int j = i; j < size-1; j++){
                    list[j] = list[j+1];//move them up
                }// for
                found = true;
             }// if found
            
            i++;
            
         }// while
        if(!found)
            System.out.println(number + "not on list");
        
        return temp;
    
    }// delete
   
    public void showlist(){
        System.out.println("[ ");
        for
    }
    
    public void clear(){
        for (int i = 0; i < size; i++) {
            list[i] = 0;
            
        }// for 
        size = 0;
        System.out.println("Array Cleared:");
    }// clear     
        
    
            
            
            
    public static void main(String[] args) {
        
       Lab_Arrays ans = new Lab_Arrays(); // constructor for array object 
       
       ans.loadWithIndex();
       
        ans.loadWithRandom(50);
        System.out.println("the sum is: " + ans.CalcofSum());
        System.out.println("the average is: " + ans.calcAvg());
        
        ans.display();
       
        int temp = ans.findLargest();
        System.out.println("The largest is " + ans.findLargest());
        ans.numbersOver(50);
        
        ans.add(11);
        ans.add(23);
        
        for (int i = 0; i < 25; i++) {
        
        ans.add((int) (10 * Math.random() + 1);
        }// for 
              
        ans.delete(11);
        
        ans.display();
        
        ans.clear();
        
        ans.add(23);
        
        ans.display();
        
       
       
    }// main
    
}// class
