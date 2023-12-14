import csv
import matplotlib.pyplot as plt
import numpy as np

f = open('서울시 지하철 호선·역·시간대별 승하차 인원 정보.csv', 'r', encoding='utf-8')
data = csv.reader(f)
next(data)

# 학교로 가는 지하철 운행 수 (광운대, 청량리, 동묘앞 순)
snum_to_unv = [[1]*4,[1]*4,[0,0,1,1]]
# 학교로 가는 지하철
s_to_unv = [['경원선','광운대'], ['1호선','청량리'], ['1호선','동묘앞']] 

unv_clt = [0] * 4 # 등교 쾌적도 초기화

# 등교 시 지하철 쾌적도
for i in s_to_unv:
    for row in data:
        if i[0]==row[1] and i[1]==row[2]:
            s_cgt = [0] * 4 # 지하철 혼잡도 초기화
            row[3:] = map(int, row[3:]) # 문자열 정수로 변환
            for a in range(3):
                # (5~6h,6~7h,7~8h,8~9h) 등교 시간 범위
                for j in range(4): 
                    # 혼잡도 계산 및 안오는 지하철 걸러내기
                    s_cgt[j] = (((row[5 + j * 2]) // 31) - ((row[6 + j * 2]) // 31)) * snum_to_unv[a][j]
                
                    # 시간 별 지하철 등교 쾌적도 누적 (- 이유, 쾌적도는 혼잡도와 반비례함)
                    unv_clt[j] += -(s_cgt[j])
# 그래프 설정
plt.figure(figsize=(10, 5))  # 그래프 크기 설정
plt.title('등교시 쾌적도', fontdict={'size': '20'})

# 인덱스 설정
index = np.arange(4)

# 한글 깨짐 설정
plt.rcParams['font.family'] = 'Malgun Gothic'

# 마이너스 깨짐 설정
plt.rcParams['axes.unicode_minus'] = False

# 지하철 쾌적도 꺾은선 그리기 및 값 표시
plt.plot(unv_clt, label='지하철 쾌적도', color='gold', marker='o')
for i, val in enumerate(unv_clt):
    plt.text(i, val, f'{val:,}', ha='center', va='bottom', fontsize=9)

plt.xlabel('시간 대', fontdict={'size': '15'})
plt.ylabel('쾌적도', fontdict={'size': '15'})
plt.xticks(index, [f'{i+5}~{i+6}h' for i in range(4)])  # x축 레이블 설정

plt.legend()
plt.show()
