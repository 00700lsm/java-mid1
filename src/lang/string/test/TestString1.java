package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        //코드 작성
        boolean isStartsWithHttps = url.startsWith("https://");
        System.out.println("isStartsWithHttps = " + isStartsWithHttps);
    }
}
