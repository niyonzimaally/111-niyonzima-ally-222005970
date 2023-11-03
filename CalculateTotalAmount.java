     class Loans {
     public double CalculateLoans (double P, double r, int n, int Y) {
          return (P * Math.pow(1 + r / n, n * Y));  
     }
}
        public class CalculateTotalAmount {
        public static void main(String[] args) {
        Loans myLoans = new Loans() ;
        double result = myLoans.CalculateLoans (500000, 0.18, 12, 3) ;
       System.out.println("Mr Bob will have paid a total of: " + result);
        }
    }
     

