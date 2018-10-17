import java.util.*;

public class NewClassLocale{
    public static void main(String[] args){
     Locale geek1=new Locale("English","IN");
     Locale geek2=Locale.getDefault();
      System.out.println("Locale name: "+geek1);
      System.out.println("Locale Name Defult: "+geek2);
    //  System.out.println("\n Country Name : "+ geek1.getDisplayCountry);
      System.out.println("Country Name ISO 2-letter code: "+geek1.getCountry());
      System.out.println("geek1 equals to geek2: "+geek1.equals(geek2));

      Locale geek3=(Locale)geek2.clone();
     
      System.out.println("Locale geek3 is same as geek2: "+geek3);
      
      Locale[] geek4= Locale.getAvailableLocales(); 
      System.out.println("Installed Locales are: ");
      for(int i=1; i<geek4.length/10;i++){
      System.out.println(i+ ":"+geek4[i]);

        // Use of getDisplayLanguage() : 
        System.out.println("\ngeek2 Language : "
                        + geek2.getDisplayLanguage()); 
  
        // Use of getDisplayLanguage(Locale in) : 
        System.out.println("Language of in Locale : "
          + geek1.getDisplayLanguage(new Locale("France", "French"))); 
  
        // Use of getDisplayName : 
        System.out.println("\nUse of getDisplayName : "
                              + geek1.getDisplayName()); 
  
        // Use of getDisplayName(Locale in) : 
        System.out.println("Name of in Locale : "
          + geek2.getDisplayName(new Locale("English", "english"))); 
  
        // Use of getISO3Country() : 
        System.out.println("\nISO3 Country Name of geek3 : "
                                    + geek3.getISO3Country()); 
     }
    

     
  } 

 }