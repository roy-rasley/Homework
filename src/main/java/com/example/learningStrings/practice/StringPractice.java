package com.example.learningStrings.practice;

import jdk.swing.interop.SwingInterOpUtils;

public class StringPractice {
    public static void main(String args[]){
        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        String subStr = "";

        boolean isEqualsTrue = false;
        boolean isEqualsIgnoreCaseTrue = false;

        //This will return the first char of the string
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(4);

        if(str.equals(allUpper)) {
            isEqualsTrue = true;
        }else {
            isEqualsTrue = false;
        }

        if(str.equalsIgnoreCase(allUpper)) {
            isEqualsIgnoreCaseTrue = true;
        }else {
            isEqualsIgnoreCaseTrue = false;
        }

        subStr = str.substring(0, 6).trim();

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 1 index is: " + ch2);
        System.out.println("Character at 4 index is: " + ch3);

        System.out.println("Are str and allUpper equals- Ignore Case  : " + isEqualsIgnoreCaseTrue);
        System.out.println("Are str and allUpper equals  : " + isEqualsTrue);

        System.out.println("Original string: " + str + " - Substring :" + subStr);




        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        System.out.println("Question #1 What is the index of the last letter in the string");
        System.out.println(str.length()-1);

        // 2) Using the same string as above, what character is located at the 10th index?

        System.out.println(str.charAt(10));

        // 3)Do a check to see if the character at index 10 and 15 the same?
            var same = false;
            if(str.charAt(10)==str.charAt(15)){
                same = true;
                System.out.println("same = "+same);
            }else {
                same=false;
                System.out.println("same = "+same);
            }

        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
                var areDifferent=true;

            if(str.charAt(0)==str.charAt(5)){
                areDifferent=false;
                System.out.println("Different Characters at indexes 0 & 5 = "+areDifferent);
            }else{
                areDifferent=true;
                System.out.println("Different characters at indexes 0 & 5 = "+areDifferent);
            }

        //length()
        System.out.println(str.length());
        //equals()
        var string2 = "Learn string handling";
        if(str.equals(string2)){
            System.out.println("The two strings are equal");
        }
        //equalsIgnoreCase()
        var string3 = "LEARN STRING HANDLING";
        if(str.equalsIgnoreCase(string3)){
            System.out.println("Ignoring the casing, the strings are equal");
        }
        //charAt()
        System.out.println("The first character in the string is "+str.charAt(0));
        //contains()
        if(str.contains("string")){
            System.out.println("The string contains the word \"String\"");
        }
        //substring()
        var learn = str.substring(0,4);
        if(str.contains(learn)){
            System.out.println("The parent string contains the substring \"String\" ");
        }
        //startsWith
        if(str.startsWith("l")){
            System.out.println("The string starts with \"l\"");
        }
        //endsWith
        if(str.endsWith("g")){
            System.out.println("The string ends with \"g\"");
        }
        //toLowerCase()
        var capString = "THIS STRING IS WAS IN ALL CAPS BUT THIS METHOD SETS IT ALL TO LOWERCASE.";
        System.out.println(capString.toLowerCase());
        //toUpperCase()
        var lowerCaseString = "this string was in all lowercase but this method made it all caps";
        System.out.println(lowerCaseString.toUpperCase());
    }
}
