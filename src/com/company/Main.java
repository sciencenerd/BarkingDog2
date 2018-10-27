package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        //wake up if the dog is barking before 0800 or after 2200

        if((barking) && (hourOfDay <8 || hourOfDay >22)){
            barking =true;
            return barking;
            //if hour of day <0 or >23 return false
        }else if((barking) && (hourOfDay <0 || hourOfDay >23)){
            barking=false;
            return barking;
            //if not barking return false
        }else if (!barking){
            barking=false;
            return barking;
        }
        //if none of the above, return false
        return false;

    }
}
