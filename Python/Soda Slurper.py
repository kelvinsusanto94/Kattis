#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Soda Slurper.py
# Date Created : 29/1/2020

initial, found, cost = map(int, input().split())

initial += found
purchase, total = 0, 0
while (initial >= cost):
    purchase = initial // cost
    total += purchase
    initial = (initial % cost) + purchase

print (total)