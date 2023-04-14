import java.util.Scanner;
class Ride {
        private double distance;
        private int time;
        public Ride(double distance, int time) {
            this.distance = distance;
            this.time = time;
        }
        public double getDistance() {
            return distance;
        }
        public int getTime() {
            return time;
        }
    }
    class FareCalculator {
        private final double MIN_FARE = 5.0;
        private final double COST_PER_KM = 10.0;
        private final double COST_PER_MINUTE = 1.0;
        public double calculateFare(Ride ride) {
            double fare = COST_PER_KM * ride.getDistance() + COST_PER_MINUTE * ride.getTime();
            if (fare < MIN_FARE) {
                fare = MIN_FARE;
            }
            return fare;
        }
    }
    public class CabInvoiceGenerator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter distance travelled (in kilometers): ");
            double distance = scanner.nextDouble();
            System.out.print("Enter time taken (in minutes): ");
            int time = scanner.nextInt();
            Ride ride = new Ride(distance, time);
            FareCalculator fareCalculator = new FareCalculator();
            double fare = fareCalculator.calculateFare(ride);
            System.out.println("Total fare for the journey: Rs. " + fare);
            scanner.close();
        }
}