import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();
        
        // Display the current time
        System.out.println("The current time is: " + currentTime);
    }
}

