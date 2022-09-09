package hashing;

import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable<Character,Integer> ht = new Hashtable<>();

        ht.put('J', 23);
        ht.put('K', 23);
        ht.put('L', 23);
        ht.put('M', 23);
        ht.remove('L');
        System.out.print(ht);

    }
}
