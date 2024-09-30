# import os

import sys

# Create a new directory
# os.mkdir('test_directory')

# # Change working directory
# os.chdir('test_directory')

# # Create a new file
# with open('example.txt', 'w') as file:
#     file.write('Hello, world!')

# # List files in the current directory
# print(os.listdir())

# # Get the current working directory
# print(os.getcwd())

# # Remove the file and directory
# os.remove('example.txt')
# os.chdir('..')
# os.rmdir('test_directory')

# pid = os.getpid()
# ppid = os.getppid()

print(sys.getrecursionlimit())

sys.setrecursionlimit(1500)
print(sys.getrecursionlimit())

