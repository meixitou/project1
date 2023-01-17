
public class Rectangle extends GeometricObject {
  double width;
  double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter(){
     double perimeter = 2*(width + height);
              return perimeter;
  }


      public int compareTo(Rectangle other){
              String t=Double.toString(getPerimeter());
              String o=Double.toString(other.perimeter);
      int comp = t.compareTo(o);

             return comp;
      }
}
