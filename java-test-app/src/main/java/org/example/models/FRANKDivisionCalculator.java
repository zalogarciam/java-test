package org.example.models;

public class FRANKDivisionCalculator {
    public FRANKDivisionCalculator() {
    }

    public double divide(FRANKDivision division) {
        if (division.Denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return division.Numerator / division.Denominator;
    }
}