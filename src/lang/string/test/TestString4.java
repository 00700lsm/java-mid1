package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";

        //코드 작성
        int index = str.indexOf(".txt");
        String frontString = str.substring(0,index);
        String backString = str.substring(index);
        System.out.println("frontString = " + frontString);
        System.out.println("backString = " + backString);
    }
}
