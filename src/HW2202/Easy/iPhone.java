package HW2202.Easy;

import java.util.Objects;

public class iPhone {
    private String model;
    private int weight, countSim, X, Y;
    private String material;

    public iPhone() {
    }

    public iPhone(String model, int weight, int countSim, int x, int y, String material) {
        this.model = model;
        this.weight = weight;
        this.countSim = countSim;
        X = x;
        Y = y;
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountSim() {
        return countSim;
    }

    public void setCountSim(int countSim) {
        this.countSim = countSim;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iPhone iPhone = (iPhone) o;
        return weight == iPhone.weight && countSim == iPhone.countSim && X == iPhone.X && Y == iPhone.Y && Objects.equals(model, iPhone.model) && Objects.equals(material, iPhone.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, countSim, X, Y, material);
    }

    @Override
    public String toString() {
        return "iPhone {" +
                "Модель = '" + model + '\'' +
                ", Вес = " + weight +
                ", Кол-во сим-карт = " + countSim +
                ", Ширина = " + X +
                ", Высота = " + Y +
                ", Материал = '" + material + '\'' +
                '}';
    }
}
