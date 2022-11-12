import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {

    private static final List<String> NAMES = List.of(
            "Дурсль Дадли",
            "Дурсль Вернон",
            "Дурсль Петунья",
            "Гермиона Гренджер",
            "Уизли Рональд",
            "Гарри Поттер",
            "Уизли Джордж",
            "Уизли Фред",
            "Драко Малфой",
            "Добби"
    );

    private static final Random RANDOM = new Random();
    private static final int MAX = 5;

    public static void main(String[] args) {

        Queue<String> boxOffice1 = new ArrayDeque<>();
        Queue<String> boxOffice2 = new ArrayDeque<>();
        queueAtTheCheckout(boxOffice1);
        queueAtTheCheckout(boxOffice2);
        System.out.println("Первая очередь " + boxOffice1);
        System.out.println("Вторая очередь " + boxOffice2);
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2){
        if (queue1.size() == MAX && queue2.size() == MAX ){
            System.out.println("Позовите Галю!!!");
        }
        if (queue1.size()< queue2.size()){
            queue1.offer(name);
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2){
        if (RANDOM.nextBoolean()){
            queue1.poll();
        }else {
            queue2.poll();
        }
    }

    private static void queueAtTheCheckout(Queue<String> queue){
        int size = RANDOM.nextInt(MAX+1);
        for (int i = 0; i< size; i++){
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}