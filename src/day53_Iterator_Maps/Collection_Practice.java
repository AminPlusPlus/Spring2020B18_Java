package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection_Practice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list);
    }

    public synchronized void append(){


    }
}
