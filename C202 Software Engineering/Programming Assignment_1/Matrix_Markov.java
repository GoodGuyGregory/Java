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
public class Matrix {
    
    //Attributes
    private int r; // rows
    private int c; // columns
    private double[][] data; // double  2d array 
    
    //constructor that takes the array data as an argument
    public Matrix(double[][] temp){
        data = temp;//hard coded array values
        r = data.length; // rows 
        c = data[0].length; // col
    }//Matrix 
  
  //overloaded constructor from lab1   
  public Matrix(int row, int col){
    r = row; //number of rows
    c = col; // number of columns 
    data = new double[r][c]; //store in new 2d array   
    }//Matrix //constructor
    
 

public Matrix(){} //no args constructor

 //method to create an array with int args    

public Matrix multiplyMatrix(Matrix m2)throws IllegalArgumentException{
Matrix m3 = new Matrix(this.r, m2.c); //uses constructor form the previous 
if(this.c != m2.r){
    throw new IllegalArgumentException("Error invalid Argument");
}//if
for (int i = 0; i < this.r; i++) {
    for (int j = 0; j < m2.c; j++) {
        for (int k = 0; k < m2.r; k++) {
         m3.data[i][j] += this.data[i][k]*m2.data[k][j];
        }//k
      }//j
    }//i
return m3;
}//multiplyMatrix


 
    @Override
    public String toString(){
    String output = "";
    for (int i = 0; i < this.r; i++) {
        for (int j = 0; j < this.c; j++) {
            output += String.format("%.4f",data[i][j]) + "\t";// format to four decimal places on the string object 
        }//j
        output += "\n"; //new line
    }//i
    return output; //return the final array 
}//toString
  

    



     
}//class


