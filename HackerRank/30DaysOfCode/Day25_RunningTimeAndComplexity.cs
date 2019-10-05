using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank._30DaysOfCode
{
    class Day25_RunningTimeAndComplexity
    {
        public static void Time()
        {
            int number = 5;
            int count = 0;
            for (int i = 1; i <= number; i++)
            {
                if (number % i == 0)
                {
                    count++;
                }
            }
            if (count == 2 || count==1)
                Console.WriteLine("Prime");
            else
                Console.WriteLine("Not Prime");
        }
    }
}
