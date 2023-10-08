[기온데이터_01.csv](https://github.com/JD12321/1-2-ME/files/12839925/_01.csv)
'''
import csv
f = open('기온데이터_01.csv', encoding='UTF-8')
data = csv.reader(f)
headr = next(data)

min_temp = 999
min_data = ''

for row in data:
    if len(row) == 10:
        if row[3] == '' :
            row[3] = 999
        if float(min_temp) > float(row[3]):
            min_data = row[9]
            min_temp = row[3]
f.close()

print(f'기상 관측 아래 서울의 최저 기온이 가장 낮았던 날은 {min_data}로 {min_temp}도 였습니다.')
'''
