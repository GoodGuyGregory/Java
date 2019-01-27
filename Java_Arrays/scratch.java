/*Jshell: /open scratch.java
  to utilize this datasctructure in terminal*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// int[][] scoreCards = {

String[] friends = {
                    "Greg",
                    "Ryan",
                    "Xiao",
                    "Jake"};

// Arrays.sort(<array>);
//Arrays.sort(friends, Comparator.comparing(String::length));
//
// Assume that you have a class representing Planet. It has a method named getDistanceInAstromicalUnits that helps figure out the distance from the Sun.
//
// Instances of the Planet class are created and placed in an Planet[] array named planets.
//
// Which code snippet would allow you to sort the planets array by distance?

// Arrays.sort(planets, Comparator.comparing(Planet::getDistanceInAstromicalUnits));

//method call in picklunch spots is Varargs
public String pickLunchSpot(String... spots){
  System.out.printf("Randomly Picking %d Lunch spots %n",
                        spots.length);
  if(spots.length == 0)
    return "Enter a place my dude";

  //number starts at zero in Random..
  Random random = new Random();
  return spots[random.nextInt(spots.length)];

}
