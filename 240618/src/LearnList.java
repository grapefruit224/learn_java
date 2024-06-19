import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LearnList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> linkList = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Spring");
        System.out.println(list.size());

        for(String s : list){
            System.out.println(s);
        }

        System.out.println(list.contains("Java"));
        list.add(null);
        System.out.println(list);

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 걸린시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkList 걸린시간" + (endTime - startTime));
    }
}
