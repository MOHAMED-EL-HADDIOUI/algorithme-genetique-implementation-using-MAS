package GAWithChars;

import java.util.Random;

public class Individual implements Comparable {
    private char [] chromosome = new char[GAUtils.CHROMOSOME_SIZE];
    private double fitness ;

    public Individual() {
        Random random=new Random();
        for (int i = 0; i < GAUtils.CHROMOSOME_SIZE; i++) {
            chromosome[i]=GAUtils.ALPHABET.charAt(random.nextInt(GAUtils.ALPHABET.length()));

        }
    }

    public Individual(char[] chromosome) {
        this.chromosome = chromosome;
    }

    public void calculateFitness() {
//        for (int i:chromosome) {
//            fitness+=i;
//        }
//        System.out.println(chromosome.length);
//        System.out.println(GAUtils.TARGET_PHRASE.length());



        int count = 0;

        for (int i = 0; i < GAUtils.TARGET_PHRASE.length(); i++) {
            if (chromosome[i] == GAUtils.TARGET_PHRASE.charAt(i)) {
                count++;
            }
        }

        fitness+= (double) count / GAUtils.TARGET_PHRASE.length();

    }

    public double getFitness() {
        return fitness;
    }

    public char[] getChromosome() {
        return chromosome;
    }

    @Override
    public int compareTo(Object o) {
        Individual individual=(Individual) o ;
        return Double.compare(this.fitness, individual.fitness);
    }

    public void setChromosome(char[] chromosome) {
        this.chromosome = chromosome;
    }

    public void setFitness(char fitness) {
        this.fitness = fitness;
    }
}
