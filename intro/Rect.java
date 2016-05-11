public class Rect {
  public int width;
  public int height;

  public Rect( int width, int height ){
    this.width = width;
    this.height = height;
  }

  public int area(){
    return height * width;
  }

  public static void main( String [] args ){
    Rect myRect = new Rect(10, 20);

    int area = myRect.area();
    System.out.println(area);

  }
}