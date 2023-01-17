
public class SortCircle {
  public static void main(String[] args) {
    ComparableCircle[] circles = {
      new ComparableCircle(3.0), 
      new ComparableCircle(2.5),
      new ComparableCircle(10.6),
      new ComparableCircle(9.1)};
    java.util.Arrays.sort(circles);
    for (Circle circle: circles) {
      System.out.print(circle + " "); 
      System.out.println();
    }
  }
}
