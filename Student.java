class Student implements Comparable<Student>{
  int rollNo;
  String name;
  int age;

  Student(int rollNo,String name, int age)
{
  this.rollNo=rollNo;
   this.name=name;
   this.age=age;
 }

public int compareTo(Student s){
   if(age==s.age){

  return 0; 
}
else if(age>s.age){
  return 1;

 }
else 
return 	-1;
   
  }
}