public class recursion_sample {

    public static void main(String[] args) {
        natprint(15);

    }
    public static void natprint(int i){
        if(i==1){
            System.out.println(i);
        }
        else {
            System.out.println(i);
            natprint(--i);
        }
    }
}
