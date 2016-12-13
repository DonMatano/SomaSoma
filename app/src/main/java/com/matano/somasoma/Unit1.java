package com.matano.somasoma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.Subject;

/**
 * Created by matano on 26/11/16.
 */

public class Unit1
{

    static String[] arrayTopic = new String[]{
            "Definition of DBMS", "Components of DBMS",
            "Advantages and Disadvantages of DBMS",
            "Characteristics of database approach", "Data models",
            "DBMS architecture", "Data independence"
    };

   public static ArrayList<String> getTopics(int unitNumber)
   {
       switch (unitNumber)
       {
           case 1:
               return new ArrayList<>(Arrays.asList(arrayTopic));
       }

       return null;
   }
}
