package java_basic;
/*
--variable can be changed - data can be vary what we assign
-- data type specify what kind of data going to the variable
    eg:- int x;
-- programing code will execute line by line
 */
public class Variables {
    public static void main(String[] args) {
        int x;//declaring the variable here
        x = 34;// we are assigning the value to the variable
        // int x = 34; -- we can combine declaring and assignment in one line
        System.out.println(x);
        x = 23;
        System.out.println(23);
        System.out.println(x + 44); // + operator use to add integer values

        String  words; //string is a datatype use to store words or sentences (words is a variable)
        words = "This is a sentence";
        // String words = "This is a sentence"; -- we can combine declaring and assignment in one line
        System.out.println(words);

        System.out.println(words + " these is some mor words"); // + operator use to append something with the string

    }
}
