package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context=Micronaut.run(Application.class, args);
        ProducerClient pc =context.getBean(ProducerClient.class);
        ArrayList<String> animalList = getAnimalList();

        for (String animalName : animalList) {
            pc.sendAnimalName(animalName);
            System.out.println("Animal Name Sent"+animalName);
        }
    }

    private static ArrayList<String> getAnimalList()
    {
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("Dog");
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Snake");
        animalList.add("Cat");

        return animalList;
    }
}