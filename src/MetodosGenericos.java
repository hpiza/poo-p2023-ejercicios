import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import com.iteso.calendar.Date;
import com.iteso.calendar.DateTime;
import com.sun.source.tree.Tree;

public class MetodosGenericos {

    public static void printList(List<?> list) {
        for(int i = 0; i < list.size(); i ++) {
            // Object element = list.get(i);
            System.out.printf("%2d %s\n", i, list.get(i));
        }
        System.out.println("-------------");
    }

    public static void print(Collection<?> coll) {
        int i = 0;
        for(Object element : coll) {
            System.out.printf("%2d %s\n", i ++, element);
        }
        System.out.println("-------------");
    }

    public static <T> int frequency(T find, Collection<T> coll) {
        int f = 0;
        for(T element : coll ) {
            if(find.equals(element)) f ++;
        }
        return f;
    }

    public static int maxInteger(Collection<Integer> coll) {
        if(coll.isEmpty()) return 0;
        Integer max = null;
        for(Integer element : coll) {
            if(max == null) max = element;
            else max = Math.max(element, max); // if(element > max) max = element;
        }
        //coll.add(45);
        return max;
    }

    public static double maxNumber(Collection<? extends Number> coll) {
        if(coll.isEmpty()) return 0;
        Number max = null;
        for(Number element : coll) {
            if(max == null) max = element;
            else max = Math.max(element.doubleValue(), max.doubleValue()); // if(element.doubleValue() > max.doubleValue()) max = element;
        }
        // coll.add(3.6); No se puede añadir
        return max.doubleValue();
    }

    public static <T> void changeQueue(Queue<? extends T> queue1, Queue<? super T> queue2) {
        if(queue1.isEmpty()) return;
        T obj = queue1.poll();
        queue2.offer(obj);
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 1; i <= 12; i ++) intList.add(i * 10);
        LinkedList<String> strList = new LinkedList<>();
        strList.add("public");
        strList.add("static");
        strList.add("void");
        strList.add("main");
        print(intList);
        print(strList);

        Set<Double> dblSet = new HashSet<>();
        dblSet.add(Math.E);
        dblSet.add(Math.PI);
        dblSet.add(-2.4567);
        print(dblSet);

        Queue<Date> dateQueue = new ArrayDeque<>();
        dateQueue.offer(new Date());
        dateQueue.offer(new Date(15, 3, 2023));
        dateQueue.offer(new Date(6, 7, 2023));
        dateQueue.offer(new Date());
        print(dateQueue);

        System.out.println(frequency(10, intList));
        //frequency("1", intList);
        System.out.println(frequency("java", strList));
        //frequency(3.5, strList);
        System.out.println(frequency(Math.PI, dblSet));
        System.out.println(frequency(new Date(), dateQueue));

        System.out.println("Max: " + maxInteger(intList));

        TreeSet<Byte> byteSet = new TreeSet<>();
        byteSet.add((byte) 3);
        byteSet.add((byte) 5);
        byteSet.add((byte) 8);

        Stack<Number> numberStack = new Stack<>();
        numberStack.push(12_456.75);
        numberStack.push(567.1f);
        numberStack.push(56082);
        numberStack.push(123_456_789_102L);
        numberStack.push((short) 45);
        numberStack.push((byte) 5);
        numberStack.push(new BigInteger("12034959607932830349343093"));
        numberStack.push(new BigDecimal(1234234.1234234));

        System.out.println("Max : " + maxNumber(byteSet));
        System.out.println("Max: " + maxNumber(dblSet));
        System.out.println("Max: " + maxNumber(numberStack));

        Queue<Integer> intQueue1 = new ArrayDeque<>();
        intQueue1.offer(3);
        intQueue1.offer(6);
        Queue<Integer> intQueue2 = new PriorityQueue<>();
        intQueue2.offer(7);
        intQueue2.offer(15);

        changeQueue(intQueue1, intQueue2);
        print(intQueue1); print(intQueue2);
        changeQueue(intQueue1, intQueue2);
        print(intQueue1); print(intQueue2);
        changeQueue(intQueue1, intQueue2);
        print(intQueue1); print(intQueue2);

        changeQueue(dateQueue, dateQueue);
        print(dateQueue);

        Queue<DateTime> timeQueue = new ArrayDeque<>();
        timeQueue.offer(new DateTime());
        timeQueue.offer(new DateTime(15, 3, 2021, 18, 56, 17));
        timeQueue.offer(new DateTime(6,9,2019, 23, 16, 28));
        //timeQueue.offer(new Date());

        dateQueue.offer(new DateTime(24, 7, 2016, 9,36,47));
        changeQueue(timeQueue, dateQueue);
        //changeQueue(dateQueue, timeQueue);
        print(dateQueue);
        print(timeQueue);


    }
}
