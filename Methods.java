import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Methods {
    public static void addAndSort(LinkedList<Integer> l, int value){
        System.out.println("Before add and sort: "+l);
        l.add(value);
        //bubbleSort
        boolean doneSort=false;
        while (doneSort==false) {
            //will not go into the if loop if it is sorted. thus doneSort will be true
            doneSort=true;
            for (int i = 0; i < l.size() - 1; i++) {
                //if first element is larger then second element. swap position of first and second element
                if (l.get(i)>l.get(i+1)){
                    int temp=l.get(i);
                    l.set(i,l.get(i+1));
                    l.set(i+1,temp);
                    doneSort=false;
                }
            }
        }
        System.out.println("After add and sort: " +l);
    }

    public static LinkedList<Integer> swapBaseOnIndex(LinkedList<Integer> l, int firstIdx, int secondIdx){
        //temp hold the value of the first idx
        int temp=l.get(firstIdx);
        l.set(firstIdx,l.get(secondIdx));
        l.set(secondIdx,temp);
        return l;
    }

    public static int findValue(LinkedList<Integer>list,int searchVal){
        int temp=0;
        if (list.contains(searchVal)){
            //if search value exist in ll, add index
            for (int i=0;i<list.size();i++){
                if (list.get(i)==searchVal)
                    temp=i;
            }
        }
        else{
            return -1;
        }
        return temp;
    }

    public static void addAndSortHash(HashMap<Integer,Integer>m, int value){
        System.out.println("Before add and sort(Hash): "+m);
        m.put(6,value);
      //bubbleSort
        boolean doneSort=false;
        while (doneSort==false) {
            //will not go into the if loop if it is sorted. thus doneSort will be true
            doneSort=true;
            for (int i = 0; i < m.size() - 1; i++) {
                //if first element is larger then second element. swap position of first and second element
                if (m.get(i)>m.get(i+1)){
                    int temp=m.get(i);
                    m.replace(i,m.get(i+1));
                    m.replace(i+1,temp);
                    doneSort=false;
                }

            }
        }
        System.out.println("After add and sort(Hash): " +m);
    }

    public static HashMap<Integer,Integer> swapBaseOnIndexHash(HashMap<Integer,Integer>m, int firstIdx, int secondIdx){
        //temp hold the value of the first idx
        int temp=m.get(firstIdx);
        m.replace(firstIdx,m.get(secondIdx));
        m.replace(secondIdx,temp);
        return m;
    }

    public static int findValueHash(HashMap<Integer,Integer>m,int searchVal){
        int temp=0;
        if (m.containsValue(searchVal)){
            //if search value exist in ll, add index
            for (int i=0;i<m.size();i++){
                if (m.get(i)==searchVal)
                    temp=i;
            }
        }
        else{
            return -1;
        }
        return temp;
    }
}
