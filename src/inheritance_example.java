//example for inheritance and its types. this also would contain
//some form of method overloading and method overriding.
//we could try to do a hybrid inheritance where
//vechile could contain subclasses like bike, car, truck, bus
//again truck could contain another subclass multi-wheeler
//
public class inheritance_example {
    public static void main(String[] args) {
        vechile vec = new vechile();
        vec.display();

        car mustang = new car();
        mustang.display();
        semitruck sm = new semitruck();
        sm.display();
        sm.maindisplay();
    }
}

class vechile{
    int num_of_wheels;
    void maindisplay(){
        System.out.println("this is a main display from the grand parent");
    }
    void display(){
        System.out.println("I am a vechile and I have usually wheels");
    }

}

class car extends vechile {
    void display() {
        num_of_wheels = 4;
        System.out.println("I am car and I have " + num_of_wheels + " wheels");
    }
}

class bike extends vechile {
    void display() {
        num_of_wheels = 2;
        System.out.println("I am car and I have " + num_of_wheels + " wheels");
    }
}

class truck extends vechile {
    void display() {
        num_of_wheels = 8;

        System.out.println("I am car and I have " + num_of_wheels + " wheels");
    }
}

class semitruck extends truck{

    void display(){
        System.out.println("I am semitruck with 18 wheelers");
    }
}


