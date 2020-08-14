public class speedConvert {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour< 0) {
            return -1;
        }else{
            return Math.round(kilometersPerHour/ 1.609);
        }
    }

    public static void printConversion (double kilometerPerHour) {
        if(kilometerPerHour< 0) {
            System.out.println("Invalid Value");
        }else{
            double milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h = " + milesPerHour + "mi/h.");
        }
    }
}
