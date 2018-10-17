public class ReverseString{
    public static void main(String[] args){
        String str="This String to be reverse by words";
      
       String[] words = str.split(" ");
      
       String reverserString="";
      String r="";
      for(int i=words.length-1;i>=0;i--){
        System.out.println(words[i]);

       String word = words[i];
       String rev="";
      r=r+words[i]+" ";
   System.out.print(r);
        for(int j=word.length()-1;j>=0;j--){
           rev=rev+word.charAt(j);
         }
 
        reverserString = reverserString+rev+" ";
     }
     System.out.println(str);
     System.out.print("Reverse String is "+reverserString);
   }
  
 }