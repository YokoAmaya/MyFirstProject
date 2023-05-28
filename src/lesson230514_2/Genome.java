package lesson230514_2;

import java.util.*;

//Повторяются ли в цепочке участки длинны m
public class Genome {
    public static int GENOME_SIZE = 100_000;
    public static int M = 3;

    public static char[] letters = {'A', 'C', 'G', 'T'};
    char[] sequence;

    public void generateSequence() {
        Random random = new Random();
        sequence = new char[GENOME_SIZE];
        for(int i =  0; i < sequence.length; i++) {
            sequence[i] = letters[random.nextInt(letters.length)];
        }
    }
    public void searchDuplicatesBruteForce(char[] data , int M) {
        for (int i = 0; i < data.length - M + 1; i++) {
            for (int j = i+1; j < data.length - M + 1; j++) {
                //System.out.println(data[i] + ", " + data[j]);
                int k = i;
                int m = j;
                int n = 0;
                while (data[k++] == data[m++] && ++n < M){
                }
                if (n == M)
                    System.out.println("Match at " + i + " and " + j);

            }
        }
    }

    public void searchDuplicatesSorting(char[] data , int M) {
        List<String> words = new LinkedList<>();
        for (int i = 0; i < data.length - M + 1; i++) {
            String word = new String(data, i, M);
            words.add(word);
        }

        Collections.sort(words);
        Iterator<String> it = words.iterator();
        String last = "";
        while (it.hasNext()){
            String word = it.next();
            if(word.equals(last)) {
                System.out.println("Match!");
            }
            last = word;
        }
    }
    public static void main(String[] args) {
        Genome genome = new Genome();
        genome.searchDuplicatesBruteForce(new char[] {'A', 'A', 'C', 'T', 'A', 'A', 'C' } , 3);
        genome.generateSequence();
        //genome.searchDuplicatesBruteForce(genome.sequence, 10);
        genome.searchDuplicatesSorting(genome.sequence, 10);
    }

}
