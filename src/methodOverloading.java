public class methodOverloading {

    public static void main(String[] args) {
        int a =10;
        int b=100;
        method();
        int result1 = method(a);
        int result2 =method(a,b);
        System.out.println(result1 + result2);
    }

    public static void method(){
        System.out.println("this is an emtpy method with no return type");
    }
    public static int method(int a,int b){
        int result = a+b;
        System.out.println("the result is "+result);
        return result;

    }
    public static int method(int a){
        int result = a+a;
        System.out.println("the result of method type 3 is "+result);
        return result;
    }
}
