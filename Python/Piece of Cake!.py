#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Piece of Cake.py
# Date Created : 24/12/2019

n, h, v = input().split()
n, h, v = int(n), int(h), int(v)

listVolume = []
listVolume.append(4 * h * v)
listVolume.append(4 * (n-v) * h)
listVolume.append(4 * (n-h) * (n-v))
listVolume.append(4 * (n-h) * v)

print(max(listVolume))