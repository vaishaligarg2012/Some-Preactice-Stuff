interface Check{
    static int x=10;
    public void add();
}

class Test implements Check{
      
       public void add(){

    System.out.println("Some code here " +x);
  }

  
 }

class Demo {
public static void main(String args[]){
      Test obj=new Test();
      obj.add();
  }

 }