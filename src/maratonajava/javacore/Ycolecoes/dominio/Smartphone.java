package maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serialNumber;
    private String modelo;

    public Smartphone(String serialNumber, String modelo) {
        this.serialNumber = serialNumber;
        this.modelo = modelo;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Smartphone smartphone = (Smartphone) obj;

        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
