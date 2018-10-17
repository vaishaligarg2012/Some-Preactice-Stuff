class Super{
     void sample()
     {
      System.out.println("methdo from super class");
    }

 void superMethod(){
    System.out.println("From super duper method");
 }

    
   
}

class Sub extends Super{
      void sample(){
      System.out.println("method from sub class");
    
 }
   void addSome(){
    System.out.println("Methods from addSome");
 }

   void demo(){
  System.out.println("I am from Demo Methods");

}

public static void main(String [] args){
      Super obj1=new Sub();
      Sub obj=(Sub) obj1;
     obj.demo();
  }
 }