package entities;

public class Volontario extends Dipendente implements checkIn{

    private String name;
    private int age;
    private String CV;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }
}
