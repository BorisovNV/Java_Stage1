package hw5;

public class Main {
    public Main(){
    }

    public static void main(String[] args) {
        Collaborator[] techArray = new Collaborator[5];

        techArray[0] = new Collaborator("Иванов", "Иван", "Иванович", "iiivanov@tech.com", 1112233, 7000, 45);
        techArray[1] = new Collaborator("Петров", "Петр", "Петрович", "pppetrov@tech.com", 2222233, 4000, 35);
        techArray[2] = new Collaborator("Сидоров", "Иван", "Степанович", "issidorov@tech.com", 3332233, 6500, 42);
        techArray[3] = new Collaborator("Викторов", "Дмитрий", "Сергеевич", "dsviktorov@tech.com", 4442233, 5000, 41);
        techArray[4] = new Collaborator("Иванцов", "Олег", "Андреевич", "oaivantsov@tech.com", 5552233, 4000, 29);

        System.out.println();

        for (int i = 0; i < techArray.length; i++) {
            if (techArray[i].age > 40) {
                techArray[i].printInfo();
            }
        }
    }
}
