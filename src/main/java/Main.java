
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Markiz", 8, 20),
                new Cat("Murka", 5, 16),
                new Cat("Kira", 4, 18),
                new Cat("Pushok", 7, 15)
        };
        Bowl bowl1 = new Bowl();
        bowl1.setFullness(100);
        for (Cat c : cats) {
            c.eat(bowl1);
            c.catInfo();
        }
    }
}
