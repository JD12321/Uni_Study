import csv
import matplotlib.pyplot as plt

def display_chart(x_data, data1, data2):
    plt.barh(x_data, data1)
    plt.barh(x_data, data2)
    plt.title('전국의 남녀 성별 인구 분포')

    plt.show()

#end-def

def get_data():

    file = open('exam02.csv', 'r', encoding='utf-8')
    csv_data = csv.reader(file)

    male = []
    female = []
    x_data = range(101)

    for line in csv_data:
        if line[0] == '전국  (0000000000)':
            male_data = line[3:104]
            female_data = line[106:208]

    for cur_data in male_data:
        num = -int(cur_data.replace(',', ''))
        male.append(num)

    for cur_data in female_data:
        num = int(cur_data.replace(',', ''))
        female.append(num)
       

    return {
        'x_data' : x_data,
        'male' : male,
        'female' : female
    }
#end-def

plt.rc('font', family='Malgun Gothic')
plt.rc('axes', unicode_minus=False)

result = get_data()
display_chart(result['x_data'], result['male'],result['female'])
