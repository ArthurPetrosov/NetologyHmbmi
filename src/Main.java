public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = (int) service.calculate(82, 1.79);
        System.out.println(mass);
    }
}