"""
03.
"""
import csv
import matplotlib.pyplot as plt

csv_file = open('샘플데이터.csv', 'r', encoding='utf-8')
csv_data = csv.reader(csv_file)

header = next(csv_data)
header = next(csv_data)

male_cnt = 0
female_cnt = 0
etc_cnt = 0
a_cnt = 0
b_cnt = 0
ab_cnt = 0
o_cnt = 0
z_cnt = 0

for line in csv_data:
    if line[2] != '':
        if line[3] == '남':
            male_cnt += 1
        elif line[3] =='여':
            female_cnt += 1
        else:
            etc_cnt += 1
        
        if line[4] == 'A':
            a_cnt += 1
        elif line[4] == 'B':
            b_cnt += 1
        elif line[4] == 'AB':
            ab_cnt += 1
        elif line[4] == 'O':
            o_cnt += 1
        else:
            z_cnt += 1

print('남', male_cnt)
print('여', female_cnt)
print('기타', etc_cnt)


data = [a_cnt, b_cnt, ab_cnt, o_cnt, z_cnt]

label_txt = ['A형', 'B형', 'AB형', 'O형', '기타']
color_text = ['#ff0000', '#00ff00', '#0000ff', '#ff00ff', '#ffff00']
explode_value = [0, 0, 0.1, 0, 0]
plt.rc('font', family='Malgun Gothic')
plt.pie(data, labels=label_txt
        , autopct='%.2f%%'
        , colors=color_text
        , explode=explode_value)
plt.legend() 
plt.show()
