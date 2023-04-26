import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import com.iteso.calendar.Date;

public class Comparables {

    public static void main(String[] args) {
        PriorityQueue<Date> dateQueue = new PriorityQueue<Date>();
        dateQueue.offer(new Date());
        dateQueue.offer(new Date(15, 6, 2018));
        dateQueue.offer(new Date(20, 9, 2020));
        while(!dateQueue.isEmpty()) {
            Date date = dateQueue.poll();
            System.out.println(date);
        }

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
    }



}
