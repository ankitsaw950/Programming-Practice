# 32. Create a GUI form using Tkinter that includes two entry fields (username and password) and a login button. When the button is clicked, display a message indicating whether the login was successful (you can use hardcoded credentials for this).


import tkinter as tk
from tkinter import messagebox
# Function to handle the login button click
def check_credentials():
    username = entry_username.get()
    password = entry_password.get()
    # Hardcoded credentials for demonstration
    if username == "admin" and password == "password123":
        messagebox.showinfo("Login Status", "Login successful!")
    else:
        messagebox.showerror("Login Status", "Invalid username or password!")
# Create the main window
root = tk.Tk()
root.title("Login Form")
# Username label and entry field
label_username = tk.Label(root, text="Username:")
label_username.grid(row=0, column=0, padx=10, pady=10)
entry_username = tk.Entry(root)
entry_username.grid(row=0, column=1, padx=10, pady=10)
# Password label and entry field
label_password = tk.Label(root, text="Password:")
label_password.grid(row=1, column=0, padx=10, pady=10)
entry_password = tk.Entry(root, show="*")
entry_password.grid(row=1, column=1, padx=10, pady=10)
# Login button
login_button = tk.Button(root, text="Login", command=check_credentials)
login_button.grid(row=2, column=0, columnspan=2, pady=10)
# Start the main event loop
root.mainloop()
