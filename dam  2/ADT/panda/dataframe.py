import pandas as pd

# Creamos un DataFrame desde un diccionario
data = {
    "Nombre": ["Ana", "Luis", "María"],
    "Edad": [23, 35, 29],
    "Ciudad": ["Madrid", "Barcelona", "Sevilla"]
}

df = pd.DataFrame(data)

print(df)
