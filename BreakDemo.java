public class BreakDemo {
public static void main(String[] args){
int j=~-3;
System.out.println("before data "+j); //2
while(j<7){
System.out.println(j);

if(j==3){
j+=2;
continue;
}

j++;
}
}
}