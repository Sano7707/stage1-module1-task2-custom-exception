package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{

    public StudentNotFoundException(){
        super();
    }
    public StudentNotFoundException(String s){
        super(s);
    }

}
