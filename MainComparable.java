import java.util.*;

class MainComparable{
   public static void main(String args){
  ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(101,"Vaishali",22));
al.add(new Student(102,"Garg",22));
al.add(new Student(103,"Maliyan",23));

Collections.sort(al);
for(Student st:al){
    System.out.println(st.name+" "+st.age+" "+st.rollNo);
 }
 }
 }