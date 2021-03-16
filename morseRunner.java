//NAME - Carolyn Savas
//SCHOOL - New Century Technology High School
//GRADE - 12th

import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class morseRunner
{
 public static void main( String args[] ) throws IOException
 {
   morsecode trans = new morsecode(); //creates object, this object holds the letter/morse data and translates
   Scanner data = new Scanner(new File("dotdash.dat")); //import file of letter/morse code relationships
   int num = data.nextInt();
   data.nextLine();
   data.nextLine();
   for(int i=0; i < num; i++){
     trans.putEntry(data.nextLine()); //adds data from file to Map
   }
   out.println("MORSE CODE TRANSLATOR");
   out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   int me = 1;
   while(true){
     out.println("switch translators with phrase SWITCH");
     out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     out.println("ENGLISH TO MORSE CODE");
   while(me == 1){
     Scanner phrase = new Scanner(System.in);
     String original ="";
     out.println("enter word or phrase :: ");
     original = phrase.nextLine();
     if(original.equals("SWITCH")){
       me -=1;
       break;
     }
     System.out.println(trans.translate(original)); //outputs the translation
   }
   out.println("MORSE CODE TO ENGLISH");
     out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   while(me == 0){
     Scanner phrase = new Scanner(System.in);
     String original ="";
     out.println("enter word or phrase:: ");
     out.println("dot = letter o | dash = hyphen");
     out.println("seperate letters with one space | seperate words with a forward slash (/)");
     original = phrase.nextLine();
     if(original.equals("SWITCH")){
       me +=1;
       break;
     }
     System.out.println(trans.translateM(original));
 }
   }}
 }