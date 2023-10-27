"""
01.
"""
import csv
from exam1027_data import get_data, display_chart, display_bar_chart

filename = '2022_연령별인구현황.csv'

input_text = '전국'

data_2022_male =  get_data(filename, '남성', input_text)
print(data_2022_male)

data_2022_female = get_data(filename, '여성', input_text)
print(data_2022_female)


filename = '2021_연령별인구현황.csv'

data_2021_male = get_data(filename, '남성', input_text)
print(data_2021_male)

data_2021_female = get_data(filename, '여성', input_text)
print(data_2021_female)

title = '2022년도 남녀 인구'
y_data = range(101)
#display_chart(title, data_2021_male, data_2022_male)
display_bar_chart(title, y_data, data_2022_female, data_2022_male)
