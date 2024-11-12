# 33. Implement a simple calculator GUI with Tkinter that has buttons for the numbers 0-9,  addition, subtraction, multiplication, and division. Include a text entry to display the input and results. Ensure that clicking a button updates the display accordingly. 


import tkinter as tk

# Function to update the entry field when a button is clicked
def button_click(value):
    entry_field.insert(tk.END, value)

# Function to clear the entry field
def clear_entry():
    entry_field.delete(0, tk.END)

# Function to evaluate the expression in the entry field
def calculate():
    try:
        result = eval(entry_field.get())
        entry_field.delete(0, tk.END)
        entry_field.insert(tk.END, str(result))
    except Exception as e:
        entry_field.delete(0, tk.END)
        entry_field.insert(tk.END, "Error")

# Create the main window
root = tk.Tk()
root.title("Simple Calculator")

# Create an entry widget for displaying input and results
entry_field = tk.Entry(root, width=20, font=('Arial', 18), borderwidth=2, relief="solid")
entry_field.grid(row=0, column=0, columnspan=4, padx=10, pady=10)

# Button labels
buttons = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', 'C', '=', '+'
]

# Create buttons and arrange them in the grid
for i, button in enumerate(buttons):
    if button == "=":
        tk.Button(root, text=button, width=5, height=2, command=calculate).grid(row=i//4 + 1, column=i % 4)
    elif button == "C":
        tk.Button(root, text=button, width=5, height=2, command=clear_entry).grid(row=i//4 + 1, column=i % 4)
    else:
        tk.Button(root, text=button, width=5, height=2, command=lambda b=button: button_click(b)).grid(row=i//4 + 1, column=i % 4)

# Start the main event loop
root.mainloop()
