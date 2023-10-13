"""
main.py
"""

import csv
import matplotlib.pyplot as plt


def get_temp_data():
    file = open('exam_1006_01.csv', 'r', encoding='utf-8')

    data = csv.reader(file)
    header = next(data)

    max_data = []
    min_data = []
    x_data = []

    for line in data:
        if len(line) == 11:
            date = line[2].split('-')

            year = date[0]
            month = date[1]
            day = date[2]

            if month == '10' and day == '01':
                max_temp = float(line[5])
                min_temp = float(line[8])

                max_data.append(max_temp)
                min_data.append(min_temp)
                x_data.append(year)

    max_data = list(reversed(max_data))
    min_data = list(reversed(min_data))
    x_data = list(reversed(x_data))

    # print(max_data)
    # print(min_data)
    # print(x_data)

    return {
        'max_data': max_data,
        'min_data': min_data,
        'x_data': x_data
    }


# end def


def show_chart(x_data, data1, data2):
    plt.rc('font', family='Malgun Gothic')
    plt.rc('axes', unicode_minus=False)

    plt.figure(figsize=(10, 2))
    plt.title('년도별 최고/저 온도')

    plt.plot(x_data, data1)
    plt.plot(x_data, data2)
    plt.show()


# end def


result = get_temp_data()
show_chart(result['x_data'], result['max_data'], result['min_data'])
show_chart([1, 2, 3, 4, 5], [10, 20, 30, 40, 50], [20, 30, 40, 50, 60])



"""
exam_1013_01_data.py
"""

import csv
import matplotlib.pyplot as plt

def get_temp_data():
    csv_file = open('exam_1013_01.csv', 'r', encoding='utf-8')
    data = csv.reader(csv_file)
    header = next(data)

    temp_data = []

    for line in data:
        temp = line[5]
        if temp != '':
            # print(float(temp))
            temp_data.append(float(temp))

    #print(temp_data)
    return temp_data


# end def

def display_chart(data):
    # plt.rc('font', family='Malgun Gothic')
    # plt.rc('axes', unicode_minus=False)
    # plt.title('년도별 온도')

    plt.plot(data)
    plt.show()



"""
exam_1013_01.py
"""

from exam_1013_01_data import get_temp_data
from exam_1013_01_data import display_chart


temp_data = get_temp_data()
print(temp_data)
display_chart(temp_data)
