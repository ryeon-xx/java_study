package chap15.sec03.exam03;

import java.util.Arrays;
import java.util.HashSet;

// 1. 오름차순 정렬
// 2. Set 에 넣어라

public class SetTest {
    public static void main(String[] args) {
        // 중복 문자가 포함된 문자열
        String s = "bbbaaacdddefecge";

        // HashSet 생성 (중복 제거용)
        HashSet<String> set = new HashSet<>();

        // 문자열을 한 글자씩 쪼개서 배열로 만들기
        // ex) ["b","b","b","a","a","a","c","d","d","d","e","f","e","c","g","e"]
        String[] s2 = s.split("");

        // 알파벳 순서로 정렬
        // ex) ["a","a","a","b","b","b","c","c","d","d","d","e","e","e","f","g"]
        Arrays.sort(s2);

        // 정렬된 배열을 Set에 추가 → 중복 자동 제거
        for (String x : s2) {
            set.add(x);
        }

        // Set 출력 (순서 보장 X)
        // ex) [a, b, c, d, e, f, g]
        System.out.println(set);

        // Set → Object 배열로 변환
        // (Set은 인덱스 접근 불가라서 배열로 변환 후 순회)
        Object[] o = set.toArray();
        for (Object x : o) {
            System.out.print(x + " ");
        }
    }
}
