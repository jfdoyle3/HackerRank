#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    count=0
    results=0
    binary=bin(n).replace("0b","")
    
    for number in binary:
        if int(number)==1:
            count+=1
        if int(number)==0:
            if count>=results:
                results=count
            count=0
            
    print(results)       
