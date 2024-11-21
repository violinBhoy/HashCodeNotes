import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordHashTable {
    public static void main(String args[]) {
        int size = 1429;
        LinkedList[] hashTable = new LinkedList[size];//no types so there's flexibility
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList();
        }

        try {
            Scanner read = new Scanner(new File("commonWords.txt"));
            int count = 0;
            while (read.hasNextLine()) {
                String s = read.nextLine();
                hashTable[Math.abs(s.hashCode()%size)].add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found you poopoo head");
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.next();
        int code = Math.abs(word.hashCode()%size);
        boolean found = false;
        for (int i = 0; i < hashTable[code].size(); i++) {
            if (word.equals(hashTable[code].get(i))) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}