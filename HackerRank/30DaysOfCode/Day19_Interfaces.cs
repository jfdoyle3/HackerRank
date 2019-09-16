//using System;
//public interface AdvancedArithmetic
//{
//    int divisorSum(int n);
//}

//public class Calculator : AdvancedArithmetic
//{
//    public int divisorSum(int n)
//    {
//        int tally = 0;
//        for (int i = 1; i <= n; i++)
//        {
//            int div = n % i;
//            if (div == 0)
//            {
//                tally += i;
//            }
//        }

//        return tally;
//    }
//}

//class Solution
//{
//    static void Main(string[] args)
//    {
//        int n = Int32.Parse(Console.ReadLine());
//        AdvancedArithmetic myCalculator = new Calculator();
//        int sum = myCalculator.divisorSum(n);
//        Console.WriteLine("I implemented: AdvancedArithmetic\n" + sum);
//    }
//}