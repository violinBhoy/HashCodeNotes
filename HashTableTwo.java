import java.util.LinkedList;

public class HashTableTwo {
    public static void main(String args[]) {
        LinkedList[] hashTable = new LinkedList[5];
        for (LinkedList list: hashTable) {
            System.out.println(list);
        }
        for (int i = 0; i < hashTable.length; i++) {//a hash table has elements of linked lists
            hashTable[i] = new LinkedList();
        }
        for (LinkedList list: hashTable) {
            System.out.println(list);
        }
    }
}