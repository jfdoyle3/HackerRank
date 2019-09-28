using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank.Practise.Algorithms.Warmups
{
    class BirthdayCandles
    {
        public static void birthdayCandles()
        {
            int count = 1;
            Array.Sort(ar);
            if (ar[0] == ar[ar.Length - 1])
            {
                count = ar.Length;
                return count;
            }

            Array.Reverse(ar);

            for (int i = 0; i < ar.Length; i++)
            {
                if (ar[i] == ar[i + 1])
                    count++;
                else
                    break;
            }
            return count;
        }
    }
}
