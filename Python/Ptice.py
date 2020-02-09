#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Ptice.py
# Date Created : 27/1/2020

Adrian = ['A', 'B', 'C']
Bruno = ['B', 'A', 'B', 'C']
Goran = ['C', 'C', 'A', 'A', 'B', 'B']

N = int(input())
S = input()

score = [0, 0, 0]
for i in range (N):
    if (S[i] == Adrian[i%3]):
        score[0] += 1

    if (S[i] == Bruno[i%4]):
        score[1] += 1

    if (S[i] == Goran[i%6]):
        score[2] += 1

maxScore = max(score)
print (maxScore)

if (maxScore == score[0]):
    print ('Adrian')
if (maxScore == score[1]):
    print ('Bruno')
if (maxScore == score[2]):
    print ('Goran')