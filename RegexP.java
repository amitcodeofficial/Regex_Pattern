import java.util.regex.Pattern;

public class RegexP {

    public static String validate(String text){
//        Checking if our regex pattern is matching with out input if matches it sends Found
       if(Pattern.matches("p{1,}q{1,}", text)){
           return "Found";
       }else{
           return "Not found";
       }
    }

    public static void main(String[] args) {
//        Calling Method to validate our input with regex
        System.out.println(validate("pq"));
        System.out.println(validate("po"));
        System.out.println(validate("pr"));
    }
}
