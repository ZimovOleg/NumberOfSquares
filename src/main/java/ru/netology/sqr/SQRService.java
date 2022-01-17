package ru.netology.sqr;

public class SQRService {
    public int NumberOfSquares(int min, int max) {

        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                number++;
            }
        }
        return number;


    }

}



