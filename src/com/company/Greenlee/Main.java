package com.company.Greenlee;

public class Main {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
    }

    static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        }
        if (weekday == true && vacation == false) {
            return false;
        }
        if (weekday == false && vacation == true) {
            return true;
        }
        return weekday;

        /*if(!weekday || vacation)
            return true;
        else
            return false;*/
    }
}