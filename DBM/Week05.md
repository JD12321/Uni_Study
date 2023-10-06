
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
