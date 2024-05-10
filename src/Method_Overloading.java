public class Method_Overloading {

    public static void method() {

        System.out.println("this is an emtpy method with no return type");
    }

    public static int method(int a, int b) {
        int result = a + b;
        System.out.println("the result is " + result);
        return result;

    }

    public static int method(int a) {
        int result = a + a;
        System.out.println("the result of method type 3 is " + result);
        return result;
    }

}
class Mainanother {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;

        Method_Overloading.method();
        int result1 = Method_Overloading.method(a);
        int result2 = Method_Overloading.method(a, b);
        System.out.println(result1 + result2);
    }

}
