package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello","java","world","spring","boot"};

        //코드 작성
        int arrLength = 0;
        for(String str : arr){
            arrLength += str.length();
            System.out.println(str + " : " + str.length());
        }
        System.out.println("arrLength = " + arrLength);
    }
}
