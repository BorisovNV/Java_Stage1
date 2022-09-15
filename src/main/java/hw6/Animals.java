package hw6;

public class Animals {
    private final int animalRun, animalSwim;

    Animals(int animalRun, int animalSwim) {
        this.animalRun = animalRun;
        this.animalSwim = animalSwim;
    }

    public boolean run(int value) {
        return animalRun > value;
    }

    public boolean swim(int value) {
        return animalSwim > value;
    }

    int getAnimalRun() {
        return animalRun;
    }

    int getAnimalSwim() {
        return animalSwim;
    }
}
