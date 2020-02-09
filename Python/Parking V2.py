#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Parking V2.py
# Date Created : 30/1/2020

A, B, C = map(int, input().split())

time = []
for i in range (3):
    arrive, depart = map(int, input().split())
    time.extend(list(range(arrive, depart)))

time.sort()
total = 0
while (time != []):
    count = time.count(int(time[0]))

    if (count == 1):
        total += A
    elif (count == 2):
        total += (B * 2)
    else:
        total += (C * 3)

    remove = time[0]
    while (remove in time):
        time.pop(0)

print (total)