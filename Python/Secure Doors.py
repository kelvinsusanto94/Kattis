#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Secure Doors
# Date Created :  14/12/2019

N = int(input())
list = []

for i in range(N):
    sentence = input()
    part = sentence.split(" ")

    if part[0] == "entry":
        if part[1] in list:
            print(part[1], "entered", "(ANOMALY)")
        else:
            list.append(part[1])
            print(part[1], "entered")

    if part[0] == "exit":
        if part[1] in list:
            list.remove(part[1])
            print(part[1], "exited")
        else:
            print(part[1], "exited", "(ANOMALY)")