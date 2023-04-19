import java.util.*;

public class Colecciones {

    public static void main(String[] args) {
        Vector<String> strVector = new Vector<>();
        strVector.add("uno");   strVector.add("dos");
        strVector.add("tres");  strVector.add("cuatro");
        strVector.add("cinco"); strVector.add("seis");
        System.out.println(strVector);
        for(int i = 0; i < strVector.size(); i ++) {
            String s = strVector.get(i);
            strVector.set(i, s.toUpperCase());
        }
        System.out.println(strVector);
        strVector.set(3, "DOS");
        System.out.println(strVector);
        int index2 = strVector.indexOf("DOS");
        System.out.println(index2);
        int index4 = strVector.indexOf("CUATRO");
        System.out.println(index4);
        while(!strVector.isEmpty()) strVector.remove(0);
        // strVector.clear()
        System.out.println(strVector);

        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        //Añadir los elementos: 100, 150, 120, 100, 180, 200, 120, 180, 100.
        //Imprime el tamaño del conjunto.
        //Imprimir todos los elementos del conjunto. Como no contamos con índice, nos
        //conviene utilizar el ciclo for each
        intSet.add(100);intSet.add(150);
        intSet.add(120);intSet.add(100);
        intSet.add(100);intSet.add(180);
        intSet.add(200);intSet.add(120);
        intSet.add(180);intSet.add(100);
        System.out.println(intSet.size());
        for (int x:intSet) {
            System.out.println(x);
        }
        System.out.println(intSet);

        // Crea un mapa que utilice código hash y no admita nulos, que asocie número
        // con su nombre, tal que el nombre es la clave.
        // Insertar los primeros 5 pares: <uno, 1 >, <dos, 2 >, ...
        // Imprime los valores de tres y siete

        Map<String, Integer> strIntMap = new TreeMap<>();
        strIntMap.put("uno",1);
        strIntMap.put("dos",2);
        strIntMap.put("tres",3);
        strIntMap.put("cuatro",4);
        strIntMap.put("cinco",5);
        System.out.println(strIntMap);
        System.out.println(strIntMap.get("tres"));
        System.out.println(strIntMap.get("siete"));
        for(int value : strIntMap.values()) System.out.println(value);
        for(String key : strIntMap.keySet()) System.out.println(key + ", " + strIntMap.get(key));

        strIntMap = new HashMap<>();
        strIntMap.put("uno",1);
        strIntMap.put("dos",2);
        strIntMap.put("tres",3);
        strIntMap.put("cuatro",4);
        strIntMap.put("cinco",5);
        System.out.println(strIntMap);

        // Queue<Double> dblQueue = new PriorityQueue<>();
        // Queue<Double> dblQueue = new LinkedList<>();
        Queue<Double> dblQueue = new ArrayDeque<>();
        dblQueue.offer(Math.PI);
        dblQueue.offer(0.03);
        dblQueue.offer(Math.E);
        dblQueue.offer(3 * Math.sqrt(7));
        dblQueue.offer(Math.sin(1.67));
        System.out.println(dblQueue);
        double x = dblQueue.peek();
        System.out.println("Peek: " + x);
        while(!dblQueue.isEmpty()) {
            x = dblQueue.poll();
            System.out.println("Poll: " + x);
        }


    }

}
