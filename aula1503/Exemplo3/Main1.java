package Exemplo3;

public class Main1 {

    public static void main(String[] args) {

        Cat[] cats = new Cat[2];
        Animal[] animals = cats;
        animals[0] = new Dog();
    }

}
