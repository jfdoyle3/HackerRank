using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank.Practise.Algorithms.Warmups
{
    class BirthdayCandles
    {
        public int birthdayCandles()
        {
            int[] ar = { 1, 1, 1, 1 };
            Array.Sort(ar);
            if (ar[0] == ar[ar.Length - 1])        
                return ar.Length;

            int count = 1;
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
