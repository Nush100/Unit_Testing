package org.example;

public class CharacterGrader {

    public char markGrader(int marks){
        if(marks < 0){
            throw new IllegalArgumentException("Number is invalid");
        }
        else if(marks < 40){
            return 'F';
        }
        else if (marks < 55) {
            return 'D';
        }
        else if (marks < 65) {
           return 'C';
        }
        else if (marks < 75) {
            return 'B';
        }
        else{
            return 'A';
        }
    }
}
