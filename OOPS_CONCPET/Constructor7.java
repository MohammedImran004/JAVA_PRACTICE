public class Constructor7
{
  float a=55.5f;
  Constructor7()
  {
    this(20.5f);
  }
  Constructor7(float a)
  {
    System.out.println("Pen="+ a );
  }
  public static void main(String[] args)
  {
    Constructor7 con = new Constructor7();
  }
}

