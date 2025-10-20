import pandas as pd

# Leer el CSV
df = pd.read_csv("ejemplo_datos.csv") # Esto es un dataframe

# Ver primeras filas
print(df.head())

# Filtrar: personas con salario > 3000
print(df[df["salario"] > 3000])

# Agrupar: salario promedio por ciudad, la función mean se usa para calcular el promedio
print(df.groupby("ciudad")["salario"].mean()) 

# Ordenar: por edad descendente
print(df.sort_values(by="edad", ascending=False))

# Crear nueva columna: salario anual
df["salario_anual"] = df["salario"] * 12
print(df.head())

# Guardar resultados
df.to_csv("resultado.csv", index=False, encoding="utf-8")
