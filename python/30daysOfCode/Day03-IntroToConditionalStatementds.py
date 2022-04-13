#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input().strip())

    if N%2==1:
        print("Weird")
    
    if N>=2 and N<=5 and N%2==0:
        print("Not Weird")

    if N>=6 and N<=20 and N%2==0:
        print("Weird")
        
    if N>20 and N%2==0:
        print("Not Weird")
