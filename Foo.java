class Foo{
    public int a=3;

   public void addFive(){
   a+=5;
  System.out.println("f");
 }
}
class Bar extends Foo{
   public int a=8;
   public void addFive(){
   this.a+=5;
   System.out.println("b");
 }

public static void main(String[] args){
   Foo f = new Bar();
  f.addFive();

System.out.println(f.a);
 
 }
 
}