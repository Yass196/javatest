package com.example.javatest.UtilFunctions;

import java.util.ArrayList;
import java.util.List;

public class Lists {


    public static List<List> partition(List<Integer> liste, int coef) throws Exception {
        if (liste.size() > coef) {
            int index = 0;
            List<List> result = new ArrayList<List>();
            List subList = new ArrayList<>();
            for (int nbr : liste) {
                subList.add(nbr);
                index++;
                if (index % coef == 0 || index == liste.size()) {
                    result.add(subList);
                    subList = new ArrayList<>();
                }

            }
            return result;
        } else
            throw new Exception("Couldn't do the partition, the coef is bigger than the list's size");
    }


}
