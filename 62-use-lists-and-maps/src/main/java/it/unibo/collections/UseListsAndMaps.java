package it.unibo.collections;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        Integer NUMBERS = 1000;
        List<Integer>coll = new ArrayList<>();
        for(int i = NUMBERS;i < 2000;i++){
        coll.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        LinkedList<Integer> secondList = new LinkedList<>coll);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        int temporaryVariable =coll.get(0);
         coll.set(coll.get(0),coll.size()-1);
         coll.set(coll.size()-1,temporaryVariable);     
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for(Integer e:coll){
            System.out.println(e);
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        final int LAST_ELEM = 100_000;
        long ArrayListInsertTime = System.nanoTime();

        for(int i = 1 ; i <= LAST_ELEM ; i++){
        coll.addFirst(i);
        }
       
        ArrayListInsertTime = System.nanoTime() - ArrayListInsertTime;

        long LinkedListInsertTime = System.nanoTime();
        
        for(int j = 1 ; j <= LAST_ELEM ; j++){
            secondList.addFirst(j);
        }

        LinkedListInsertTime = System.nanoTime() - LinkedListInsertTime;

        System.out.println(("ArrayList inserting 100_000 numbers in the Head time = "  + ArrayListInsertTime));
        System.out.println(("LinkedList inserting 100_000 numbers in the Head time = " + LinkedListInsertTime));

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
