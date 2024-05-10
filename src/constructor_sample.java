class sample {

    int tmp;
    String wthr;

    sample() {
        System.out.println("this is a constructor message");
        tmp = 100;
        wthr = "sunny";
    }
}
class constructor_sample{
    public static void main(String[] args) {
        sample obj = new sample();
        System.out.println(obj.tmp + " , " +obj.wthr);


    }

    }


