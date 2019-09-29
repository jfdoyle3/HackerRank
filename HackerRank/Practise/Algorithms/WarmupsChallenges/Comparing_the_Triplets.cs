using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank.Practise.Algorithms.WarmupsChallenges
{
    class Comparing_the_Triplets
    {
        public  static List<int> Triplets()
        {
            List<int> a = new List<int>();
            List<int> b = new List<int>();
            


            List<int> points = new List<int>();

            int alice = 0;
            int bob = 0;

            for (int i = 0; i < a.Count; i++)
            {
                if (a[i] < b[i])
                    bob++;

                if (a[i] > b[i])
                    alice++;
            }

            points.Add(alice);
            points.Add(bob);

            return points;
        }
    }
}
