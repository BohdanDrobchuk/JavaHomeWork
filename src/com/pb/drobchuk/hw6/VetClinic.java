package com.pb.drobchuk.hw6;

public class VetClinic {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Чак", 10, "кисткы", "село", false, 555);
        animals[1] = new Horse("Персик", 6, "клубнику", "город", "серый");
        animals[2] = new Cat("Бубка", 4, " рыбка", "холодильник", true, 555);

        Veterinarian veterinarian = null;
        try {
            Class tempClass = Class.forName(Veterinarian.class.getName());
            veterinarian = (Veterinarian) tempClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("------ Проверка работы суперкласса. ------   ");
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        System.out.print(System.lineSeparator());

        System.out.println("------ Проверка работы методов подклассов. ------");
        System.out.println("------ " + animals[0].getClass() + " проверяется. ------");
        System.out.println(animals[0]);
        animals[0].sleep();
        animals[0].eat();
        animals[0].makeNoise();

        System.out.print(System.lineSeparator());
        System.out.println("------ " + animals[1].getClass() + " проверяется. ------");
        System.out.println(animals[1]);
        animals[1].sleep();
        animals[1].eat();
        animals[2].makeNoise();

        System.out.print(System.lineSeparator());
        System.out.println("------ " + animals[2].getClass() + " проверяется. ------");
        System.out.println(animals[2]);
        animals[2].sleep();
        animals[2].makeNoise();
        animals[2].eat();

        System.out.print(System.lineSeparator());
        System.out.println("------ equals() и hashCode() \n" + "проверяются. ------");
        System.out.println(animals[0].hashCode() == animals[1].hashCode());
        System.out.println(animals[0].equals(animals[1]));

        Dog testDog = new Dog("Чак", 10, "кисткы", "село", false, 555);
        if (animals[0].hashCode() == testDog.hashCode()) {
            if (animals[0].equals(testDog))
                System.out.println(animals[0].getName() + " и " + testDog.getName() + " равно.");
        }
    }
}

