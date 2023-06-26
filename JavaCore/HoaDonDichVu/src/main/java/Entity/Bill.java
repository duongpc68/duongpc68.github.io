package Entity;

public class Bill {
    private Customers cusstomers;
    private Services services;
    private double serviceNumber;

    public Bill(Customers cusstomers, Services services, double serviceNumber) {
        this.cusstomers = cusstomers;
        this.services = services;
        this.serviceNumber = serviceNumber;
    }

    public Customers getCusstomers() {
        return cusstomers;
    }

    public void setCusstomers(Customers cusstomers) {
        this.cusstomers = cusstomers;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public double getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(double serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "cusstomers=" + cusstomers +
                ", services=" + services +
                ", serviceNumber=" + serviceNumber +
                '}';
    }

}



