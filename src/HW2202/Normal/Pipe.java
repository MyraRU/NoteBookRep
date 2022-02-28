package HW2202.Normal;

public class Pipe implements tools{
    private int diameter;

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, диаметром " + diameter + " !");
    }
}
