﻿//using System;

//class Printer
//{

//    public static void PrintArray<TypeOfValue>(params TypeOfValue[] A)
//    {
//        for (int index = 0; index < A.Length; index++)
//            Console.WriteLine(A[index]);
//    }



//    static void Main(string[] args)
//    {
//        int n = Convert.ToInt32(Console.ReadLine());
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++)
//        {
//            intArray[i] = Convert.ToInt32(Console.ReadLine());
//        }

//        n = Convert.ToInt32(Console.ReadLine());
//        string[] stringArray = new string[n];
//        for (int i = 0; i < n; i++)
//        {
//            stringArray[i] = Console.ReadLine();
//        }

//        PrintArray<Int32>(intArray);
//        PrintArray<String>(stringArray);
//    }
//}