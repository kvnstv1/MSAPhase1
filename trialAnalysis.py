import matplotlib.pyplot as plt
import pandas as pd
import datetime as dt
from sklearn.linear_model import LinearRegression

dt.datetime.strptime('1999.06', '%Y.%m')
dt.datetime(1990,6,1,0,0)
parser = lambda date: pd.datetime.strptime(date,'%Y.%m')
dataset = pd.read_csv("C:/Users/Dell G15/Desktop/[Semester 2]/MSAPhase1/foodPrice.csv", sep=",", parse_dates=[1], date_parser = parser)

pd.options.display.max_columns = None
print(dataset.shape)
#print(dataset.head())

dataset = dataset.drop('Group', axis =1)
dataset = dataset.drop('Subject',axis=1)
dataset = dataset.drop('Series_reference',axis=1)
dataset = dataset.drop('STATUS', axis = 1)
dataset = dataset.drop('UNITS', axis = 1)
dataset = dataset.drop('Series_title_1', axis = 1)

print(dataset.columns.tolist())
print(dataset.shape)

print(dataset.head())


dataset.plot(x = 'Period', y = 'Data_value', xlabel='Period', ylabel = 'value')
#model = LinearRegression().fit(dataset[0],dataset[1])
plt.show()
