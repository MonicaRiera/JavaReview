package tech.bts.classes.Java;

public class Client {

    private String name;
    private String email;
    private int age;
    private boolean married;
    private double height;

    //Sometimes model classes don't need constructor


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
