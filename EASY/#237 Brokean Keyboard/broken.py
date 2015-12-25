letters=[]

with open('input.txt','r') as entrada:
    for line in entrada:
        letters.append(list(line.split('\n')[0]))
    del letters[0]
entrada.close()

def validword(word, letters):
    for letter in word:
        if letter not in letters:
            return False
    return True

possiblewords=[]

for setofletters in letters:
    with open ('enable1.txt','r') as file:
        tmp=[]
        for word in file:
            if validword(word.split('\r')[0],setofletters):
                tmp.append(word.split('\r')[0])
        possiblewords.append(tmp)
        file.close()

for i in possiblewords:
    print sorted(i,key=len)[-1]