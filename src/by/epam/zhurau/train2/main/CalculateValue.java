package by.epam.zhurau.train2.main;

/**
 * Created by Dzmitry_Zhurau on 2/20/2017.
 */
public class CalculateValue {
    public static int calculateMultiplication(int x )
    {
        int iResult=1;
        while  (x % 10 >0)
        {
            iResult=iResult*(x % 10);
            x=x/10;
        }

        return iResult;
    }
}
