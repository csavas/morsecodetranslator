//NAME - Carolyn Savas
//SCHOOL - New Century Technology High School
//GRADE - 12th

import java.util.Map; //type of data structure
import java.util.TreeMap; //type of data structure
import java.util.Scanner; //for input and iterating
import static java.lang.System.*;

public class morsecode //this is an object
{
 private Map<String,String> pairs;
 private Map<String,String> morsep;
 
 public morsecode()
 {
   pairs = new TreeMap<String, String>();
   morsep = new TreeMap<String, String>();
 }

 public void putEntry(String entry)
 {
  String[] list = entry.split(" ");
  pairs.put(list[0], list[1]); //maps letter to morse code
  morsep.put(list[1], list[0]);
 
 }

 public String translate(String sent)
 {
  String output = "";
   for(char ch : sent.toCharArray()){ //chops up string 
     String s = String.valueOf(ch);
    if(ch == ' '){ //checks for spaces, adds tabs in place of spaces
      output+= "\t";
    }
    else if(!pairs.containsKey(s)){ //checks for special characters, adds characters back in
      output+= " "+ s;
    }
    else{
      output += " " + pairs.get(s); //adds morse code in replacement to letter
    }
  }
  return output;
 }
 public String translateM(String sent)
 {
  String output = "";
  String[] list = sent.split("/");
   for(String ch : list){ //chops up string 
     String[] mlist = ch.split(" ");
     for(String m : mlist){
       if(!morsep.containsKey(m)){ //checks for special characters, adds characters back in
         output+= m;
       }
       else{
         output += morsep.get(m); //adds morse code in replacement to letter
       }
     }
     output+= " ";
  }
  return output;
 }
 public String toString()
 {
  return pairs.toString().replaceAll("\\,","\n"); //if wanted to output letter to morse relationship, this would be called
 }
}