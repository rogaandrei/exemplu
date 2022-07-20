package Exempl1;


public class Ex1 {
    String name;
    int age;

    public Ex1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Ex1 exemplu=new Ex1("Ion",12);
        System.out.println(exemplu);
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
