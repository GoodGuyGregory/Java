public class Programmers {

  public void printMenu() {
    String[] programmers = {
            "Yukihiro Matsumoto",
            "David Nolen",
            "Grace Hopper",
            "Linus Torvalds",
            "You"
    };

    System.out.println("Choose a programmer:");
    // TODO: Print out a menu by looping through the programmers array.
    /*
      The menu should be in the form of (each on a line of its own, starting with 1):
      1. Yukihiro Matsumoto
      2. David Nolen
      ...
    */
    for(int i = 0 i < programmers.length; i++) {
    	System.out.printf("%d . %s %n",
                        i + 1,
                       programmers[i]);
    }//for

  }//printMenu

}
