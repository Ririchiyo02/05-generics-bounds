package ohm.softa.a05.model;

public class Flower extends Plant{
    private final PlantColor plantColor;
    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);
        if (color.equals(PlantColor.GREEN)) throw new IllegalArgumentException("Flower can't be green");
        plantColor = color;
    }

    @Override
    public PlantColor getColor() {
        return plantColor;
    }
}
