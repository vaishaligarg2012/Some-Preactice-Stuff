class TestMultiplecatchBlock1{
    public static void main(String args[]){

     try{
     int a[]=new int[5];
     a[5]=30/0;
     
 }

 catch(Exception e){
System.out.println("Common task exception");
 }
catch(ArrayIndexOutOfBoundsException  e){
   System.out.println("Task 2 Completed");
 }
catch(ArithmeticException e ){
 System.out.println("Task1 completed");

  }

   System.out.println("rest of the code");
}
}