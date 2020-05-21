using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank._30DaysOfCode
{
    class Day25_RunningTimeAndComplexity
    {
        public static void Time()
        {
            string T = Console.ReadLine().Trim();
            int testCase = Int32.Parse(T);
            StringBuilder results = new StringBuilder();

            for (int tCase = 0; tCase < testCase; tCase++)
            {
                string strnum = Console.ReadLine();
                int number = Int32.Parse(strnum);

                int count = 0;
               
                for (int i = 1; i <= number; i++)
                {
                    if (number % i == 0)
                    {
                        count++;
                    }
                }
                //   string result = count <= 2 ? "Prime" : "Not Prime";
                if (count <= 2)
                    results.Append("Prime");
                else
                    results.Append("Not Prime");

                Console.Write(results.ToString());
            }
        }
    }
}
