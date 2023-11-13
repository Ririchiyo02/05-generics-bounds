package ohm.softa.a05.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant>{
    private final double height;
    private final String family;
    private final String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(height, plant.height) == 0 && Objects.equals(family, plant.family) && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name);
    }
}
