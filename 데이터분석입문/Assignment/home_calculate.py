import csv
import matplotlib.pyplot as plt
import numpy as np

f = open('서울시 지하철 호선·역·시간대별 승하차 인원 정보.csv', 'r', encoding='utf-8')
data = csv.reader(f)
next(data)

# 집으로 가는 지하철 운행 수 (서동탄, 천안, 신창, 병점 순)
snum_to_hm = [[1]*5,[1]*5,[1]*5,[1,0,0,0,1]]
# 집으로 가는 지하철
s_to_hm = [['경부선','서동탄'], ['경부선','천안'], ['장항선','신창'], ['경부선','병점']]

hm_clt = [0] * 5 # 하교 쾌적도 초기화


# 하교 시 지하철 쾌적도
for i in s_to_hm:
    for row in data:
        if i[0]==row[1] and i[1]==row[2]:
            s_cgt = [0] * 5 # 지하철 혼잡도 초기화
            row[3:] = map(int, row[3:]) # 문자열 정수로 변환
            for a in range(4):
                # (17~18h,18~19h,19~20h,20~21h,21~22h) 하교 시간 범위
                for j in range(5):
                    # 혼잡도 계산 및 안오는 지하철 걸러내기
                    s_cgt[j] = (((row[29 + j * 2]) // 31) - ((row[30 + j * 2]) // 31)) * snum_to_hm[a][j]
                
                    # 시간 별 지하철 하교 쾌적도 누적 (- 이유, 쾌적도는 혼잡도와 반비례함)
                    hm_clt[j] += -(s_cgt[j])

# 그래프 설정
plt.figure(figsize=(10, 5))  # 그래프 크기 설정
plt.title('하교시 쾌적도', fontdict={'size': '20'})

# 인덱스 설정
index = np.arange(5)

# 한글 깨짐 설정
plt.rcParams['font.family'] = 'Malgun Gothic'

# 마이너스 깨짐 설정
plt.rcParams['axes.unicode_minus'] = False

# 지하철 쾌적도 꺾은선 그리기 및 값 표시
plt.plot(hm_clt, label='지하철 쾌적도', color='gold', marker='o')
for i, val in enumerate(hm_clt):
    plt.text(i, val, f'{val:,}', ha='center', va='bottom', fontsize=9)

plt.xlabel('시간 대', fontdict={'size': '15'})
plt.ylabel('쾌적도', fontdict={'size': '15'})
plt.xticks(index, [f'{i+17}~{i+18}h' for i in range(5)])  # x축 레이블 설정

plt.legend()
plt.show()
