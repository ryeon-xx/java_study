package chap15.sec04.exam01;

// 프로그래머스 hashMap 문제

// map.getOrDefault(key,0)
// 전체 목록을 이용해 카운트를 할 때 매우 유용
// -> key가 있으면 key에 해당하는 값을 꺼냄.
// -> key가 없으면 0을 사용.

import java.util.HashMap;

public class WinnerTest {
    public static void main(String[] args) {
        String[] all = { "홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동" };

        HashMap<String, Integer> map = new HashMap<>();

        for(String key : all) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            // map.getOrDefault(key,0)
            // map.get(key)가 이미 저장되어 있는 경우 값을 꺼내어 사용
            // map.get(key)가 없는 경우는 0을 사용
        }
        System.out.println(map);

        int max = 0;
        for(String key : map.keySet()) {
            // key의 목록을 구해서, 하나씩 꺼내온다.
            System.out.println(key + " : " + map.get(key));
            if(map.get(key) > max) {
                max = map.get(key); // 2
                System.out.println("현재까지 우승자 : " + key);
            }
        }
    }
}
