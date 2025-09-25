import java.util.Scanner;

// receber um número e retornar se ele é par ou ímpar.


public class Alistamento{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite seu ano de nascimento: ");
        int ano = scan.nextInt();
        int idade = 2025-ano;


        if(idade <18){
            System.out.print("Você tem " + idade + " anos. Faltam "+(18-idade)+ " anos para se alistar.");
        }
        else if(idade ==18){
            System.out.print("Você tem " +idade+ " anos, tem que se alistar.");
        } else {
            System.out.print("Você tem " + idade + " anos. Você deveria se alistas há " +(idade-18)+" anos");



    }}}