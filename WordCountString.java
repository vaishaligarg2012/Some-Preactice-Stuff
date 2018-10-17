class WordCountString{
     public static void main(String[] args){
       String str="some data here";
       int len=str.length();
  int count=0;
       System.out.println(len);
        char st[]= str.toCharArray();
        System.out.println(st[0]);  
        char space=' ';
       for(int i=0;i<len;i++){
        if(st[i]==space){
      count++;
     }

     }  
System.out.println(count+1);  
   }
 }

