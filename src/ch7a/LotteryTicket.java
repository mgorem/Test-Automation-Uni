package ch7a;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; // constant
    private static final int MAX_TICKET_NUMBER = 69; // constant
    public static void main(String[] args){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    // setting elements
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i = 0; i < LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    // getting elements
    public static void printTicket(int ticket[]){

        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
