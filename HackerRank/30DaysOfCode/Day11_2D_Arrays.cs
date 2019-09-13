using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank
{
    class Day11_2D_Arrays
    {
        public static void twoDArray()
        {
            int[][] arr = new int[6][];
            string input ="1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0" ;
            for (int i = 0; i < 6; i++)
            {
                arr[i] = Array.ConvertAll(input.Split(' '), arrTemp => Convert.ToInt32(arrTemp));

            }


            int top = 0;
            int middle = 0;
            int bottom = 0;
            int counter = 0;
            List<int> counts = new List<int>();

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    middle = arr[i + 1][j + 1];
                    bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    counter = top + middle + bottom;
                    counts.Add(counter);
                }
            }
            counts.Sort();
            counts.Reverse();

            Console.Write("{0}", counts[0]);

        }
    }
}
