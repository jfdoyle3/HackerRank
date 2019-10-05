using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank.Practise.Algorithms.WarmupsChallenges
{
    class CountingValleys
    {
        public static void VallyCount()
        {


            //string s = "UDDDUDUU";
            // string s = "DU";
            string s = "DDUUDDUU";
        int steps = 0;
        int valleyCount = 0;
        bool isValley = false;

        char[] ar = s.ToCharArray();
        int len = s.Length;
            Console.WriteLine("Steps: {0}",steps);
        for(int i=0; i<len; i++)
        {
            if(ar[i]=='U')
                {
                    steps++;
                    Console.WriteLine("U: {0}",steps);
                }
            if(ar[i]=='D')
                {
                    steps--;
                   isValley = true;
                    Console.WriteLine("D: {0}", steps);
                }

                if (steps == 0)
                {
                   isValley = false;
                    valleyCount = 0;
                }
                    
                    

                if (isValley == true && valleyCount == 0 && steps<0)
                    valleyCount++;


                Console.WriteLine("is: {0}", isValley);
        }
        Console.WriteLine("\n\n\n\nValleys: {0}",valleyCount);
        }
    }
}
