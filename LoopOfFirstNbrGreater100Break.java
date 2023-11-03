public class LoopOfFirstNbrGreater100Break {
public static void main (String [] args) {
int startn = 101;
int divisor = 7 ;
for (int number = startn ; ; number++) {
if (number % divisor == 0) {
System.out.println("the first number greater 100 and divised by 7 is: " +number);
break;
}}

}
}