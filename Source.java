

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Validator {
    String checkComment(String comment) throws SpamCommentException{
        
        String[] wordArray = {"abcde", "Imno", "pqrst", "wxyz"};
        int count = 0;
                         
        String[] words=comment.split("\\s");
        
        var freqCaseSensitive = Arrays.stream(words)
                         .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
                         
        int s0, s1, s2, s3;
        if(freqCaseSensitive.get("abcde") != null){
            count += freqCaseSensitive.get("abcde");
        }
        if(freqCaseSensitive.get("Imno") != null){
            count += freqCaseSensitive.get("Imno");
        }
        if(freqCaseSensitive.get("pqrst") != null){
            count += freqCaseSensitive.get("pqrst");
        }
        if(freqCaseSensitive.get("wxyz") != null){
            count += freqCaseSensitive.get("wxyz");
        }
        
                         
        if(count > 2){
            throw new SpamCommentException("account ban due to spam comment");
        }
        else if(count > 0 && count <= 2){
            throw new SpamCommentException("spam comment");
        }
        else{
            return "comment is not spam";
        }
    }
    
    String commentTheString(String comment){
        try{
            
        }
        catch(){
            checkComment(comment);
        }
    }
}


class SpamCommentException extends Exception {
    
}


public class Source {
    public static void main(String[] args) throws Exception{
        
    }
}
