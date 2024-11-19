import java.util.LinkedList;

public class HashTableThree {
    public static void main(String args[]) {
        //make the hasthable
        LinkedList[] hashTable = new LinkedList[10];//no types so there's flexibility
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList();
        }

        //add values to show how it deals with collisions
        Character c = '1';
        hashTable[c.hashCode()%10].add(c);
        Character makar = '8';
        hashTable[makar.hashCode()%10].add(makar);
        Integer mcJesus = 97;
        hashTable[mcJesus.hashCode()%10].add(mcJesus);
        Integer goat = 99;
        hashTable[goat.hashCode()%10].add(goat);
        Integer mackinnon = 29;
        hashTable[mackinnon.hashCode()%10].add(mackinnon);
        Character landeskog = 'C';
        hashTable[landeskog.hashCode()%10].add(landeskog);


        for (LinkedList list: hashTable) {//print the hashtable
            for (Object cisco: list) {
                System.out.print(cisco + " -> ");
            }
            System.out.println();
        }
    }
}