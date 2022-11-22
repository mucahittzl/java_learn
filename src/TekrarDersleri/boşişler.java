package TekrarDersleri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.*;

import static jdk.jfr.FlightRecorder.isAvailable;

//public class boşişler {





public class boşişler {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);

        queue.add(5);

        queue.add(7);

        queue.add(9);

        queue.add(11);

        queue.add(13);



        int count = 0;

        while (queue.isEmpty() == false) {

            queue.remove();

            count++;

            if(count == 3) {

                break;

            }

        }

        System.out.println(queue);



    }
}

















