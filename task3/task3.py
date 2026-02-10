import random

MIN = 0
MAX = 1000
result = []

while input("Input 0 for exit:\n") != "0":
    result.append(random.randint(MIN, MAX))

print("Generated numbers:", *result)
