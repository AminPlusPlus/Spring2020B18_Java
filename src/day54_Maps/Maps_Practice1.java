package day54_Maps;

import day01_FirstProgramming.classmates;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Jovid", LocalDate.of(1992 , 12 , 31) );
        classMates.put("Tabrez", LocalDate.of(1992 , 04 , 20) );
        classMates.put("Namik", LocalDate.of(1994 , 12 , 31) );

        boolean r1 = classMates.containsKey("Muhtar");

        System.out.println(classMates);
        System.out.println(r1);
    }
}
