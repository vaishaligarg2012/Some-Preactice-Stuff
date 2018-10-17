Upcasting : converting a subclass type to a superclass type is know as up casting.

example
  class Super{
     void sample()
     {
      System.out.println("methdo from super class");
    }
}

class Subclass extends Super{

      void sample(){
System.out.println("method from sub class");
    
 }

public static void main(String [] args){
       Super obj=new SubClass();
       obj.sameple();
  }
 }