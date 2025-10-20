import os

# 1. Verificar si existe una carpeta
if os.path.exists("proyectos"):
    print("✅ La carpeta 'proyectos' existe.")
else:
    print("❌ La carpeta 'proyectos' no existe.")

# 2. Verificar si es un archivo o una carpeta
ruta = "proyectos"

if os.path.isfile(ruta):
    print(f"'{ruta}' es un archivo.")
elif os.path.isdir(ruta):
    print(f"'{ruta}' es una carpeta.")
else:
    print(f"'{ruta}' no existe.")

# 3. Crear carpeta solo si no existe
if not os.path.exists("nueva_carpeta"):
    os.mkdir("nueva_carpeta")
    print("📂 Carpeta creada.")
else:
    print("⚠️ La carpeta ya existía.")

# 4. Listar archivos solo si hay contenido
archivos = os.listdir(".")
if archivos:
    print("Contenido del directorio actual:", archivos)
else:
    print("El directorio está vacío.")
