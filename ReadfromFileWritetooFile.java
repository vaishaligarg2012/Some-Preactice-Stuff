import java.io.*;
class ReadfromFileWritetooFile{
   public static void main(String args[]) throws IOException{
       FileInputStream fr=new FileInputStream("d:/ionic/test.txt");
       BufferedReader br1=new BufferedReader(new InputStreamReader(fr));
       String str=br1.readLine();

       FileWriter fis=new FileWriter("d:/ionic/test1.txt");
       PrintWriter pr = new PrintWriter(fis);
       pr.println(str);
       pr.flush();
       
       
  }
 }