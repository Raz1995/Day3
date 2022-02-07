package Day5;

import java.lang.reflect.Method;

class Person {

    String name;
    String address;
    int age;

    /*no-argument constructor
    public Person() {

    } */

    //constructor with arguments
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static void personInfo(Person newPerson) {
        System.out.println(newPerson.name + "," + newPerson.address + "," + newPerson.age);
    }

    public static void main(String[] args) {
        Person firstPerson = new Person("Raz", "Yerevan", 26);
        Person secondPerson = new Person("Gegham", "Yerevan", 35);
        personInfo(firstPerson);
        personInfo(secondPerson);

    }

}
