"""
02.
"""
import csv
import matplotlib.pyplot as plt

def get_data(filename, gender, search_text):
    csv_file = open(filename, 'r', encoding='utf-8')
    csv_data = csv.reader(csv_file)

    check_text = search_text

    male_start_pos = 3
    male_end_pos = 104
    female_start_pos = 106
    female_end_pos = 207

    start_pos = 0
    end_pos = 0
    data = []

    if gender == '남성':
        start_pos = male_start_pos
        end_pos = male_end_pos
    elif gender == '여성':
        start_pos = female_start_pos
        end_pos = female_end_pos
    else:
        print('gender 값이 정확하지 않습니다.')
        return data
    
    for line in csv_data:
        if check_text in line[0]:
            temp_data = line[start_pos:end_pos]
            break

    for x in temp_data:
        data.append(int(x.replace(',', '')))

    csv_file.close()

    return data
#end def

def display_chart(title, data1, data2):
    
    plt.rc('font', family='Malgun Gothic')

    plt.title(title)

    plt.plot(data1)
    plt.plot(data2)
    plt.show()

def display_bar_chart(title, data_y, data1, data2):

    plt.rc('font', family='Malgun Gothic')

    plt.title(title)

    data_x = range(len(data1))

    data2_clone = []

    for x in data2:
        data2_clone.append(x * -1)

    plt.barh(data_y, data1, color='#ff0000')
    plt.barh(data_y, data2_clone, color='#0000ff')
    plt.show()

#end def
