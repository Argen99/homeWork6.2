package com.company;

public class Skeleton extends Boss{
    public int numberOfarrows;


    public int getNumberOfarrows() {
        return numberOfarrows;
    }

    public void setNumberOfarrows(int numberOfarrows) {
        this.numberOfarrows = numberOfarrows;
    }
    //String str = Integer.toString(numberOfarrows);



    public String printInfo(){

        String str = Integer.toString(numberOfarrows);

        return str;
    }
}
