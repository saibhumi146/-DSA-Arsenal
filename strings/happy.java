import java.util.*;

public class happy{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.println("your name is:"+name);

    //concantenation
    String firstname = "tony";
    String lastname = "stark";
    String fullname = firstname + "0" +lastname;
    System.out.println(fullname);
  
    //length
    System.out.println(fullname.length());

    //charAt
    for(int i =0;i<fullname.length();i++)
    System.out.println(fullname.charAt(i));
   
    //comparison of 2 strings 
    String name1 = "bhumi";
    String name2 = "bhumi";

    //s1>s2 : +ve value
    //s1==s2 :0
    //s2>s1 :-ve value

    if(name1.compareTo(name2) == 0){
      System.out.println("Strings are equal");
    }else{
      System.out.println("String are not equal");}
      //we can use name1==name2  but it fails in some cases

    String sentence  = "my name is Tony";
    //substring(beg index,end index)
    //String namez = sentence.substring(11,sentence.length());
    String namez = sentence.substring(1,8);
    System.out.println(namez);

    //strings are immutable 
    

    sc.close();
  }
}