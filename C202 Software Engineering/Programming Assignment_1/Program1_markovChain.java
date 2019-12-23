/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1_markovchain;


/**
 *
 * @author Greg
 */
public class Program1_markovChain {
     
public static void algorithm1(Matrix m1, Matrix m2){
    for (int i = 0; i < 50; i++) {
       
        m2 = m2.multiplyMatrix(m1);
        
        System.out.println(m2);
        System.out.println("Instance: Q" + i );
       
     }//for
    System.out.println("Done!");
}//multi

public static void algorithm2(Matrix m1, Matrix m2){
    Matrix temp; // hard coded data
    for (int i = 0; i < 10; i++) { 
        
        temp = m1.multiplyMatrix(m2); //temp
        m1 = m2; //switch value
        m2 = temp;//switch for m2 to equal the previous Q
        
        System.out.println(i);//i
        System.out.println(m1); //m1
    }//for
}//alg2

public static void main(String[] args) {
    
    //passing argument 
    double[][] temp = {{0.9,0.05,0.05},{0.05,0.9,0.05},{0.05,0.05,0.9}};

    //copied arrays for the process to begin
    Matrix m1 = new Matrix(temp); 
    Matrix m2 = new Matrix(temp);
    
    //Algorithm1
    algorithm1(m1,m2);
    
    //Algorithm2
    algorithm2(m1,m2);
    
    
    

    
    }//main
    
}//class
