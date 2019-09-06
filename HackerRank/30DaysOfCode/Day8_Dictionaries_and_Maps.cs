using System;
using System.Collections.Generic;
using System.IO;

namespace HackerRank
{
    class Day8_Dictionaries_and_Maps
    {
        public static void Dictionaries_and_Maps()
        {
            Dictionary<String, String> phoneNumbers = new Dictionary<String, String>();
            Console.WriteLine("How many Entries?");
            int n = int.Parse(Console.ReadLine());
            Console.Write("# Entries:  {0}\n",n);
            Console.WriteLine("Enter some data");
            Console.WriteLine();
            for (int record = 0; record < n; record++)
            {
                string entry = Console.ReadLine();
                string[] keyValue = entry.Split(' ');
                phoneNumbers.Add(keyValue[0], keyValue[1]);
            }

            //foreach (KeyValuePair<String,String> item in phoneNumbers)
            //    Console.WriteLine("Key:{0} = Value: {1}",item.Key,item.Value);
            for (int queries = 0; queries < n; queries++)
            {
                string query = Console.ReadLine();
                if (phoneNumbers.ContainsKey(query))
                {
                    string phoneNumber = phoneNumbers[query];
                    Console.WriteLine("{0}={1}", query, phoneNumber);
                }
                else
                    Console.WriteLine("Not found");
            }
        
        }
    }
}
