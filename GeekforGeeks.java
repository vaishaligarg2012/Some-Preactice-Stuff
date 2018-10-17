public class GeekforGeeks{
   public static void main(String args[]){
      String cfg[]= {"a","b","c","a","c"};
   int x=0;
 System.out.println(x++);
int t=0;
++t;
System.out.println(t);
       System.out.println(cfg.length);
       for(int i=0;i<cfg.length;i++){
         System.out.println("i value "+i);
         for(int j=i+1;j<cfg.length;++j){
           System.out.println("j value "+cfg[i].compareTo(cfg[j]));
           if(cfg[i].compareTo(cfg[j])==0){
               System.out.println(cfg[j]);
             }

         }
      }

  }
}