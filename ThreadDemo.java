public class ThreadDemo extends Thread{
 public static void main(String argv[]){
 ThreadDemo t = new ThreadDemo	(); 
 t.run(); 
 t.start(); 
 } 
 public void run(){
 System.out.println("run-test");
 }
 }