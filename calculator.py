import tkinter as tk




#Making GUI down here,  just testing fand learning

root = tk.Tk()
root.title("Calculators")

entry = tk.Entry(root)
entry.pack()

#Create buttons for the app
for digit in range(10):
    button = tk.Button(root, text=str(digit), command = lambda d=digit: entry.insert(tk.END, str(d)))
    button.pack(side=tk.LEFT)