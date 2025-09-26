print("APRENDIENDO PYTHON")

#variable="Prueba"
#print(variable)
#nombre="Luis"
#edad=26
#print(f"Mi nombre es {nombre} y tengo {edad} años")
nombre=input("Introduce tu nombre: ")

edad=int(input("Introduce tu edad: "))

estatura = float(input("Introduce tu estatura: "))

print(f"Tu nombre es {nombre}, tienes {edad} años y mides {estatura} metros")

#bUcle for en python
lista_de_compras = ["Melón", "Manzana", "Albaricoque"]


for fruta in lista_de_compras:
    print(f"En esta vuelta estamos seleccionando la fruta  {fruta}")

    #creacion de una funcion en python
def saludar(nombre):
    print(f"Hola {nombre}, ¿cómo estás?")
    nombre=input("Introduce tu nombre: ")
    edad=int(input("Introduce tu edad: "))
    print=int(f"Introduce tu edad:  {edad}")


    saludar(nombre, edad)


    #modulo os
    #para buena practica la importacion se pondria arriba
    #ahora lo pondre aqui para que sea mas sencillo visualmente

import os
archivo_mi_archivo = os.listdir()
for archivo in archivo_mi_archivo:
    if archivo.endswith(".txt"):
        print(f"ESe ha encontrado un archivo llamado: {archivo} con una extension.txt")
        print(os.listdir())
    else:
        print("No se han encontrado archivos .txt")
            



    

