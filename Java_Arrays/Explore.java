public class Explore {

  public static void main(String[] args) {
    //Creates a new Array on a single
    //Includes friends: Nick, Zack, Nathan, Ryan
    //String[] friends = {"Jake", "Tyler", "Zack", "Ryan", "Nick"};
    /*Jshell: /open scratch.java
      to utilize this datasctructure in terminal*/
    //Creates a New String Array with Three friends for the t@D array to fit
    String[] friends = {"Greg", "Jon", "Matt"};

    int[][] scoreCards = {
        {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
        {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
        {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
      };

      // for each friend loop thorough
      for (int i = 0;i < friends.length;i++ ) {
     // print their name
        System.out.printf("%s %n-------------------------%n",
                          friends[i]);
          // for each Hole
          for (int j = 0; j < scoreCards[i].length; j++ ) {
            //print score
            System.out.printf("Hole: #%d: %d %n",
                              j+1,
                              scoreCards[i][j]);
          }//for
        }//for
      }//main
}//class


    // //array iterator through the friends Array
    // //Enhanced for loop
    // for(String friend : friends){
    //   System.out.printf("Hey %s! The movie starts at 7pm, See you there! %n",friend);
    // }//for
    //
    // for (int i = 0;i < friends.length; i++ ) {
    //   String friend = friends[i];
    //   System.out.printf("Hey %s! The movie starts at 7pm, See you there! %n", friend);
    // }//for
    //
    // int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
    // for (int i = 0;i < bensScoreCard.length;i++ ) {
    //   System.out.printf("Hole #%d: %d %n",
    //                       i + 1,
    //                     bensScoreCard[i]);
  //  }//for
//}//class
