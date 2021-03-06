package loopsMethodsClassesHomework;

import java.math.BigDecimal;

public class Product implements Comparable {
	private String name;

    private BigDecimal price;

    public Product(BigDecimal price, String name) {
        this.setPrice(price);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Product otherProduct = (Product) o;
        return this.price.compareTo(otherProduct.price);
    }
}
