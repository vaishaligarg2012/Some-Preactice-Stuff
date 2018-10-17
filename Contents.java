import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
class Contents{
   public static void main(String  args[]) throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter Dir Path...");
   String dirPath=br.readLine();
   System.out.println("Enter Dir Name..");
   String dName=br.readLine();
   File f=new File(dirPath,dName);
     if(f.exists()){
     String arr[]=f.list();
     int n=arr.length;
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
      File f1=new File(arr[i]);
     if(f1.isFile()){
     System.out.println(": IS a File");
     } 

     if(f1.isDirectory()){
     System.out.println(":is a Directory");
      }
 }
System.out.println("No of Entries  in this directory "+n);
}
else{
System.out.println("Directory not found");
 } 
} 
     

  }
