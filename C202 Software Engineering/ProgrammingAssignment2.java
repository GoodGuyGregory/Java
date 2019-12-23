/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment2;

/**
 *
 * @author gawitt
 */
public class ProgrammingAssignment2 {

//    1. Triangle Pattern
    public static void triangle(int m, int n){
        if(m == 0){
            return; // base case    
        }//if
        
       if(m <= n){
           for (int i = 0; i < m; i++){         
               System.out.print("*");
            }//for
            System.out.println(""); 
            triangle(m + 1, n); //pop when m == 6
            for (int i = 0; i < m; i++) {
               System.out.print("*");
            }//for
            System.out.println(""); 
        }//if   
       //implied return;
       }//triangle
   
    
//    2. Section Numbers
    public static void numbers(String prefix, int levels){
        if(levels == 0){ // base case pops and prints the results of for loops
            System.out.println(prefix);
        }//if
        else{
            for(int c = 1; c <= 9; c++) {
                numbers(prefix + c + ".", levels - 1); // pops after decrementatio 
                }//for
       }//else
    }//section numbers
    
//    3. A Teddy Bear Picnic 
//    
//    Rules of Game.
//    1. if n is even, then you may give back exactly n/2 bears.
//    2. if n is divisibile by 3 or 4. then you may multiply the last two digits of n and give back
//    this many bears. (the last digit of n is n%10, and the next-to-last digit is ((n%100)/100).
//    3. if n is divisible by 5, then you may give back exactly 42 bears. 
//     if(tb != 42) base case 
   
    public static boolean bears(int teddybears){
        if(teddybears == 42) 
            return true; //base case. true 42 bears
        if(teddybears > 42) {
            if((teddybears % 5) == 0 && (teddybears -42  >= 42)){
                return bears(teddybears - 42); //return 42
                }//if divisible by 5
            
            if((teddybears % 2 == 0) && ((teddybears / 2) >= 42)) {
                return bears(teddybears / 2); //return half of the bears
            }//if even
            
            if((teddybears % 3 == 0 || teddybears % 4 == 0)  && ((teddybears - (teddybears % 10) * (teddybears % 100) / 10) >= 42)){
               int pick = (teddybears % 100); // gets the last two digits 
               int digit1 = pick / 10; // gets the tens place
               int digit2 = pick % 10; // get ones place
                return bears(teddybears - (digit1 * digit2)); // subtract the total
            }// if divisible by 4
                
        }//if
        
        return false; //base case less than 42.
                  
    }//bears
//    4. Find Longest Character
    
    public static void main(String[] args) {
//      1. Testing   
        triangle(3,5);
//      2. Section Numbers
        numbers("String",3);
                
//      3. Bears Game 
        System.out.println("");
        System.out.println(bears(250));
        System.out.println(bears(42));
        System.out.println(bears(84));
        System.out.println(bears(53));
        System.out.println(bears(41));
        System.out.println(bears(854));
        System.out.println(bears(1011));
        
//        
        
    }//main
    
}//class
