package DynamicProgrammingStringsArray.UglyNumbers;

public class UglyNumber {

    private int MaxDivid(int num, int b){
        while(num % b == 0){
            num = num / b;
        }

        return num;
    }

    private int isUgly(int num){
        num = MaxDivid(num, 2);
        num = MaxDivid(num, 3);
        num = MaxDivid(num,5);

        return num == 1 ? 1 : 0;
    }

    int getNthUglyNo(int n)
    {
        int i = 1;

        // ugly number count
        int count = 1;

        // check for all integers
        // until count becomes n
        while(n > count)
        {
            i++;
            if(isUgly(i) == 1)
                count++;
        }
        return i;
    }

}
