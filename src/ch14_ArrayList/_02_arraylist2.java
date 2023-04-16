package ch14_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        getSum();
        System.out.println("getSum() = " + getSum());//15
    }

    private static int getSum() {

        ArrayList<Integer> list= new ArrayList<>(List.of(1,2,3,4,5));

        int toplam=0;

        for (int i = 0; i < list.size(); i++) {

            toplam+=list.get(i);

        }
        return toplam;





    }


}
