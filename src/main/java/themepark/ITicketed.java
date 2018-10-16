package themepark;

public interface ITicketed {

    double defaultPrice();
    double priceFor(Visitor visitor);

}
