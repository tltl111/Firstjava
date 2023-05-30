public class vehicle {
    
    private String brand;
    private String model;
    private String year;

    public vehicle(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public void setBrand() {
        this.brand = brand;
    }
    public void setModel() {
        this.model = model;
    }
    public void setYear() {
        this.year = year;
    }
}
