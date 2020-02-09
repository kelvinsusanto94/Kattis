#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Quick Brown Fox
# Date Created : 29/1/2020

N = int(input())

for i in range (N):
    aplhaList = list(map(chr, range(97, 123)))

    S = input().lower()

    for j in range (len(S)):
        if (S[j] in aplhaList):
            index = aplhaList.index(S[j])
            aplhaList.pop(index)

    if (aplhaList == []):
        print ('pangram')
    else :
        print ('missing ', *aplhaList, sep='')