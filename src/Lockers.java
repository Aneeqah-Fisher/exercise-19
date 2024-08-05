public class Lockers {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // Locker states initialized 

        // Toggle lockers based on student numbers
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < lockers.length; locker += student) {
                lockers[locker] = !lockers[locker];
            }
        }

        // Collect and print open lockers
        StringBuilder openLockers = new StringBuilder();
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                openLockers.append(i + 1).append(" "); // Use StringBuilder for efficient string concatenation
            }
        }

        System.out.println("Open lockers: " + openLockers.toString().trim());
    }
}
