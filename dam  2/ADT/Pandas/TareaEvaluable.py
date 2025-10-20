import pandas as pd
#leer el archivo CSV
archivo_csv = 'datos.csv'

df = pd.read_csv('datos.csv')

# 2.Y AHORA YA PUEDO COMENZAR A HACER LAS  CONSULTAS Y FILTROS


#1.Mostrar las 5 ciudades con mayor poblaciónn

ordenado = df.sort_values('Población de la ciudad', ascending=False)

# Selecciono las 5 primeras filas y muestra solo las columnas 'Ciudad' y 'Población de la ciudad'
cinco_primeros = ordenado.head(5)[['Ciudad', 'Población de la ciudad']]

print("Las 5 ciudades con mayor población son:")
print(cinco_primeros)

     



# 2. Buscar personas con el apellido "Gomez"
gomez = df[df['Apellido'] == 'Gomez']

print("Personas con el apellido Gomez:")
print(gomez)




# 3. Calcular el promedio de edad por ciudad 

promedio_edad = df.groupby('Ciudad')['Edad'].mean()

print("Promedio de edad por ciudad:")
print(promedio_edad)


#4. Filtrar personas que viven en el código postal 28001 

resultado = df[df['Código postal'] == 28001]

print("Personas que viven en el código postal 28001:")
print(resultado)





#5. Contar el número de personas por ciudad 

conteo_por_ciudad = df.groupby('Ciudad').size()

print("Número de personas por ciudad:")
print(conteo_por_ciudad)




#6. Filtrar por rangos de edad (18-30 y 31-50) 

grupo_18_30 = df[(df['Edad'] >= 18) & (df['Edad'] <= 30)]


grupo_31_50 = df[(df['Edad'] >= 31) & (df['Edad'] <= 50)]

print("Personas entre 18 y 30 años:")
print(grupo_18_30)

print("\nPersonas entre 31 y 50 años:")
print(grupo_31_50)



# 7. Eliminar registros con datos incompletos 
# Contar filas antes de eliminar las filas con datos nulos o vacíos
filas_antes = df.shape[0]

# Eliminar filas con cualquier valor nulo o vacío
df_sin_nulos = df.dropna()

# Contar filas después de eliminación
filas_despues = df_sin_nulos.shape[0]

# Calcular cuántas filas fueron eliminadas
filas_eliminadas = filas_antes - filas_despues

print(f"Se eliminaron {filas_eliminadas} filas con datos incompletos.")

# Mostrar DataFrame resultante sin filas con datos nulos
print(df_sin_nulos)

