import pandas as pd
#dataframe ejemplo
data = {'Nombre': ['Ana', 'Luis', 'Carlos', 'Marta'],
        'Edad': [23, 34, 45, 29],
        'Ciudad': ['Madrid', 'Barcelona', 'Valencia', 'Sevilla']}
dataframe= pd.DataFrame(data)
print(dataframe)