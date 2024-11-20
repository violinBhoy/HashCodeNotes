import java.util.LinkedList;

public class LeinTable {//make a hashtable of 50 random ints with fewest collisions and memory usage
    public static void main(String args[]) {
        LinkedList[] hashTable = new LinkedList[50];//no types so there's flexibility
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList();
        }

        for (int i = 0; i < 50; i++) {
            Integer rando = (int)((Math.random())*100)+1;
            hashTable[rando.hashCode()%50].add(rando);
        }

        for (LinkedList list: hashTable) {//print the hashtable
            for (Object cisco: list) {
                System.out.print(cisco + " -> ");
            }
            System.out.println();
        }
    }
}