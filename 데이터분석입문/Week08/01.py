"""
01.
"""
import csv
import random
import matplotlib.pyplot as plt

def display_chart(x_data, data):
    
    plt.plot(x_data, data)
    plt.show()

#end-def

def get_data():

    check_text = '전국  (0000000000)'

    file = open('exam01.csv', 'r', encoding='utf-8')
    csv_data = csv.reader(file)

    data = []
    temp_data = []
    x_data = range(0, 101)

    for line in csv_data:
        if line[0] == check_text:
            temp_data = line[3:]

    i = 0
    for cur_data in temp_data:
        num = int(cur_data.replace(',', ''))
        data.append(num)

    return {
        'x_data' : x_data,
        'data' : data  
    }
#end-def

result = get_data()
print(result['x_data'])
print(result['data'])
display_chart(result['x_data'], result['data'])
