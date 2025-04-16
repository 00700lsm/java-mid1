package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        //split()

        String[] splitStr = str.split(",");
        for(String s: splitStr) {
            System.out.println(s);
        }

        //jotin()
        String joinedStr = String.join("-", "A", "B","C");
        System.out.println("연결된 문자열: " + joinedStr);

        //문자열 배열 연결
        String result = String.join("0", splitStr);
        System.out.println("result = " + result);
    }
}
