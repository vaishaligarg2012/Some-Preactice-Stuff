import java.io.*;
class Student implements Serializable{
public  transient int x;
public     String y;
    public Student(int x, String y){
    this.x=x;
    this.y=y;
   }
}

class SerializeableTest{
    public static void main(String[] args){
      Student st=new Student(50,"Vaishali");
//Serialization....
    try{
        
      FileOutputStream fos=new FileOutputStream("SomeTestFile.ser");
      ObjectOutputStream obj=new ObjectOutputStream(fos);
      obj.writeObject(st);

     fos.close();
     obj.close();       

     }catch(IOException e){
      System.out.println(e);
     }        
    

   //Deserialization
System.out.println("After deserialize");
  Student object1=null;
   try{
    FileInputStream fis=new FileInputStream("SomeTestFile.ser");
    ObjectInputStream out=new ObjectInputStream(fis);
    object1 = (Student)out.readObject();
   
     System.out.println(object1.x+" "+object1.y);

    fis.close();
    out.close();
} catch(IOException e){
   System.out.println(e);
}   
catch(ClassNotFoundException e1){
   System.out.println(e1);
 }
 }
  
}