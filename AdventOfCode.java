import java.util.ArrayList;
public class AdventOfCode {


//December 1st
  public static int ReportRepair1(int[] arr) {
    int product = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] + arr[j] == 2020) {
          product = arr[i] * arr[j];
        }
      }
    }
    return product;
  }

  public static int ReportRepair2(int[] arr) {
    int product = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        for (int k = j+1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == 2020) {
            product = arr[i] * arr[j] * arr[k];
          }
        }
      }
    }
    return product;
  }

//December 2nd
  public static String PasswordCheckSled(String[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int min = Integer.parseInt(    arr[i].substring(  0, arr[i].indexOf('-')  )   );
      int max = Integer.parseInt(    arr[i].substring(  arr[i].indexOf('-') + 1, arr[i].indexOf(' ')  )   );
      char n = arr[i].charAt( arr[i].indexOf(':')  - 1);
      String s = arr[i].substring(  arr[i].indexOf(':') + 2, arr[i].length() );
      int sum = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == n) sum++;
      }
      if (sum >= min && sum <= max) count ++;
    }
    return ""+count;
  }

  public static String PasswordCheckToboggan(String[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int one = Integer.parseInt(    arr[i].substring(  0, arr[i].indexOf('-')  )   );
      int two = Integer.parseInt(    arr[i].substring(  arr[i].indexOf('-') + 1, arr[i].indexOf(' ')  )   );
      char n = arr[i].charAt( arr[i].indexOf(':')  - 1);
      String s = arr[i].substring(  arr[i].indexOf(':') + 2, arr[i].length() );
      int sum = 0;
      if (s.charAt(one - 1) == n) sum++;
      if (s.charAt(two - 1) == n) sum++;
      if (sum == 1) count ++;
    }
    return ""+count;
  }

//December 3rd
  public static int TobogganPath1(ArrayList<String> rows) {
    int trees = 0;
    if (rows.get(0).charAt(0) == '#') trees++;
    int len = rows.get(0).length();
    int current = 0;
    for (int i = 1; i < rows.size(); i++) {
      current += 3;
      if (current >= len) current -=  len;
      if ( rows.get(i).charAt(current) == '#' ) trees++;
    }
    return trees;
  }

  public static int TobogganPathGeneral(ArrayList<String> rows, int right, int down) {
    int trees = 0;
    int len = rows.get(0).length();
    int current = -1 * right;
    for (int i = 0; i < rows.size(); i+= down) {
      current += right;
      if (current >= len) current -=  len;
      if ( rows.get(i).charAt(current) == '#' ) trees++;
    }
    return trees;
  }
  public static int TobogganPath2(ArrayList<String> rows) {
    int a  = TobogganPathGeneral(rows, 1, 1);
    int b  = TobogganPath1(rows);
    int c  = TobogganPathGeneral(rows, 5, 1);
    int d  = TobogganPathGeneral(rows, 7, 1);
    int e  = TobogganPathGeneral(rows, 1, 2);
    return (a * b * c * d * e);
  }

//December 4th

}
