package chapters.chapter3.chapter_4.chapter__5;
import java.util.*;
public class Que1 {
    /**
     * @param args
     */
    public static void main(String args[]) 
    { 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number");
  int n=sc.nextInt(); 
  int fact=1; 
  for(int i=1;i<=n;i++){  
    fact=(fact*i);

  } 
  System.out.println(fact);
}
}
