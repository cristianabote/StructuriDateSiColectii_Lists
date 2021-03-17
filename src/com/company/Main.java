package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    // crearea obiectului din lista (poate fi LinkedList sau ArrayList)
            LinkedList<String> listA=new LinkedList<String>();

        //Adaugarea elementelor in lista
        listA.add("A");
        listA.add("B");
        listA.addFirst("C");
        listA.addLast("D");
        listA.add(2,"E");
        listA.add("F");
        listA.add("G");
        System.out.println("Lista inlantuita "+listA);
        for(String temp: listA) {
            System.out.println(temp);
        }

        // Stergerea elementelor din lista
        listA.remove("B");
        listA.remove();
        listA.remove(3);
        listA.removeFirst();
        listA.removeLast();
        System.out.println("Lista inlantuita dupa eliminare "+ listA);

        //Cautarea elementelor din lista
        if(listA.contains("A")){
            System.out.println("Lista contine elementul 'A'. ");
        }
        else{
            System.out.println("Lista nu contine elementul 'A'. ");
        }

        //Numarul elementelor din lista
        System.out.println("Numarul elementelor din lista= "+listA.size());

        //Functiile get si set ale listei inlantuite
        String element=listA.get(1);
        System.out.println("Elementul ales din lista este "+element);
        listA.set(1,"Y");
        System.out.println("Lista inlantuita dupa modificare este: "+listA);

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Gloria");
        arrayList.add(1, "Mihaela");
        System.out.println("Lista este "+arrayList);
        if(arrayList.contains("ela")){
            System.out.println("Nume Existent");
        }
        else{
            System.out.println("Nume Inexistent");
        }
    }
}
