package com.example.skor.util;

public class MathUtil {


 public static int getRandom(int max){ return (int) (Math.random()*max); }

 public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }


}
