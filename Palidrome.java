class Palidrome{
   public static void main(String[] args){

      String str="abcba";
      int len=str.length();
      int temp=0;
     for(int i=0;i<len-1;i++){
         for(int j=len-1;j>0;j--){
         if(str.charAt(i)==str.charAt(j)){
           temp=1;
         }
        else if(str.charAt(i)!=str.charAt(j)){
           temp=2;
         }
        }
     }
    if(temp==1){
    System.out.println("String is pal");
    }else{
    System.out.println("Not");
  }
  }

}