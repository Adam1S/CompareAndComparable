package com.company;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import com.sun.xml.internal.fastinfoset.tools.PrintTable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    /*
	    Napisz program, w którym utworzysz tablicę 20 dowolnych liczb całkowitych, a następnie
	    posortujesz tablicę w porządku rosnącym i malejącym, za każdym razem wyświetlając
	    wynik posortowania na ekranie. Wykorzystaj interfejs Comparator i anonimowe klasy
	    wewnętrzne.
	     */

        //int[] twentyNumbers=new int[20];
        Integer[] twentyNumbers={1,2,3,1,2,
                1,2,3,1,2,
                1,2,3,1,2,
                1,2,3,1,2,
                1,2,3,1,2};
        System.out.println("Nieposortowana tablica");
        System.out.println(Arrays.toString(twentyNumbers));

        Arrays.sort(twentyNumbers);

        System.out.println("Posortowana tablica");
        System.out.println(Arrays.toString(twentyNumbers));

        Arrays.sort(twentyNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return -(integer.compareTo(t1));
            }
        });

        System.out.println("Posortowana malejąco");
        System.out.println(Arrays.toString(twentyNumbers));

    }
}
