/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coh.greetinglibrary2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 001320702
 */
public class GreetingStarter {
    public static void main(String[] args) {
        System.out.println(getSalutation());
    }

    public static String getSalutation() {
        Random rn = new Random();
        int key = rn.nextInt(8);
        ArrayList<String> salutations = new ArrayList<String>();
        salutations.add("Hei");
        salutations.add("Moi");
        salutations.add("Skudaa");
        salutations.add("Hoi");
        salutations.add("Morjensta");
        salutations.add("Huomenta");
        salutations.add("Terve");
        salutations.add("Hejsan");
        return salutations.get(key);
    }
}
