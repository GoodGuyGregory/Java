/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignment3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author gawitt
 */
public class Program3 {

    public static void main(String[] args) {
        long wordsFound = 0; //accumulator
        long wordsnotFound = 0; //accumulator
        double compsFound = 0; //accumulator
        double compsnotFound = 0; //accumulator

        MyLinkedList[] list = new MyLinkedList[26];
        

        for (int i = 0; i < list.length; i++) {
            list[i] = new MyLinkedList<String>();
        }
      
        try {
            File file = new File("dictionary.txt");
            Scanner in = new Scanner(file);

            while (in.hasNext()) //looks for next 
            {
                String words = in.nextLine().trim().toLowerCase(); //edit text to skim through easily

                list[words.charAt(0) - 97].add(words); //call the method
            }//while

            in.close(); //Close the File Reader. 
        }//try
        catch (Exception e) {
            e.printStackTrace();
        }//catch

//readfile   
        try {
            File oliverRead = new File("oliver.txt");
            Scanner in = new Scanner(oliverRead);

            while (in.hasNext()) {
                String words = in.nextLine().trim().toLowerCase();

                //list[words.charAt(0) - 97].add(words);

            }//while
            in.close();//close the IO File reader.
        }//try
        catch (Exception e) {
            e.printStackTrace();
        }//catch
        
        if(list == words){
            wordsFound++;
            compsFound++;
                    
                
        }
    
    }//main
}//class

