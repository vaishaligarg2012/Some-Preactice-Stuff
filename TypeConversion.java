public class TypeConversion {
public static void main(String[] args) {
StringBuffer sb1 = new StringBuffer("Amit"); 
StringBuffer sb2= new StringBuffer("Amitq"); 
String ss1 = "Amit"; 
System.out.println(sb1==sb2); 
System.out.println(sb1.equals(sb2)); 
System.out.println(sb1.equals(ss1)); 
System.out.println("Poddar".substring(3));
}
}