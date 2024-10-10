public class MyDate {
    private static final int MIN_YEAR = 1900;
    private static final int MAX_YEAR = 2100;

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new InvalidDateException("Invalid Year: " + year);
        }
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid Month: " + month);
        }
        if (day < 1 || day > getMaxDaysInMonth(month, year)) {
            throw new InvalidDateException("Invalid Day: " + day);
        }
        
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getMaxDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // This should never happen due to earlier checks.
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", getMonthName(month), day, year);
    }

    private String getMonthName(int month) {
        String[] monthNames = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
        };
        return monthNames[month];
    }

    public static void main(String[] args) {
        // Test cases
    	//February 29th, on a leap year
    	//February 29th,  not on a leap year				
    	try
    	{
    	MyDate md = new MyDate(29,2,2001);
    	System.out.println(md.toString());
    	} 
    	catch (InvalidDateException e) 
    	{
    	System.out.println(e.getMessage());
    	}
    }
}
