public class Check{
   public static void main(String args[]){
   try{
    throw new TestThrow();
   }catch(TestThrow e){
     System.out.println("we get some new stuff");
    }
    finally{
     System.out.println("some final stuff");
    }
 }
}