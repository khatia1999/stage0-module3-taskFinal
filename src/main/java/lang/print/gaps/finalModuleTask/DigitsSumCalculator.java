package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        number = 12345;

        int a,b,c,d,e;

        a = number % 10; // 5
        b = number % 100/10; // 4
        c = number % 1000/100; // 3
        d = number % 10000/1000; // 2
        e = number % 100000/10000; // 1

        System.out.println(a+b+c+d+e);


    }
}
