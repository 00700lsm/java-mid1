package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        //코드작성
        String[] fruitsArr = fruits.split(",");
        for(String str : fruitsArr) {
            System.out.println(str);
        }
        String joined = String.join("->", fruitsArr);
        System.out.println("joined = " + joined);

    }
}
