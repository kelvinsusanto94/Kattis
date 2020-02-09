#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Synchronizing Lists.py
# Date Created : 29/1/2020

while (True):
    N = int(input())

    if (N == 0):
        break
    else :
        originalList = []
        firstList = []
        secondList = []

        for i in range (N):
            S = int(input())
            originalList.append(S)

        for i in range (N):
            S = int(input())
            secondList.append(S)

        firstList = sorted(originalList)
        secondList.sort()

        for i in range (N):
            index = firstList.index(originalList[i])
            print (secondList[index])
        print()