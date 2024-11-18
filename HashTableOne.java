public class HashTableOne {
    public static void main(String args[]) {
        Object[] hashTable = new Object[10];//hashtable works as an array adding values based on their hash value
        Character c = new Character('1');
        hashTable[c.hashCode()%10] = c;//add c to index related to its hashcode - 9
        Integer num = new Integer(113);
        hashTable[num.hashCode()%10] = num;//add to index 3
        String s = "e";
        hashTable[s.hashCode()%10] = s;// add to index 1
        Integer num2 = 111;
        hashTable[num2.hashCode()%10] = num2;// add to index 1, replace anything that was already there
        //this is not ideal - this is a collision - collision = !ideal

        for ( Object thing : hashTable) {
            System.out.println(thing);
        }
    }
}