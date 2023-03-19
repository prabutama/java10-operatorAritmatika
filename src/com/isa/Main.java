package com.isa;

public class Main {
    public static void main (String[] args) {
        //Operasi Aritmatika
        int variable1 = 40;
        int variable2 = 3;
        int hasil;

        //Penjumlahan

        hasil = variable1 + variable2;
        System.out.println( variable1 + " + " + variable2 + " = " + hasil );

        //Pengurangan

        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);


        //Perkalian

        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

        //Pembagian

        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        float a = 6;
        float b = 4;
        float hasilFloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        //Modulus = Sisa pembagian

        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
        
    };
};
