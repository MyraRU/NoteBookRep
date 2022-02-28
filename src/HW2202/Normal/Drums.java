package HW2202.Normal;

public class Drums implements tools{
    private int size;

    public Drums(int size) {
        this.size = size;
    }


    @Override
    public void play() {
        System.out.println("Играет барабан, размером " + size + " !");
    }
}
