package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        //코드 작성
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("username = " + username);
        System.out.println("domain = " + domain);
    }
}
