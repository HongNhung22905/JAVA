package com.example;

/**
 * Calculates a student's final result from several scores.
 * The method intentionally contains a loop and conditional branches
 * so it can be used for statement and path coverage exercises.
 */
public class StudentResult {
    public static String classify(double[] scores) {
        if (scores == null || scores.length == 0) {
            return "INVALID";
        }

        double total = 0;
        for (double score : scores) {
            if (score < 0 || score > 10) {
                return "INVALID";
            }
            total += score;
        }

        double average = total / scores.length;
        if (average >= 8.0) {
            return "EXCELLENT";
        } else if (average >= 5.0) {
            return "PASS";
        }
        return "FAIL";
    }

    public static void main(String[] args) {
        System.out.println(classify(new double[]{8, 9, 7}));
    }
}
