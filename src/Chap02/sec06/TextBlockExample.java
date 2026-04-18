package Chap02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\tid :" + " winter,\n" +
                "\tname : " + " 눈송이\n" +
                "}";

        String str2 = """
        {
            "id" : "winter",
            "name" : "눈송이"
        }
        """;

        // 여러줄을 사용할 때 한 줄로 붙이고 싶으면 \를 넣으면 된다.
        String str3 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;

        System.out.println(str1);
        System.out.println("-----------------------");
        System.out.println(str2);
        System.out.println("-----------------------");
        System.out.println(str3);
    }
}
