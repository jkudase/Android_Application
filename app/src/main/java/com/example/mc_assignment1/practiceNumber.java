package com.example.mc_assignment1;


public class practiceNumber {

    private  static int practiceNumber=0;

    public static int getData(){
        return (practiceNumber%3)+1;
    }

    public static void setData(int d){
        practiceNumber=d;
    }
}
