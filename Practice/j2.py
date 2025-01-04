word1 = input()
w1 = list(word1)
word2 = input()
w2 = list(word2)
w3 = ["-"] * len(w1)
for i in range(0, len(w2)):
    if w2[i] in w1:
        w3[w1.index(w2[i])] = w2[i]
# print(w1)
# print(w2)
# print(w3)
silent = " "
c = 0
for k in range(len(w1)):
    if w1[c] in w2:
        w2.remove(w1[c])
        w1.remove(w1[c])
    else:
        c += 1
print(w1)
print(w2)
        
# print(w1[0], w2[0])
# print(silent)
