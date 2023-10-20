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
