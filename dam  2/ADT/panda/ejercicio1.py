import pandas as pd
df = pd.read_csv('ventas_ecommerce.csv')

# Filtrar los pedidos realizados en Madrid
pedidos_madrid = df[df["ciudad"] == "Madrid"]
print(pedidos_madrid)

#Filtrado de datos de la categoría "Electrónica"
pedidos_electronica = df[df["categoria"] == "Electrónica"]
print(pedidos_electronica)

# Filtrar los pedidos con un precio unitario mayor a 500
pedidos_caros = df[df["precio_unitario"] > 500]
print(pedidos_caros)

#Filtrar por pedidos en los que el cliente haya comprado mas de 3 unidades
pedidos_mas_de_3 = df[df["cantidad"] > 3]
print(pedidos_mas_de_3)

#Probando a hacer filtros combinados
#Filtro de de Barcelona y categoría Ropa
filtro_combinado = df[(df["ciudad"] == "Barcelona") & (df["categoria"] == "Ropa")]
print(filtro_combinado)

#Producto de elctronica que sean caros, mayor a 1000
filtro_combinado2 = df[(df["categoria"] == "Electrónica") & (df["precio_unitario"] > 1000)]
print(filtro_combinado2)    


#Filtro  pedidos por fecha especifica enero de 2025
df["fecha"] = pd.to_datetime(df["fecha"])
pedidos_enero_2025 = df[(df["fecha"].dt.month == 1) & (df["fecha"].dt.year == 2025)]
print(pedidos_enero_2025)

#filtro  con una fecha limite
fecha_limite = pd.to_datetime("2025-09-01")
pedidos_sep24 = df[df["fecha"] < fecha_limite]
print(pedidos_sep24)


pedidos_portatil = df[df["producto"].str.contains("Portátil")]
print(pedidos_portatil)

#Filtro de clientes en Sevilla cuyo apellido sea Gómez
cliente_sevilla_gomez = df[(df["ciudad"] == "Sevilla") & (df["cliente"].str.contains("Gómez"))]
print(cliente_sevilla_gomez)
