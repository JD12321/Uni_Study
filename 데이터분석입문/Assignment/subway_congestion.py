import csv
import matplotlib.pyplot as plt
import numpy as np

f = open('서울시 지하철 호선·역·시간대별 승하차 인원 정보.csv', 'r', encoding='utf-8')
data = csv.reader(f)
next(data)
s_in = [0] * 21  # 승차 인원 초기화
s_out = [0] * 21  # 하차 인원 초기화
s_cgt = [0] * 21 # 지하철 혼잡도 초기화

lin, stn = input('띄어쓰기를 통해 구분하여 찾고 싶은 호선·역명을 작성하시오 >> ').split()

# 데이터 처리
for row in data:
    if lin in row[1] and stn in row[2]: 
        row[3:] = map(int, row[3:]) # 문자열 정수로 변환
        
        for j in range(21):
            s_in[j] = (row[3 + j * 2]) // 31 # 10월은 31일 이므로 31을 정수 나누기로 나눔
            s_out[j] = (row[4 + j * 2]) // 31
            s_cgt[j] = s_in[j] - s_out[j]

f.close()  

# 그래프 설정
plt.figure(figsize=(10, 5))  # 그래프 크기 설정
plt.title(f'{lin} {stn}역 시간대별 승하차 인원')

# 인덱스 설정
index = np.arange(21)

# 각 막대의 너비 설정
bar_width = 0.2

# 간격 설정
space = 0.05

# 한글 깨짐 설정
plt.rcParams['font.family'] = 'Malgun Gothic'

# 마이너스 깨짐 설정
plt.rcParams['axes.unicode_minus'] = False

# 승차 막대 그리기 및 값 표시
plt.bar(index - space, s_in, bar_width, alpha=0.8, label='승차')
for i, val in enumerate(s_in):
    plt.text(i, val, f'{val:,}', ha='center', va='bottom', fontsize=8)

# 하차 막대 그리기 및 값 표시
plt.bar(index + bar_width + space, s_out, bar_width, alpha=0.8, label='하차')
for i, val in enumerate(s_out):
    plt.text(i + bar_width, val, f'{val:,}', ha='center', va='bottom', fontsize=8)

# 지하철 혼잡도 꺾은선 그리기 및 값 표시
plt.plot(s_cgt, label='지하철 내 혼잡도', color='gold', marker='o')
for i, val in enumerate(s_cgt):
    plt.text(i, val, f'{val:,}', ha='center', va='bottom', fontsize=9)

plt.xlabel('시간대', fontdict={'size': '15'})
plt.ylabel('인원 수', fontdict={'size': '15'})
plt.xticks(index + bar_width / 2, [f'{i+4}~{i+5}시' for i in range(21)])  # x축 레이블 설정

# x축 범위 조절
plt.xlim(-0.5, max(index) + bar_width * 2 + 0.5)
plt.legend()
plt.show()
