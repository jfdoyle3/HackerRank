using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HackerRank.Practise.Algorithms.Warmups
{
    class SockMerchant
    {
        public static void Sock_Merchant()
        {
            int[] ar = { 4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5 };

            Array.Sort(ar);
            int count = 0;
            

            for (int j = 0; j < ar.Length-1;  j++)
            {
                Console.WriteLine("{0} |  {1}",ar[j],ar[j+1]);

                if (ar[j] == ar[j + 1])
                {
                    count++;
                    j++;
                }

            }

           Console.WriteLine("end: {0}", count);
        }
    }
}
