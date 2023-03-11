public class BmiService {
    public double calculate(double weight, double height) {
        double mass = (weight / (height * height));
        return mass;
    }
}
