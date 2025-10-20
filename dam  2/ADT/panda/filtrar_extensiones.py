import os

# Carpeta en la que quieres buscar (usa "." para la carpeta actual)
carpeta = "."

# Recorremos los archivos en la carpeta
for archivo in os.listdir(carpeta):
    if archivo.endswith(".pdf"):  # Verificamos la extensión
        ruta_completa = os.path.join(carpeta, archivo)
        os.remove(ruta_completa)  # Eliminamos el archivo
        print(f"🗑️ Eliminado: {ruta_completa}")

print("✅ Proceso finalizado.")
