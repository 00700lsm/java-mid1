package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("소나타");
        Dog dog1 = new Dog("방방이", 3);
        Dog dog2 = new Dog("차차이", 4);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        //println 내부에서 toString 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
