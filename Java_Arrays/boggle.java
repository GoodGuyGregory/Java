public class boggle{

public static void main(String[] args) {
  char[][] boggle = {
          {'C', 'A', 'T'},
          {'D', 'R', 'I'},
          {'L', 'O', 'G'}
  };

  System.out.printf("-------------%n");
  for (int i = 0; i < boggle.length; i++) {
    for (int j = 0; j < boggle[i].length; j++) {
      System.out.printf("| %s ", boggle[i][j]);
     }
     System.out.printf("|%n-------------%n");
  }

  }
}
