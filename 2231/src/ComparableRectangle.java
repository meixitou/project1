
public class ComparableRectangle extends Rectangle 
    implements Comparable<ComparableRectangle> {
  /** Construct a ComparableRectangle with specified properties */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override // Implement the compareTo method defined in Comparable 
  public int compareTo(Rectangle other){
      String t=Double.toString(getPerimeter());
      String o=Double.toString(other.getPerimeter());
int comp = t.compareTo(o);

     return comp;
}
  
  @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Width: " + getWidth() + " Height: " + getHeight() +
      " Perimeter: " + getPerimeter();
  }

@Override
public int compareTo(ComparableRectangle o) {
	// TODO Auto-generated method stub
	return 0;
}
}
