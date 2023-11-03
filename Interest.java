class SimpleInterest {
    public double calculateSI(double p, double r, double t) {
        return (p * r * t);
    }
}

public class Interest {
    public static void main(String[] args) {
        SimpleInterest mySI = new SimpleInterest();
        double result = mySI.calculateSI(100000, 0.05, 5);
        System.out.println("Result: " + result);
    }
}
