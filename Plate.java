public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("тарелка: " + food + " фрикаделек");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int portion) {
        if (portion > 0) {
            food = portion;
        }
    }

    public void addFood(int portion) {

        food += portion;
        System.out.println("Хозяйка добавила " + portion + " фрикаделек в тарелку");

    }

}
