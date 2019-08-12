using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank._30DaysOfCode
{
    class Day3_Intro_to_Conditional_Statements
    {
        public static void Conditional()
        {
            int N = Convert.ToInt32(Console.ReadLine());

            if (N % 2 != 0)
                Console.WriteLine("Weird");
            else if (N <= 5)
                Console.WriteLine("Not Weird");
            else if (N <= 20)
                Console.WriteLine("Weird");
            else if (N > 20)
                Console.WriteLine("Not Weird");
        }
    }
}
