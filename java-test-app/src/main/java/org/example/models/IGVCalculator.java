package org.example.models;

public class IGVCalculator {

    public IGVCalculator(){

    }

    public double CaculateIGV(Product product, int quantity)
    {
        return product.Price * quantity * 1.18;
    }
}
