package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Plant implements Comparable<Plant>{
    private double height;
    private String family;
    private String name;

    protected Plant(double height, String family, String name) {
        if(family == null || family.length() == 0) throw new IllegalArgumentException("Specify a family");
        if(name == null || name.length() == 0) throw new IllegalArgumentException("Specify a name");
        if(height <= 0.0) throw new IllegalArgumentException("Height may not be less or equal zero");
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public abstract PlantColor getColor();

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("family", family)
                .append("name", name)
                .append("height", height)
                .append("color", getColor()).toString();
    }

    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.getHeight(), plant.getHeight());
    }
}
