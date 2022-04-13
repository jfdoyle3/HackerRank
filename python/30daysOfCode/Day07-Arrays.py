#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    reversedList=arr[::-1]
    results=' '.join(str(num) for num in reversedList)
    print(results)