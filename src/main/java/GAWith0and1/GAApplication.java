package GAWith0and1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GAApplication {


    public static void main(String[] args) {
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();
        geneticAlgorithm.initializePopulation();
        geneticAlgorithm.sortPopulation();
        geneticAlgorithm.showPopulation();
        int counter = 0;
        while (GAUtils.MAX_ITERATIONS > counter && geneticAlgorithm.getBestFitnessValue() < GAUtils.CHROMOSOME_SIZE) {
            System.out.println("Iteration "+counter);
            geneticAlgorithm.sortPopulation();
//            System.out.println("------------------");
            geneticAlgorithm.crossover();
//            System.out.println("------------------");
            geneticAlgorithm.mutation();
            geneticAlgorithm.sortPopulation();
            geneticAlgorithm.showPopulation();
            counter++;
        }
//        geneticAlgorithm.showPopulation();

    }

    private static int getCounter(int counter) {
        counter++;
        return counter;
    }

}
