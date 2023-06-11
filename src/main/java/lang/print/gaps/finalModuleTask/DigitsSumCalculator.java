package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        number = 1111;

        int a,b,c,d;

        a = number % 10;
        b = number % 100/10;
        c = number % 1000/100;
        d = number % 10000/1000;


        System.out.println(a+b+c+d);


    }
}
