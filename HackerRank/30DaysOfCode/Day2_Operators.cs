using System;
using System.Collections.Generic;
using System.Text;

namespace HackerRank._30DaysOfCode
{
    class Day2_Operators
    {
       public static void UserInput()
        {
            double meal_cost = Convert.ToDouble(Console.ReadLine());

            int tip_percent = Convert.ToInt32(Console.ReadLine());

            int tax_percent = Convert.ToInt32(Console.ReadLine());

            solve(meal_cost, tip_percent, tax_percent);
        }

        static void solve(double meal_cost, int tip_percent, int tax_percent)
        {
            double dTip, dTax, tip, tax, total, totalCost;

            dTip = (int)tip_percent;
            dTax = (int)tax_percent;

            tip = meal_cost * (dTip / 100);
            tax = meal_cost * (dTax / 100);

            total = meal_cost + tip + tax;

            totalCost = Math.Round(total);

            Console.WriteLine(totalCost);
        }
    }


}
