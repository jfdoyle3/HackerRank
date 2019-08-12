using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank._30DaysOfCode
{
    class Day5_Loops
    {
        public static void Loop()
        {
            int n = Convert.ToInt32(Console.ReadLine());

            for (int index = 1; index <= 10; index++)
            {
                int total = n * index;
                Console.WriteLine("{0} x {1} = {2}", n, index, total);
            }
        }
    }
}
