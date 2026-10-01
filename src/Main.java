public class Main {
    public static void main(String[] args) {
        //задача 1
        for  (int i=1;i <= 10; i++){
            System.out.println(i);
        }

        //задача 2
        for  (int i1=10; i1 > 0; i1--){
            System.out.println(i1);
        }


        //задача 3
        for  (int i=1;i <= 17; i++) {
            if ((i % 2 == 0)) {
                System.out.println(i);
            }
        }

        //задача 4
        for( int i = 10 ; i >= -10; i--){
            if (i>0){
                System.out.println(i);
            }
            if(i<=0){
                System.out.println(i);
            }

        }
        //задача 5
        for (int i = 1904; i < 2096; i=i+4){
            System.out.println(i+" год является високосным");
        }

        //задача 6
        for (int i = 7; i <= 98; i=i+7){
            System.out.println(i);
        }

        //задача 7
        for (int i = 1; i <= 512; i=i*2){
            System.out.println(i);
        }

        //задача 8
        int money = 29000;
        int result = 0;
        for(int i = 0;i<12;i++){
            result = result + money;
            System.out.println("Месяц " + i +" сумма накоплений равна "+ result+" рублей");
        }

        //задчас 9
        for(int i = 0;i<12;i++){
            result = result + money/100*10;
            System.out.println("Месяц " + i +" сумма накоплений равна "+ result+" рублей");
        }

        //задача 10
        for (int i = 1;i<=10; i++){
            int c =  i * 2;
            System.out.println(c);
        }
    }
}
