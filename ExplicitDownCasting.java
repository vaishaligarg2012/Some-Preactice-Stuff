class A{
   int i=10;
} 
class B extends A{

   int j=20;
}
class C extends B{
   int k=30;

}

class D extends C{
    int m=40;
}

public class ExplicitDownCasting{
    public static void main(String[] args){
   A a=new B();
   B b= (B) a;
    System.out.println(b.j);
   
   C c = new D();
  D d= (D)c;
 System.out.println(d.m);
 }

}