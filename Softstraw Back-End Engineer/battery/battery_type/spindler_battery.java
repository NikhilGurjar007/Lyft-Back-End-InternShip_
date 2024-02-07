import java.time.LocalDate;

// SpindlerBattery class inheriting from Battery
public class SpindlerBattery extends Battery {

    // Fields to store current and last service dates
    private LocalDate current_date;
    private LocalDate last_service_date;
    private final int spindler_year_need_service = 4; // Service needed every 4 years

    // Constructor to initialize the current and last service dates
    public SpindlerBattery(LocalDate current_date, LocalDate last_service_date) {
        this.current_date = current_date;
        this.last_service_date = last_service_date;
    }

    // Method to check if the battery needs service
    @Override
    public boolean needsService() {
        // Calculating the date when service is needed
        LocalDate date_need_service = last_service_date.plusYears(spindler_year_need_service);

        // Returning true if service is needed, otherwise false
        return date_need_service.isBefore(current_date);
    }
}

