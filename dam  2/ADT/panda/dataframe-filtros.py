import pandas as pd

# Crear un DataFrame desde un diccionario
data = {
    "Nombre": ["Ana", "Luis", "María"],
    "Edad": [23, 35, 29],
    "Ciudad": ["Madrid", "Barcelona", "Sevilla"]
}

df = pd.DataFrame(data)

print(df["Nombre"])        # Columna "Nombre"
print(df.iloc[0])          # Primera fila (por posición)
print(df.loc[1, "Ciudad"]) # Celda fila 1, columna "Ciudad"

