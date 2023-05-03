import java.util.*;

import com.iteso.calendar.Date;
import com.iteso.calendar.DateTime;
import com.iteso.model.RGBColor;

public class Comparables {

    public static void main(String[] args) {
        PriorityQueue<Date> dateQueue = new PriorityQueue<Date>();
        dateQueue.offer(new Date());
        dateQueue.offer(new Date(15, 6, 2018));
        dateQueue.offer(new Date(20, 9, 2020));
        /*
        while(!dateQueue.isEmpty()) {
            Date date = dateQueue.poll();
            System.out.println(date);
        }*/

        List<String> songList = new ArrayList<>();
        songList.add("Peaches peaches");
        songList.add("Ella baila sola");
        songList.add("Estos celos");
        songList.add("Viva la vida");
        System.out.println(songList);
        Collections.shuffle(songList);
        System.out.println(songList);

        Collections.swap(songList, 0, 1);
        System.out.println(songList);

        int f1 = Collections.frequency(dateQueue, new Date());
        int f2 = Collections.frequency(songList, "Peso Pluma");
        int f3 = Collections.frequency(songList, new Date());
        System.out.println(f1 + ", " + f2 + ", " + f3);

        Collections.addAll(dateQueue, new Date(1, 5, 2023), new DateTime(), new DateTime(new Date(16, 6, 2019)));
        System.out.println(dateQueue);
        Collections.addAll(songList, "And I love her", "AMG");
        System.out.println(songList);

        List<Object> destList = new LinkedList<>();
        Collections.addAll(destList, 156, 3.14, "Otra cosa", new Date(), new RGBColor(), new StringList());
        System.out.println(destList);
        Collections.copy(destList, songList);
        System.out.println(destList);
        List<String> strList = Collections.nCopies(25, "Pepe Pecas pica papas");
        System.out.println(strList);
        System.out.println(strList.getClass());

        Collections.sort(songList);
        System.out.println(songList);

        List<RGBColor> colorList = new Vector<>();
        Collections.addAll(colorList, new RGBColor(150, 160, 190), new RGBColor(), new RGBColor(150, 90, 255), new RGBColor(150, 160, 180), new RGBColor(75, 200, 170));
        // Al hacer comparable RGBColor, ya lo podemos usar así:
        Collections.sort(colorList);
        System.out.println(colorList);
        PriorityQueue<RGBColor> colorQueue;
        TreeSet<RGBColor> colorSet;
        TreeMap<RGBColor, String> colorMap;

        RGBColor minColor = Collections.min(colorList);
        String minSong = Collections.min(songList);
        Date maxDate = Collections.max(dateQueue);
        //Object maxObject = Collections.max(destList);
        System.out.println(minColor);
        System.out.println(minSong);
        System.out.println(maxDate);

        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, "public", "static", "abstract", "if", "void", "main", "int", "java", "for", "while");
        Collections.sort(wordList);
        System.out.println(wordList);
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int diff = s1.length() - s2.length();
                if(diff == 0) return s1.compareTo(s2);
                else return diff;
            }
        };
        Collections.sort(wordList, stringComparator);
        System.out.println(wordList);

        //Comparator<String> reverseComparator = (s1, s2) -> s2.compareTo(s1);
        //Collections.sort(wordList, reverseComparator);
        Collections.sort(wordList, (s1, s2) -> s2.compareTo(s1));
        System.out.println(wordList);

        HashSet<Date> dateSet = new HashSet<>();
        Collections.addAll(dateSet, new Date(), new Date(), new Date());
        Collections.addAll(dateSet, new Date(3, 3, 2003), new Date(3, 3, 2003), new Date(3, 3, 2003));
        System.out.println(dateSet);
        System.out.println(new Date().hashCode());
        System.out.println(new Date(3, 3, 2003).hashCode());

    }

}
