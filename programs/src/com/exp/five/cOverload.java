package com.exp.five;

public class cOverload {
    static void main() {
        Student s1 = new Student();
        Student s2 = new Student("Lakshya");
        Student s3 = new Student(19);
        Student s4 = new Student("Lakshya", 19);
        Student s5 = new Student(19, "Lakshya");
    }
}

class Student{
    String Name;
    int age;

    Student(){
        System.out.println("Details not available");
    }

    Student(String Name){
        this.Name = Name;
        System.out.println("Student Name: " + Name);
    }

    Student(int age){
        this.age = age;
        System.out.println("Student age: " + age);
    }

    Student(String Name, int age){
        this.Name = Name;
        this. age = age;
        System.out.println("Name: " + Name + " Age: " + age);
    }

    Student(int age, String Name){
        this.Name = Name;
        this. age = age;
        System.out.println("Name: " + Name + " Age: " + age);
    }
}