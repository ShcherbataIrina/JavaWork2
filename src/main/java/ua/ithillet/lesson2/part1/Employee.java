package ua.ithillet.lesson2.part1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
       // System.out.printf("\nСпівробітник:\n Ім'я = %s\n Посада = %s\n Email =%s\n Телефон =%s\n  Вік = %d.\n",
            //    name,  position,  email,  phone,  age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
