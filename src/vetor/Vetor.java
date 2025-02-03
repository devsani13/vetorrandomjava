package vetor;

import java.util.Random;

public class Vetor {

    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        int i;
        
        System.out.println("Randomizando um Vetor com 10 elementos numéricos");
        System.out.println("================================================");
        for(i=0; i<10; i++) {
            num[i] = r.nextInt(100);
            System.out.println("Índice["+(i+1)+"]: "+num[i]+"  ");}
    }
    
}
