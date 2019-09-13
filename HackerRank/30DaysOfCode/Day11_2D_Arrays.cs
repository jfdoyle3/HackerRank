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
            int x = 3;
            int y = 3;


            for (int c = 0; c < y; c++)
            {
                for (int r = 0; r < x; c++)
                {
                    row += arr[c][r];
                }
                col += row;
            }
            Console.Write(col);
        }  
    }
}
