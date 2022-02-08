import java.util.*;
public class Main {
    public static void main(String[] args) {
        //given sorted integer linked list <1,3,5,7,9,11>
        LinkedList<Integer>l=new LinkedList<Integer>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(11);
//        System.out.println(l);
        int value=2;
        Methods.addAndSort(l,value);
        System.out.println("after swaping base on index:"+Methods.swapBaseOnIndex(l,1,5));

        //generate 500 random int from 1000 to 9999 into a new linked list
        LinkedList<Integer>gLinkedList=new LinkedList<Integer>();
        Random r=new Random();
        for (int i=0;i<500;i++){
            //+1000 so in the event random int is 0. it will be 1000 as min
            int generated=1000 + r.nextInt(10000);
            gLinkedList.add(generated);
        }
//        System.out.println(gLinkedList);
        int generatedValue=1000+r.nextInt(10000);
//        System.out.println(generatedValue);
        System.out.println(Methods.findValue(gLinkedList,generatedValue));

        //more troublesome?
        //could work for addAndSort, however more troublesome as have to add idx as key.
        //could work for swapBaseOnIndex, both is the same. just need to replace 'put' with 'replace'
        HashMap m=new HashMap();
        m.put(0,1);
        m.put(1,3);
        m.put(2,5);
        m.put(3,7);
        m.put(4,9);
        m.put(5,11);
        Methods.addAndSortHash(m,value);
        System.out.println("after swaping base on index(Hash):"+Methods.swapBaseOnIndexHash(m,1,5));

        //generate 500 random int from 1000 to 9999 into a new Hashmap
        HashMap mWithRandom=new HashMap<>();
        for (int i=0;i<500;i++){
            //+1000 so in the event random int is 0. it will be 1000 as min
            int generated=1000 + r.nextInt(10000);
            mWithRandom.put(i,generated);
        }
//        System.out.println(mWithRandom);
//        System.out.println(generatedValue);
        //use same generated value from linkedlist
        System.out.println(Methods.findValueHash(mWithRandom,generatedValue));



    }
}
