package ch6_IfStatement_TernaryOperator;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

       int a=0;


        if (a==0){System.out.println( "Im neutral");}
        else if(a>0){System.out.println("I m positive");}
        else {System.out.println("I am negative");}


    }
}
