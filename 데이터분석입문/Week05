1. '''
import matplotlib.pyplot as plt

x_data = [1, 2, 3, 4, 5]
data_y = [10, 20, 30, 50, 40]
data_y2 = [20, 30, 70, 30, 20]
data_y3 = [10, 40, 80, 20, 10]

plt.rc('font', family='Malgun Gothic')
plt.rc('axes', unicode_minus=False)

plt.title('제목1')
plt.plot(x_data, data_y)
plt.plot(x_data, data_y2)
plt.plot(x_data, data_y3)
plt.show()
'''
![image](https://github.com/JD12321/1-2-ME/assets/127118453/77b9ecd3-8dbd-4670-b556-50add4e74d84)

2. ''' 
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
    
    
    #print(max_data)
    #print(min_data)
    #print(x_data)
    
    return {
        'max_data': max_data,
        'min_data': min_data,
        'x_data': x_data
    }    
    
#end def


def show_chart(x_data, data1, data2):    
    plt.rc('font', family='Malgun Gothic')
    plt.rc('axes', unicode_minus=False)

    plt.figure(figsize=(10,2))
    plt.title('년도별 최고/저 온도')
    
    plt.plot(x_data, data1)
    plt.plot(x_data, data2)
    plt.show()
#end def


result = get_temp_data()
show_chart(result['x_data'], result['max_data'], result['min_data'])
show_chart([1,2,3,4,5], [10,20,30,40,50], [20,30,40,50,60])
'''
![image](https://github.com/JD12321/1-2-ME/assets/127118453/03eaf0bd-dc3d-40ef-99d2-93237ee12790)

3. '''
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
'''
![image](https://github.com/JD12321/1-2-ME/assets/127118453/ce58e9b5-9784-4836-8a7b-c3deeceafff1)
