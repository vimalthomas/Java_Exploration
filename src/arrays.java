public class arrays {

    public static void main(String[] args) {
        //type the variable with brackets.
        //declaration

        int[] numbers;
        String[] names;
        double[] prices;

        //initialization
        int arraySize = 5;
        numbers = new int[arraySize];
        names = new String[arraySize];
        prices = new double[arraySize];

        for(int i=0;i<arraySize;i++){
            numbers[i]=i+10;
            names[i] = "vimal";
            prices[i] = (double)i+(double)i;

        }
        //print the length

        System.out.println("the size of the arrays are "+numbers.length);
        int cap=0;
        while( cap< numbers.length){
            System.out.println(numbers[cap]);
            System.out.println(names[cap]);
            System.out.println(prices[cap]);
            cap++;
}

    }
}
