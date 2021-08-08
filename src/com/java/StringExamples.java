package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringExamples {

    //How to reverse String in Java
    public static String reverseString(String str){
        // Method 1
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
       //     return sb.toString();

        //Method 2
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

    //How to check Palindrome String in Java

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if (str.equalsIgnoreCase(rev)){
            return true;
        }
        else {
            return false;
        }
    }
    //Write a java program to capitalize first letter of each word in string?
    public static String capitalizeFirstLetterOfWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";

        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }

    public static String capitalizeWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";

        for(String w:words){
           capitalizeWord+=w.toUpperCase()+" ";
        }
        return capitalizeWord;
    }

    //Write a java program to reverse each word in string?
    public static String reverseEachWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";

        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return  reverseWord;
    }

    //Java program to find the percentage of uppercase, lowercase, digits and special characters in a String
    public static void charCounts(String str){
        int totalChae=str.length();
        int upperCase=0;
        int lowerCase=0;
        int digits=0;
        int others=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isUpperCase(ch)){
                upperCase++;
            }
            if(Character.isLowerCase(ch)){
                lowerCase++;
            }

            if(Character.isDigit(ch)){
                digits++;
            }
            else
                others++;
        }
        System.out.println("Uppercase letters are " + upperCase);
        System.out.println("Lowercase letters are " + lowerCase);
        System.out.println("Digits Are " + digits);
        System.out.println("Other Characters Are " + others);
    }

    //How to convert String to Integer and Integer to String in Java
    public static void ConvertStringToInteger(String str){
        int result1=Integer.parseInt(str);
        System.out.println(result1);

        int result2=Integer.valueOf(str);
        System.out.println(result2);
    }
    public static void ConvertIntegerToString(int num){
        String result1=Integer.toString(num);
        System.out.println(result1);

        String result2=String.valueOf(num);
        System.out.println(result2);
    }

    //How do you find duplicate characters in a string?
    public static void DuplicateCharFinder(String str){
        Map<Character,Integer> basemap=new HashMap<Character,Integer>();

        char [] charArrray=str.toCharArray();
        for(Character ch:charArrray){
            if (basemap.containsKey(ch)){
                basemap.put(ch,basemap.get(ch)+1);
            }
            else{
                basemap.put(ch,1);
            }
        }
        Set<Character> keys=basemap.keySet();
        for(Character ch:keys){
          //  if(basemap.get(ch)>1){        // this condition to get the char whose occurence is more than 1 time
                System.out.println(ch + "  is " + basemap.get(ch) + " times");
          //  }
        }
    }
    //Java Program to remove all white spaces from a String
    public static void removeWhiteSpace(String str){
        //1st way
        String noSpaceStr=str.replaceAll("\\s","");
        System.out.println(noSpaceStr);

        //2nd way
        char [] strArray=str.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<strArray.length;i++){
            if((strArray[i] != ' ') && (strArray[i] != '\t')){
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2=stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }

    //Java Program to count the number of words in a String
    public static int wordcount(String str){
        int count=0;

        char [] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
            if( ((i>0)&&(ch[i] !=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ){
                count++;
            }

        }
        return count;
    }

    // How to remove a particular character from a String
    public static String charRemoveAt(String str, int p){

        return str.substring(0, p) + str.substring(p + 1);

    }

    public static void main(String [] args){
     //   System.out.println(reverseString("My name is SACHIN"));
     //   System.out.println(reverseString("SACHIN"));

    //    System.out.println("String is Palindrome:" + isPalindrome("SACHIN"));
    //    System.out.println("String is Palindrome:" + isPalindrome("NITIN"));

    //    System.out.println(capitalizeFirstLetterOfWord("my name is sachin"));
    //    System.out.println(capitalizeFirstLetterOfWord("I am sachin dhote"));

    //   System.out.println(capitalizeWord("my name is sachin"));
    //   System.out.println(capitalizeWord("I am sachin dhote"));

    //    System.out.println(reverseEachWord("my name is sachin"));
    //   System.out.println(reverseEachWord("I am sachin dhote"));

        charCounts("My Name is Sachin123");
        charCounts("I am Sachin Dhote");

        ConvertStringToInteger("5");

        ConvertIntegerToString(15);
        DuplicateCharFinder("India is my country");
        removeWhiteSpace("India is my country");
        System.out.println("Number of words=" + wordcount("India is my country"));
        System.out.println(charRemoveAt("India is my country", 7));
    }

}
