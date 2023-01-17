import java.util.Comparator;

public class Test_InClass {
	
	
		  public static void main(String[] args) {
		    ComparableRectangle[] rectangles = {
		      new ComparableRectangle(3.4, 5.4), 
		      new ComparableRectangle(13.24, 55.4),
		      new ComparableRectangle(7.4, 35.4),
		      new ComparableRectangle(1.4, 25.4)};
		    java.util.Arrays.sort(rectangles, new Comparator<ComparableRectangle>() {
		        @Override
		        public int compare(ComparableRectangle r1, ComparableRectangle r2) {
		            double p1 = 2*(r1.width + r1.height);
		            double p2 = 2*(r2.width + r2.height);
		            return (int) (p1-p2);
		        }
		    });
		    for (Rectangle rectangle: rectangles) {
		      System.out.print(rectangle + " "); 
		      System.out.println();
		    }
		  }
		  
		  
		}
