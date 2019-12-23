/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;


import java.util.Scanner;

/**
 *
 * @author gawitt
 */
public class Lab_4 {

    public static double cTof(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
        double celsius = input.nextDouble();
        return 9 * celsius / 5 + 32;
        
    }// part 1 Celsius to Fahrenheit converter 
    
    public static double fToc(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        return fahrenheit / 9 * 5 - 32;
        
    }// part 2 Fahrenheit 
    
    public static int operator(int a,int b, char ch){
        
        switch(ch){
            case '+': return a + b;
            case '*': return a * b;
            case '-': return a - b;
            case '/': return a / b;
            case '%': return a % b;
            default: return 0;
        }// switch
    }// part 3 operator
    
    public static double operator(double x, double y, char ch){
        
        switch(ch){
            case '+': return x + y;
            case '*': return x * y;
            case '/': return x / y;
            case '-': return x - y;
            default: return 0;
        }// Switch  
        
    }// part 4 operator
    
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 10){
           int pick = (num % 10);
           sum += pick;
           num = num /10;
        }//while
        sum += num; //last number
        return sum;
    }// part 5 sumOfDigits
    
    
    
   
public static void main(String [] args){
        
        System.out.println(cTof());
        System.out.println(fToc());
        System.out.println (operator(12,14,'*');
        System.out.println(operator(12.0,34.0,'+'));
        
    }//main
    
}// class
