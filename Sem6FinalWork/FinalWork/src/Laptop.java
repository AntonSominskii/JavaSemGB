public class Laptop {
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Laptop(int ram, int storage, String operatingSystem, String color) {
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "ОЗУ=" + ram +
                ", Объем ЖД=" + storage +
                ", Операционная система='" + operatingSystem + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }
}