public class speedconverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if ( kilometersPerHour<0){
            return -1;

        }
        return Math.round( kilometersPerHour / 1.609);


    }

    public static void printconversion(double kilometersPerHour){

        long milesperhour = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour<0) {
            System.out.println("invalid value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    "km/h=" +
                    milesPerHour + "mi/h");
        }

    }
}

