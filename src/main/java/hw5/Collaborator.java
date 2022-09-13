package hw5;

public class Collaborator {
    String name;
    String surname;
    String patronymic;
    String email;
    int phone;
    int salary;
    int age;

    public Collaborator(String surname, String name, String patronymic, String email, int phone, int salary, int age){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo(){
        System.out.println(String.format("Сотрудник: %s %s %s. Возраст: %s. Заработная плата: %s у.е." + "Номер телефона: %s, e-mail; %s.", surname, name, patronymic, age, salary, phone, email));
    }

}
