# 34. Create a basic To-Do list application using Tkinter. Include the following features: 
# An entry widget to add new tasks. 
# A button to add the task to a listbox. 
# A button to remove the selected task from the listbox. 
# Make sure to handle the addition and removal of tasks correctly. 
           

import tkinter as tk
from tkinter import messagebox

# Function to add a task to the listbox
def add_task():
    task = task_entry.get()
    if task != "":
        task_listbox.insert(tk.END, task)
        task_entry.delete(0, tk.END)
    else:
        messagebox.showwarning("Warning", "Task cannot be empty!")

# Function to remove the selected task from the listbox
def remove_task():
    try:
        selected_task_index = task_listbox.curselection()[0]
        task_listbox.delete(selected_task_index)
    except IndexError:
        messagebox.showwarning("Warning", "Please select a task to remove!")

# Create the main window
root = tk.Tk()
root.title("To-Do List Application")

# Entry widget for adding new tasks
task_entry = tk.Entry(root, width=35, font=('Arial', 14))
task_entry.grid(row=0, column=0, padx=10, pady=10, columnspan=2)

# Button to add tasks
add_button = tk.Button(root, text="Add Task", command=add_task, width=15)
add_button.grid(row=0, column=2, padx=5, pady=10)

# Listbox to display tasks
task_listbox = tk.Listbox(root, width=50, height=15, font=('Arial', 12))
task_listbox.grid(row=1, column=0, padx=10, pady=10, columnspan=3)

# Button to remove selected task
remove_button = tk.Button(root, text="Remove Selected Task", command=remove_task, width=20)
remove_button.grid(row=2, column=0, padx=10, pady=10, columnspan=3)

# Start the main event loop
root.mainloop()
