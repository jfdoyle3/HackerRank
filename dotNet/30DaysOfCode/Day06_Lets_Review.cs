using System;
using System.Collections.Generic;
using System.IO;

namespace HackerRank
{
    public class Day6_Lets_Review
    {
        public static void LetsReview()
        {

            int N = int.Parse(Console.ReadLine());

            for (var index = 0; index < N; index++)
            {
                string word = Console.ReadLine();

                for (int even = 0; even < word.Length; even++)
                {
                    if (even % 2 == 0)
                        Console.Write(word[even]);
                }

                Console.Write(" ");

                for (int odd = 0; odd < word.Length; odd++)
                {
                    if (odd % 2 != 0)
                        Console.Write(word[odd]);
                }

                Console.WriteLine();
            }
        }
    }
}
