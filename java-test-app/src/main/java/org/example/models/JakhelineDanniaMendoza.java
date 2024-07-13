package org.example.models;

public class JakhelineDanniaMendoza {
    public JakhelineDanniaMendoza() {

    }

    public double Sum(double a, double b) {
        return a + b;
    }

    public double Divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
