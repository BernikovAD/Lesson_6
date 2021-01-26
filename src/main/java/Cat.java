public class Cat {
    public String name;
    public int hunger;
    public int appetite;
    public int stomachVolume;
    public boolean satiety;


    public Cat(String name, int appetite, int stomachVolume) {
        this.name = name;
        this.hunger = stomachVolume;
        this.appetite = appetite;
        this.stomachVolume = stomachVolume;
        this.satiety = false;
    }

    public void catInfo() {
        System.out.printf("Кот %s. Объем желудка: %d. Его голод состовляет: %d. За 1 раз он сьедает: %d\n\r", name, stomachVolume, hunger, appetite);
    }

    public void eat(Bowl bowl) {
        int edit = 0;
        if (bowl.FullnessBoolean()) {
            if (hunger <= appetite) {
                edit = hunger;
                satiety = true;
            } else if (bowl.getFullness() > appetite) {
                edit = appetite;
            } else if (bowl.getFullness() < appetite) {
                edit = bowl.getFullness();
            }
            setHunger(-edit);
            System.out.printf("Котик %s поел на %d\n\r",getName(), edit);
            bowl.setFullness(-edit);
        } else System.out.println("Миска пуста!");
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = this.hunger + hunger;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getStomachVolume() {
        return stomachVolume;
    }

}
