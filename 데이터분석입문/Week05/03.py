"""
3.
"""
import matplotlib.pyplot as plt
import random

#data = [1,1,2,3,4,5,6,6,7,8,10]
#data = [1,1,1,1,1,1,1,1,1,1,10]

#plt.hist(data)
#plt.show()

data = []

for x in range(10000):
    value = random.randint(1, 6)
    data.append(value)
    
#print(data)

plt.hist(data)
plt.show()
