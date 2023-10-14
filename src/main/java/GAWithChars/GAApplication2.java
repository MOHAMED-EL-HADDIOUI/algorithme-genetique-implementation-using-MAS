package GAWithChars;

public class GAApplication2 {


    public static void main(String[] args) {
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();
        geneticAlgorithm.initializePopulation();
        geneticAlgorithm.sortPopulation();
        geneticAlgorithm.showPopulation();
        int counter = 0;
        while (GAUtils.MAX_ITERATIONS > counter && geneticAlgorithm.getBestFitnessValue() != 1.0) {
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
