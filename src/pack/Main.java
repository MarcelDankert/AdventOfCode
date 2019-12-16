package pack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Results Day 1: First Star = %d, Second Star = %d\n", new Day1().getFuelFirst(), new Day1().getFuelSecond());
        System.out.printf("Results Day 2: First Star = %d, Second Star = %s\n", new Day2().intCodeFirst(new Day2().getMyArray()), new Day2().intCodeSecond());
        System.out.printf("Results Day 3: First Star = %d, Second Star =  \n", new Day3().getClosestPoint());

    }
}
