public class SpeedConverter {
    public static void main(String[] args) {
        SpeedConverter.printConversions(100);
    }

        public static long toMilesPerHour ( double kilometersPerHour){

            if (kilometersPerHour < 0) {
                return -1;
            }

            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }

        public static void printConversions ( double kilometersPerHour){
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {
                long milesPerHour = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour
                        + " km/Hr = " + milesPerHour + " mi/Hr");
            }
        }

    }

