#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : ACM Contest Scoring
# Date Created : 16/12/2019

total = 0
listWrong = []
listRight = []

while (True):
    N = input().split(" ")

    if (N[0] == "-1"):
        break

    if (N[2] == "wrong"):
        listWrong.append(N[1])
    elif (N[2] == "right" and N[1] not in listRight):
        listRight.append(N[1])
        total += int(N[0])
        count = 0
        for i in range (len(listWrong)):
            if (N[1] == listWrong[i]):
                total += 20
                count += 1

print (len(listRight), total)
