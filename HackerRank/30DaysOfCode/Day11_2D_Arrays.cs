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
            for (int i = 0; i < 6; i++)
            {
                arr[i] = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp));

            }

            int row = 0;
            int col = 0;
            int start = 0;
            int top = 3;
            int middle = 3;
            int bottom = 3;





            // for (int c = 0; c < arr[0].Length; c++)
            //  {
            //     for (int r = 0; r < arr[c].Length; r++)
            //     {
            //         row += arr[c][r];
            //     }
            //     col += row;
            // }
            // Console.Write(row);

        }
    }
}
