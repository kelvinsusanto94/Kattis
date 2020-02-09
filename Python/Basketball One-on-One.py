#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Basketball One-on-One.py
# Date Created : 24/1/2020

S = input()
scorer = S[0::2]
points = S[1::2]

scoreA, scoreB = 0 , 0
for i in range (len(scorer)):
    if (scorer[i] == 'A'):
        scoreA += int(points[i])
    else:
        scoreB += int(points[i])

if (scoreA > scoreB):
    print ('A')
else:
    print ('B')