import java.util.Date;

public class NubbinBattery extends Battery {
    // Fields to store current and last service dates
    private Date currentDate;
    private Date lastServiceDate;
    private int nubbinYearNeedService = 3;  // Service needed every 3 years

    // Constructor to initialize the current and last service dates
    public NubbinBattery(Date currentDate, Date lastServiceDate) {
        this.currentDate = currentDate;
        this.lastServiceDate = lastServiceDate;
    }

    // Method to check if the battery needs service
    public boolean needsService() 
    {
        // Calculating the date when service is needed
        int year = lastServiceDate.getYear() + nubbinYearNeedService;
        Date dateNeedService = new Date(year, lastServiceDate.getMonth(), lastServiceDate.getDay());

        // Returning true if service is needed, otherwise false
        return dateNeedService.before(currentDate);
    }

}


# Adding a reference to the license and the author
# License: Nikhil Gurjar
