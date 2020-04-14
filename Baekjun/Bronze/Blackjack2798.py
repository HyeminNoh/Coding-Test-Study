n, m = map(int, input().split())
cards = list(map(int, input().split()))
cardLen = len(cards)
sum = 0
for i in range(0, cardLen - 2):
        for j in range(i + 1, cardLen - 1):
                for k in range(j + 1, cardLen):
                        if cards[i] + cards[j] + cards[k] > m:
                                continue
                        else:
                                sum = max(sum, cards[i] + cards[j] + cards[k])
print(sum)