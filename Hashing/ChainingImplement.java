import java.util.LinkedList;
import java.util.ArrayList;

class ChainingImplement {
    
    ArrayList<LinkedList <Integer>> table;
    int bucket;

    ChainingImplement(int bucket) {
        this.bucket = bucket;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i < bucket; i++) {
            table.add(new LinkedList<>());
        }
    }

    void insert(int key) {
        int ind = key % bucket;
        table.get(ind).add(key);
    }

    boolean search(int n) {
        int ind = n % bucket;
        LinkedList<Integer> list = table.get(ind);
        return list != null && list.contains(n);
    }

    void delete(int key) {
        int ind = key % bucket;
        table.get(ind).remove((Integer)key);
    } 

    public static void main(String [] args) {
        ChainingImplement ci = new ChainingImplement(7);
        ci.insert(70);
        ci.insert(71);
        ci.insert(56);
        ci.insert(9);
        ci.insert(72);
        System.out.println(ci.search(70));
        ci.delete(70);
        System.out.println(ci.search(70));
    }
}