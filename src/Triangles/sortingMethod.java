package Triangles;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sortingMethod {


    public void sort(){
        sortingGettingValue sortingGettingValue = new sortingGettingValue();
        sortingGettingValue.aValue();
        sortingGettingValue.bValue();
        sortingGettingValue.cValue();

        if (sortingGettingValue.a != sortingGettingValue.b && sortingGettingValue.a != sortingGettingValue.c && sortingGettingValue.b != sortingGettingValue.c){
            System.out.println("Trójkąt który powstał z podanych boków jest trójątek nierównoramienny");
        }else if(sortingGettingValue.a == sortingGettingValue.b && sortingGettingValue.a == sortingGettingValue.c && sortingGettingValue.b == sortingGettingValue.c){
            System.out.println("Trójkąt który powstał z podanych boków jest trójątek równoboczny");
        }else if(sortingGettingValue.a == sortingGettingValue.b && sortingGettingValue.a != sortingGettingValue.c && sortingGettingValue.b != sortingGettingValue.c){
            System.out.println("Trójkąt który powstał z podanych boków jest trójątem równoramiennym");
        }else if(sortingGettingValue.a != sortingGettingValue.b && sortingGettingValue.a != sortingGettingValue.c && sortingGettingValue.b == sortingGettingValue.c){
            System.out.println("Trójkąt który powstał z podanych boków jest trójątem równoramiennym");
        }else if(sortingGettingValue.a != sortingGettingValue.b && sortingGettingValue.a == sortingGettingValue.c && sortingGettingValue.b != sortingGettingValue.c){
            System.out.println("Trójkąt który powstał z podanych boków jest trójątem równoramiennym");
        }else{
            System.out.println("Podane dane nie są prawidłowe");
        }
    }







}
