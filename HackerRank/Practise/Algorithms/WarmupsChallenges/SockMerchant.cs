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
            int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
            Array.Sort(ar);
            List<int> list = ar.ToList();
            int count = 0;
            int index = 0;

            while (index < ar.Length)
                for (int i = 0; i < list.Count; i++)
                {
                    if (list[0] == list[1])
                    {
                        Console.Write("list: ");
                        foreach (int num in list)
                        {
                            Console.Write("{0}, ", num);
                        }
                        Console.WriteLine("\n i: {0}", i);
                        count++;
                        list.RemoveRange(0, 1);

                    }
                    // else
                    //     break;
                }

            Console.WriteLine("end: {0}", count);
        }
    }
}
