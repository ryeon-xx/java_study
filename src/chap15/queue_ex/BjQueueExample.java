package chap15.queue_ex;

import java.util.LinkedList;

public class BjQueueExample {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");

        String[] wait = { "홍길동", "김길동", "송길동", "정길동", "박길동", "이길동" };

        LinkedList<String> queue = new LinkedList<>();

        for(String s : wait) {
            queue.add(s);
        }
        System.out.println(queue);

        queue.remove();  // "홍길동"
        queue.remove();  // "김길동:
        queue.add(queue.remove()); // "송길동"
        System.out.println(queue);

        queue.remove();  // "정길동"
        queue.add(queue.remove());  // "박길동"
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
