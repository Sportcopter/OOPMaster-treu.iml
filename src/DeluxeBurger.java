public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Bacon", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1("Should not do this", 0);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2("Should not do this", 0);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3("Should not do this", 0);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4("Should not do this", 0);
    }
}
