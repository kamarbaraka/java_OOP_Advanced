package objectclass_methodoveriding;

import java.util.Objects;

public class Smartphone
        implements Cloneable{

    private String brandName, modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice, retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartphone{");
        sb.append("brandName='").append(brandName).append('\'');
        sb.append(", modelName='").append(modelName).append('\'');
        sb.append(", batterymAh=").append(batterymAh);
        sb.append(", producerPrice=").append(producerPrice);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    protected Smartphone clone() throws CloneNotSupportedException {
        return (Smartphone) super.clone();
    }
}

class SmartphonePrice
    implements Cloneable{

    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        return (SmartphonePrice) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartphonePrice{");
        sb.append("priceType='").append(priceType).append('\'');
        sb.append(", priceInEuros=").append(priceInEuros);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
