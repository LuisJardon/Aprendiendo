import pandas as pd
df = pd.read_csv('ejemplo_datos.csv')
# para que me muestre los que tengan mayor salario de 300o euros- print(df[df["salario"] > 3000])
# para mostrar la relacion entre el salario y la iudad -print(df.groupby("ciudad")["salario"].mean())
print(df.sort_values(by="edad", ascending=True))