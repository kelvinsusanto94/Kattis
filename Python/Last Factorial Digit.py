#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Last Factorial Digit
# Date Created : 14/12/2019

import math

T = int(input())
for i in range (T):
    N = int(input())
    fac = math.factorial(N)
    print (fac % 10)