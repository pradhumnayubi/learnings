package march_11;

public class automobile {
    public static void main(String[] args) {
        Audi a1 = new Audi("Sedan", 4000000);
        a1.showDetails();
    }
}

class Audi extends Car {
    public Audi(String category, int cost) {
        this.category = category;
        this.cost = cost;
    }

    @Override
    void showDetails() {
        System.out.println(this.category+" costs"+" about "+this.cost);
    }
}
