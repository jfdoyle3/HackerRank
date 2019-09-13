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

            List<int> binaryNum = new List<int>();
            Console.WriteLine("Input a number to be converted to binary");
            int base10 = Convert.ToInt32(Console.ReadLine());
            int counter=0;
            int total = 0;
            //int[] count = new int[0];
            List<int> count = new List<int>();

            while (base10>0)
            {
                int quotient = base10 /2;
                int remainder = base10 % 2;
                base10 = quotient;
               //   Console.WriteLine("remain: {0}",remainder);
                binaryNum.Add(remainder);
                
            } 
           binaryNum.Reverse();
            


            for (int index = 0; index < binaryNum.Count; index++)
            {

                if (binaryNum[index] == 1)
                {
                    counter++;
                    total = counter;
                    count.Add(total);
                    //count[index] = total;
                }
                else
                    counter  = 0;

                //if(total > index)

             //   Console.WriteLine("Index{0}:   {1}", index, binaryNum[index]);
                
            }
            count.Sort();
            count.Reverse();


            foreach (int item in count)
                Console.Write("{0}, ", item);
            Console.WriteLine();
            foreach (int number in binaryNum)
                Console.Write(number);

            Console.WriteLine("\n--------------");
            Console.WriteLine("\n\nCount:  {0}", count[0]);
        }
    }
}
