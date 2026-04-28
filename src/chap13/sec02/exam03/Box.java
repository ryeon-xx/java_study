package chap13.sec02.exam03;

// 제네릭 타입 생략 시 Object로 간주

public class Box <T>{
    public T content;

    // Box의 내용물이 같은지 비교
    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
