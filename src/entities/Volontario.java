package entities;

import interfaces.checkIn;

public class Volontario implements checkIn {
    private String name;
    private int age;
    private String cv;


    public Volontario(){


    }
    public Volontario(String name, int age, String cv){
        this.name=name;
        this.age=age;
        this.cv=cv;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cv='" + cv + '\'' +
                '}';

    }
    public void checkIn(){
        System.out.println("CheckIn eseguito alle 14:00");
    }
}
