package belajar.junit5.service;

public class Calculator {

    public Integer add(Integer bil1, Integer bill2) {
        return bil1 + bill2;
    }

    public Integer divide(Integer bil1, Integer bil2) {
        if (bil2 == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        } else {
            return bil1 / bil2;
        }
    }
}
