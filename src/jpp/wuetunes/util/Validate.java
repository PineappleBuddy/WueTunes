package jpp.wuetunes.util;

public class Validate {

    public static int requireNonNegative(int n){
        int a = 0;
        if(n >= 0){
            a == 1;
        }else {
            a == -1;
        }
        return a;
    }

    public static int requireBetween(int n, int min, int max){
        int a = 0;
        if(n < min || n > max){
            a = -1;
        }else {
            a == 1;
        }
        return null;
    }

    public static int requireLowerThan(int n, int max){
        int a = 0;
        if(n < max){
            a == 1;
        }
        else {
            a == -1;
        }
        return a;
    }

    public static <O> O requireNonNull(O o){

    }

    public static String requireNonNullNotEmpty(String s){

    }

}
