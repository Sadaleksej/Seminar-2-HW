public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Персик", 7),
                new Cat("Хрюшка", 9),
                new Cat("Бублик", 6),
                new Cat("Васька", 15),
                new Cat("Черныш", 11),
                new Cat("Арчибальд", 60),
        };

        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            System.out.println();
            cat.info();
            plate.info();
            cat.eat(plate.getFood());
            plate.setFood(plate.getFood() - cat.getAppetite());
            if (cat.getFedup()) {
                plate.info();
                cat.info();
            }

            while (!cat.getFedup()) {
                System.out.println();
                cat.info();
                cat.yell();
                plate.addFood(5);
                plate.info();
                cat.eat(plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());
                if (cat.getFedup()) {
                    plate.info();
                    cat.info();
                }
            }

        }
    }

}
