package entities;

public class ChairReservation {

    private String clientName;
    private String clientPhone;
    private int chairNumber;
    private Barber barber;


    public ChairReservation(String clientName, String clientPhone, int chairNumber, Barber barber) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.chairNumber = chairNumber;
        this.barber = barber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public Barber getBarber() {
        return barber;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    @Override

    public String toString(){
        return "Cliente: " + clientName
                + ", Cadeira: " + chairNumber
                + ", Barbeiro: " + barber.getName();
    }
}
