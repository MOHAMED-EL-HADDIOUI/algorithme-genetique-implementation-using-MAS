package GAWith0and1;

import java.util.Random;

public class Individual implements Comparable {
    private int [] chromosome = new int[GAUtils.CHROMOSOME_SIZE];
    private int fitness ;

    public Individual() {
        Random random=new Random();
        for (int i = 0; i < GAUtils.CHROMOSOME_SIZE; i++) {
            chromosome[i]=random.nextInt(2);
        }
    }

    public Individual(int[] chromosome) {
        this.chromosome = chromosome;
    }

    public void calculateFitness() {
        for (int i:chromosome) {
            fitness+=i;
        }
    }

    public int getFitness() {
        return fitness;
    }

    public int[] getChromosome() {
        return chromosome;
    }

    @Override
    public int compareTo(Object o) {
        Individual individual=(Individual) o ;
        return Integer.compare(this.fitness, individual.fitness);
    }

    public void setChromosome(int[] chromosome) {
        this.chromosome = chromosome;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
}
