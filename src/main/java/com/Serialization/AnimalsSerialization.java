package com.Serialization;

import com.zoo.Animals.*;

import java.io.*;

public class AnimalsSerialization {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 5, 3, "black", "Kitty", true);
        Crocodile crocodile = new Crocodile(2, 20, 150, "darkgreen", true);
        Dog dog = new Dog(3, 7, 40, "white", "Spike", true);
        Fish fish = new Fish(4, 1, 0.8, "grey");
        Giraffe giraffe = new Giraffe(5, 4, 300, "yellowbrown", false);
        GuideDog guideDog = new GuideDog(6, 3, 50, "black", "Spike2", true, true);
        Hamster hamster = new Hamster(7, 1, 0.5, "brown", "Bob", false);
        Lion lion = new Lion(8, 7, 200, "yellow", true);
        Wolf wolf = new Wolf(9, 5, 150, "grey", true);

        serializationOfAnimal(lion, "E:\\Projects\\hillelJava\\src\\main\\resources\\Serialization\\SerializedAnimals\\");
        Lion deserializedLion = deserializationOfAnimal("E:\\Projects\\hillelJava\\src\\main\\resources\\Serialization\\SerializedAnimals\\class com.zoo.Animals.Lion");
        System.out.println(deserializedLion);
    }

    public static void serializationOfAnimal(Animal animal, String filePath) {
        ObjectOutputStream writer = null;
        try {
            writer = new ObjectOutputStream(new FileOutputStream(filePath + animal.getClass()));
            writer.writeObject(animal);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            StudentSerialization.closeQuietly(writer);
        }
    }

    public static <E> E deserializationOfAnimal(String filePath) {
        ObjectInputStream reader = null;
        E deserialesedObject = null;
        try {
            reader = new ObjectInputStream(new FileInputStream(filePath));
            deserialesedObject = (E) reader.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignore) {
                    /*ignore*/
                }
            }
        }
        return deserialesedObject;
    }
}
