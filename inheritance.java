import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
class Continent
{
   String con;
  InputStreamReader  i = new InputStreamReader(System.in); 
  BufferedReader r  = new BufferedReader(i);
  
 void con_input() throws IOException
 {
       System.out.println("Enter Continent Name:  "); 
       con = r.readLine();    
 }
}
 
class Country extends Continent
{
 String cou ;
 
 void cou_input() throws IOException
 {
       System.out.println("Enter Country Name:  ");
       cou = r.readLine();    
 } 
}
 
class State extends Country
{
 String sta;
 void sta_input() throws IOException
 {
       System.out.println("Enter State Name:  ");
       sta = r.readLine(); 
 }
}
  
public class inheritance {

 public static void main( String argsp[] )throws IOException
 {
  State s = new State();
  s.con_input();
  s.cou_input();
  s.sta_input();
  
   System.out.println("\n\nContinent: "+s.con);
  System.out.println("Country: "+s.cou); 
  System.out.println("State: "+s.sta); 
 }
}