import java.io.*;

class Demo implements Serializable{
   public int a;
   public String b;

   public Demo(int a, String b){
   this.a=a;
   this.b=b;

  }
} 

class Test3Serializable {
   public static void main(String[] args){
    Demo obj= new Demo(1,"Vaishali");
    String fileName="file.ser";
 //Serialization
    try{
      FileOutputStream file=new FileOutputStream(fileName);  //we can use fileoutputreader also so that is can work. form  java.io.*;
      ObjectOutputStream  out=new ObjectOutputStream(file);

      out.writeObject();

      out.close();
      out.close();
      System.out.println("Object has been serialized");

  }
catch(IOException e){
  System.out.println("IOEXception is catched");
 }

    Demo object1=null
 // Deserialization 
      try{
       FileInputStream file=new FileInputStream(fileName);
       ObjectInputStream in= new ObjectInputStream(file);
       object1= (Demo)in.readObject();

       file.close();
       in.close();

   System.out.println("Object has deserialized");
   System.out.println("a ="+ object1.a);
   System.out.println("b="+ object1.b); 
        
     
      
   }catch(IOException e){
     System.out.println("IOException is catched");
  }

  catch(ClassNotFoundException ex){
   System.out.println(ex);
 }
   }
}