package ru.job4j.oop;

public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(Product product) {
        this.product = product;
    }

    public String label() {
        return product.label();
    }
}
