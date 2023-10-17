public class Cat {
    private String name;
    private int appetite;
    private boolean fedup = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        if (fedup) {
            System.out.println("Котик: " + name + " сыт и ласков");
        } else {
            System.out.println(
                    "Котик: " + name + " голоден и зол. Ему нужно " + appetite + " фрикаделек для полного счастья");
        }
    }

    public void yell() {
        if (!fedup) {
            System.out.println("Котик " + name + " зовет хозяйку и готовится расцарапать диван");
        }
    }

    public void eat(int meal) {
        if (!fedup) {
            if (appetite < meal) {
                System.out.println(name + " кушает и мурчит");
                fedup = true;
            } else {
                System.out.println(name + " не покушал и начинает шипеть");
            }
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFedup() {
        return fedup;
    }
}
