package org.example.models02;

public class IGVCal{

    public IGVCal(){

    }

    public double CalIGV(Product product, int quantity)
    {
        return product.Price * quantity * 1.18;
    }
}
