public class OuterClass {
  void testMethod(int x){
      int y = x *2;

      class LocalClass{
          int a;
          int b;

          public LocalClass(){
              a = x;
              b = y;
          }

      }
 LocalClass localClass = new LocalClass(); 
      System.out.println(localClass.a);
      System.out.println(localClass.b);

  }

}

