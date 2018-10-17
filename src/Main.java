interface Int1{
    int a=1;
    int hdfg=5;
    String str="fafga";
     void Foo();
    void Bar();
}
class Testy implements Int1{
  public void Foo(){
        System.out.println(a*hdfg);

    }
  public void Bar(){
        System.out.println(str);
    }
        }

public class Main  {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   Testy t1= new Testy();
   t1.Foo();
   t1.Bar();

    }
}
