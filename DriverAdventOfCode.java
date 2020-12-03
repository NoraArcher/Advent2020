import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

public class DriverAdventOfCode extends AdventOfCode {



  public static void main(String[] args) {


    System.out.println("\nDecember 1st");
    if (true) {
    int[] arr1 = {1721, 979, 366, 299, 675, 1456};
    int[] arr2 = {1287, 1366, 1669, 1724, 1338, 1560, 1328, 1886, 1514, 1863, 1876, 1732, 1544, 1547, 1622, 1891, 1453, 1936, 178, 1398, 1454,
                  1482, 1585, 1625, 1748, 1888, 1723, 717, 1301, 1840, 1930, 1314, 1458, 1952, 1520, 1994, 1924, 1873, 1283, 1036, 2005, 1987,
                  1973, 1926, 335, 1316, 1241,1611, 1593, 1754, 1254, 1768, 1824, 1752, 1559, 1221, 1855, 1907, 1917, 1975, 1782,1966,1395,1681,
                  1236,1572,437,1294,1614,1549,1769,1963,1953,1708,1382,1920,1884,1841,1055,1799,1818,1902,1541,1830,1817,1939,1311,1157,1997,
                  1269,2000,1573,1898,1467,1929,1530,1336,1599,1860,1455,1944,1339,1341,1874,1322,1340,1583,1765,1776,1304,1880,1237,1770,1011,
                  1634,1343,1864,1648,1588, 933, 1839,1245,780,1671,1989,1416,1268,1619,1399,1638,1319,1565,1318,1084,1397,1645,1760,1487,1892,
                  1980,1928,1808,1692,1159,1531,1575,457,1650,1308,1347,1427,1148,1705, 1356,1519,1490,1324,1387,1649,1780,1361,1866,1828, 1274,
                  1606, 1477,1956,734,1483,1513,1215,1927,1988,1686,1914,1424,968,1949,1999,1296,1615,1446,1698,1959,1983,2010,1984, 1859, 1838,1680,
                  1134, 1529, 1552, 1764, 1981, 1862, 1430, 1793, 1901, 1909};
    if ( ReportRepair1(arr1) == 514579) {
      System.out.println("ReportRepair1 test: SUCCESS");
    } else {
      System.out.println("ReportRepair1 test: FAIL");
    }
    System.out.println( "Answer: " + ReportRepair1(arr2) ); //691771
    if ( ReportRepair2(arr1) == 241861950) {
      System.out.println("ReportRepair2 test: SUCCESS");
    } else {
      System.out.println("ReportRepair2 test: FAIL");
    }
    System.out.println( "Answer: " + ReportRepair2(arr2) ); //???
    }

    System.out.println("\nDecember 2nd");
    if (true) {
      String[] arr1 = {"1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"};
      String[] arr2 = {};
      try (Scanner sc = new Scanner(new File("Dec2Passwords.txt")) ) {
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
          lines.add(sc.nextLine());
        }
        arr2 = lines.toArray(new String[0]);
      } catch (IOException e) {
        e.printStackTrace();
      }
      if ( PasswordCheckSled(arr1).equals("2") ) {
        System.out.println("PasswordCheckSled test: SUCCESS");
      } else {
        System.out.println("PasswordCheckSled test: FAIL, arr1 had " + PasswordCheckSled(arr1) + " good passwords.");
      }
      System.out.println("Answer is: " + PasswordCheckSled(arr2));
      if ( PasswordCheckToboggan(arr1).equals("1") ) {
        System.out.println("PasswordCheckToboggan test: SUCCESS");
      } else {
        System.out.println("PasswordCheckToboggan test: FAIL");
      }
      System.out.println("Answer is: " + PasswordCheckToboggan(arr2));
    }

    System.out.println("\nDecember 3rd");
    if (true) {
      ArrayList<String> arrL1 = new ArrayList<String>( Arrays.asList(
        "..##.......", "#...#...#..", ".#....#..#.", "..#.#...#.#",
        ".#...##..#.", "..#.##.....", ".#.#.#....#", ".#........#",
        "#.##...#...", "#...##....#", ".#..#...#.#"
        ) );
      ArrayList<String> arrL2 = new ArrayList<String>();
      try (Scanner sc = new Scanner(new File("Dec3Grid.txt")) ) {
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
          lines.add(sc.nextLine());
        }
        arrL2 = lines;
      } catch (IOException e) {
        e.printStackTrace();
      }
      if ( TobogganPath1(arrL1) == 7 ) {
        System.out.println("TobogganPath1 test: SUCCESS");
      } else {
        System.out.println("TobogganPath1 test: FAIL");
      }
      System.out.println("Answer is: " + TobogganPath1(arrL2) );
      if (  TobogganPath2(arrL1) == 336  ) {
        System.out.println("TobogganPath2 test: SUCCESS");
      } else {
        System.out.println("TobogganPath2 test: FAIL");
      }
      System.out.println("Answer is: " + TobogganPath2(arrL2)); //NOT 868184000
      }
    }

    System.out.println("\nDecember 4th");
    if (true) {
      ArrayList<String> arrL1 = new ArrayList<String>( Arrays.asList(
        "1", "2", "3", "4",
        "5", "6", "7", "8",
        "9", "10", "11"
        ) );
      ArrayList<String> arrL2 = new ArrayList<String>();
      try (Scanner sc = new Scanner(new File("Dec3Grid.txt")) ) {
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
          lines.add(sc.nextLine());
        }
        arrL2 = lines;
      } catch (IOException e) {
        e.printStackTrace();
      }
      //TobogganPath1(arrL1) == 7
      if ( true ) {
        System.out.println("this test: SUCCESS");
      } else {
        System.out.println("this test: FAIL");
      }
    }



  }




}
