package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //toString은 Object class 의 메소드
        String string = child.toString();
        System.out.println(string);
    }
}
