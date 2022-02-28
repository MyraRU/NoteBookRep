package HW2202.Normal;

public class Guitar implements tools{
    private int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public void play() {
        System.out.println("Играет гатара с " + stringCount + " струнами !");
    }
}
