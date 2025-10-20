import pandas as pd

# 1) Leer el CSV
df = pd.read_csv("datos_grandes.csv")

# Personas de Madrid, con salarios mayores a 4000 y edad entre 25 y 35
f_madrid = df[df["ciudad"] == "Madrid"]
f_salario = df[df["salario"] > 4000]
f_edad = df[(df["edad"] >= 25) & (df["edad"] <= 35)]

print("\n--- Personas de Madrid ---")
print(f_madrid.head())

print("\n--- Salarios > 4000 ---")
print(f_salario.head())

print("\n--- Edad entre 25 y 35 ---")
print(f_edad.head())
