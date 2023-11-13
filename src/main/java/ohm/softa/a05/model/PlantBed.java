package ohm.softa.a05.model;

import ohm.softa.a05.collections.*;

import java.util.Iterator;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plants;

    public PlantBed() {
        plants = new SimpleListImpl<>();
    }

    public void add(T plant){
        plants.add(plant);
    }

    public int size(){
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        return this.plants.filter(p -> p.getColor().equals(color));
    }
}
