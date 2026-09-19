class MovieBooking {
    private String name;
    private boolean confirmed;
    private String otp;
    public MovieBooking() {
    }
    public MovieBooking(String name) {
        this();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isConfirmed() {
        return confirmed;
    }
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    public void setOtp(String otp) {
        this.otp = otp;
    }
}

public class MovieBookingProfile {
    public static void main(String[] args) {
        MovieBooking profile = new MovieBooking("Rahul Dev");
        System.out.println(profile.getName());
        profile.setConfirmed(true);
        System.out.println(profile.isConfirmed());
        profile.setOtp("4471");
    }
}