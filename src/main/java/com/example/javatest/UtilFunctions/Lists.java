package com.example.javatest.UtilFunctions;

import java.util.ArrayList;
import java.util.List;

public abstract class Lists {

    public static String EMPTYLISTERROR = "Couldn't do the partition, the list given is empty";
    public static String NULLSIZEVALUE = "Couldn't do the partition, the size of the sub Lists required is null";
    public static String SMALLLISTERROR = "Couldn't do the partition, the sub lists's size is bigger than the parent list's size";

    public static List<List> partition(List<Integer> liste, int taille) throws Exception {
        if (liste.isEmpty())
            throw new Exception(EMPTYLISTERROR);
        else if (taille == 0)
            throw new Exception(NULLSIZEVALUE);
        else if (liste.size() < taille)
            throw new Exception(SMALLLISTERROR);
        else {
            int index = 0;
            List<List> result = new ArrayList<>();
            List subList = new ArrayList<>();
            for (int nbr : liste) {
                subList.add(nbr);
                index++;
                if (index % taille == 0 || index == liste.size()) {
                    result.add(subList);
                    subList = new ArrayList<>();
                }

            }
            return result;
        }
    }


}
