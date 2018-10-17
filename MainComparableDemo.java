import java.util.*;

class MainComparableDemo{
   public static void main(String[] args){
  ArrayList<Student> al=new ArrayList<Student>();
  al.add(new Student(101,"Vaishali",50));
  al.add(new Student(108,"Garg",90));
  al.add(new Student(103,"Maliyan",23));

  Collections.sort(al);
  for(Student st:al){
    System.out.println(st.name+" "+st.age+" "+st.rollNo);
   }
 }
}