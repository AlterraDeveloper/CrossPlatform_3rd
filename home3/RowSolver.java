import java.lang.*;
import java.util.*;

public class RowSolver {

    static int step = 0;
    static final double EPSILON = 0.000001;

    public static double calculateSumOfRow() {
        double sum = 0;
        double step_result = 0;
        do {
            step_result = Math.pow(-1, step) * (1 / (Math.pow(step, 3) + 6 * Math.pow(step, 2) + 11 * step + 6));
            sum += step_result;
            step++;
        } while (Math.abs(step_result) >= EPSILON);
        return sum;

    }

    public static double calculateSumOfRowTop10(){
        double sum = 0;
       for(int i=0;i<10;i++){
           sum += Math.pow(-1, i) * (1 / (Math.pow(i, 3) + 6 * Math.pow(i, 2) + 11 * i + 6));
       }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of row : " + RowSolver.calculateSumOfRow());
        System.out.println("Sum of row top 10 : " + RowSolver.calculateSumOfRowTop10());
    }
}
