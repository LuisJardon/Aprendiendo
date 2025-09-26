import tkinter as tk


ventana = tk.Tk()



ventana.title("Mi primera ventana")
ventana.geometry("400x300")

entrada = tk.Entry(ventana, width=40)
entrada.pack(pady=10)


resultado =tk.Label(ventana, text="")
resultado.pack(pady=20)

def mostrar_texto():
    texto_recibido = entrada.get()
    resultado.config(text=f"Has escrito: {texto_recibido}")
    
boton = tk.Button(ventana, text="pincha aqui",command=mostrar_texto)
boton.pack(pady=55)


ventana.mainloop() 