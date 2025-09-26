
import tkinter as tk


ventana = tk.Tk()


ventana.title("ventan con boton")

ventana.geometry("400x300")

etiqueta1 = tk.Label(ventana, text="Este texto saldrá en la ventana",font=("Arial", 30,"bold"))
etiqueta1.pack(pady=10)

def accion():
   etiqueta1.config(ventana, text="Has pulsado el boton, ahora todo tu dinero es mio macaquiño")

boton1 = tk.Button(text="Recibiras dinero clickando aqui")
boton1.pack(pady=55)


etiqueta2 = tk.Label(ventana, text="Esto es el texto 2",font=("Arial", 10), bg="lightcoral")
etiqueta2.pack(pady=90)




ventana.mainloop() 
