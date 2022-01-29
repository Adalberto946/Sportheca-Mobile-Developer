package com.projeto.atribuirreferencia;

public class Main {
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;

        System.out.println("int A= " + intA + " int b= " + intB);
        intA = 2;
        System.out.println("int A= " + intA + " int b= " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("Obj A=" + objA + " Obj B=" + objB);
        objA.setNum(2);
        System.out.println("Obj A=" + objA + " Obj B=" + objB);
    }

}
