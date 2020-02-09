#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Harshad Numbers.py
# Date Created : 22/1/2020

S = input()

harshad = int(S)
div = sum(map(int, S))
while (True):
    if (harshad % div != 0):
        harshad += 1
        div = sum(map(int, str(harshad)))
    else:
        print (harshad)
        break