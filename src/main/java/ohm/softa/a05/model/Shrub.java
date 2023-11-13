package ohm.softa.a05.model;

public class Shrub extends Plant{
    private PlantColor plantColor;
    public Shrub(double height, String family, String name) {
        super(height, family, name);
        plantColor = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return plantColor;
    }
}
