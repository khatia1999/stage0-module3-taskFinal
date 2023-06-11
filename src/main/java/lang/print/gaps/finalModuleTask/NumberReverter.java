package lang.print.gaps.finalModuleTask;

public class NumberReverter {


    public void revert(int number) {
        number = 489;
        int b,c,d;
        b = number % 10; //9
        c = number % 100/10; // 8
        d = number % 1000/100; // 4

        System.out.println(b+""+c+""+d);

    }

}
