using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;


namespace HackerRank
{
    class Day10_Binary_Numbers
    {
        public static void BinaryNumbers()
        {

            // binary  0| 1 | 2 | 4 | 8 |16 |32 |64 |128
            // binary2 0|  0| 1 | 2 |  3| 4 |  5| 6 | 7

            //Binary:    r:     0       1      0     0       0       1   flip: 100010 =34
            // Base 10: 34 | 2/34=17 2/17=8  2/8=4  2/4=2   2/2=1   2/1=0
            //int[] binaryNum = { 1, 0, 1 ,1}; // Bsse 10 = 13 ,  2 consecitive 1s.
            //double power = 4;
            //double based =2;
            //double topow=Math.Pow(based,power);

            //Console.WriteLine(topow);
            List<int> binaryNum = new List<int>();
            int base10 = Convert.ToInt32(Console.ReadLine());
            int count=0;

            while (base10>0)
            {
                int quotient = base10 /2;
                int remainder = base10 % 2;
                binaryNum.Add(remainder);
                base10 = quotient;
            }

            binaryNum.Reverse();

            for (int index = 0; index < binaryNum.Count; index++)
            {
                
                if (binaryNum[index] == 1 && index<binaryNum.Count)
                {
                    count++;
                 

                }
               else
                   count = 0;


                Console.WriteLine("Index{0}:   {1}", index, binaryNum[index]);

            }
            //binaryNum.Reverse();
            foreach (int number in binaryNum)
                Console.Write(number);

            Console.WriteLine("\n--------------");
            Console.WriteLine("Count:  {0}",count);
        }
    }
}
