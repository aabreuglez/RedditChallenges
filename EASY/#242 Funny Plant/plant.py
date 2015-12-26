
challenges = []

with open('input.txt','r') as file:
    challenges=file.read().split('\n')
    file.close()

for i in challenges:
    people, plants = int(i.split()[0]), int(i.split()[1])
    weeks = 1
    fruits = 0
    while fruits < people:
        fruits += plants
        plants += fruits
        weeks += 1
    print weeks