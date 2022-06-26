package Triangles;

import java.util.Scanner;

public class sortingGettingValue {


    int a,b,c;

    private int insertValue(){
        int pętla = 0;

        Scanner scanner = new Scanner(System.in);
        while(pętla == 0){
        int dlugosc = scanner.nextInt();

        if(dlugosc > 0 ){
            pętla++;
            return dlugosc;
        }else{
            System.out.println("Podany parametr jest błędny");
            System.out.println("Podaj poprawny parametr");
        }}
        return 0;
    }



    public void aValue(){
        System.out.println("Podaj dlugosc boku a");
        int a = insertValue();
        this.a = a;
    }
    public void bValue(){
        System.out.println("Podaj dlugosc boku b");
        int b = insertValue();
        this.b = b;
    }
    public void cValue(){
        System.out.println("Podaj dlugosc boku c");
        int c = insertValue();
        this.c = c;
    }




}
