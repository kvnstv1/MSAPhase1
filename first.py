import tkinter as tk
from datetime import date

def num():
    try:    
        x = numFrame.get()
        y = float(x)
        result_label.config(text=f"Entered num: {y:.2f}")
        second_label.config(text = "Thanks")

    except ValueError:
            #Handle invalid input
            result_label.config(text="Invalid input. PLease enter a valid number.")
        
        
root = tk.Tk()
root.title("Hello World")
numFrame = tk.Entry(root)
numFrame.pack()

#Create a button to process input
sButton = tk.Button(root, text="Submit", command = num)
sButton.pack()

#Create a label to display the result
result_label = tk.Label(root, text="")
result_label.pack()

#Attempting a second label
second_label = tk.Label(root, text="Trying")
second_label.pack()

root.mainloop()





