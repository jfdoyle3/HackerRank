#!/bin/python3
import math
import os
import random
import re
import sys
#
# Complete the ‘migratoryBirds’ function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#
def migratoryBirds(arr):
    # Write your code here
    # count how many of each number
    # add values to an array
    # return lowest max value
    # return the highest count of numbers, lowest if more than 1
    # max_key = max(a_dictionary, key=a_dictionary.get)
    # count each value in the sorted list
    dict = {}
    keys = range(5)
    c1 = 0
    c2 = 0
    c3 = 0
    c4 = 0
    c5 = 0
    counted = [0, 0, 0, 0, 0]
    for ele in arr:
        if (ele == 1):
            c1 = c1 + 1
            counted[0] = c1
        elif(ele == 2):
            c2 = c2 + 1
            counted[1] = c2
        elif(ele == 3):
            c3 = c3 + 1
            counted[2] = c3
        elif(ele == 4):
            c4 = c4 + 1
            counted[3] = c4
        elif(ele == 5):
            c5 = c5 + 1
            counted[4] = c5
    for i in keys:
        dict[i] = counted[i]
    result = max(dict, key = dict.get)
    return result + 1
if __name__ == ‘__main__‘:
    fptr = open(os.environ[‘OUTPUT_PATH’], ‘w’)
    arr_count = int(input().strip())
    arr = list(map(int, input().rstrip().split()))
    result = migratoryBirds(arr)
    fptr.write(str(result) + ‘\n’)
    fptr.close()