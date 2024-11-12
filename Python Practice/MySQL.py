# 35. Write a Python function that establishes a connection to a MySQL database using the  mysql-connector library. Include error handling to manage connection failures.


import mysql.connector
from mysql.connector import Error

def connect_to_database(host, user, password, database):
    connection = None  # Initialize the connection variable outside the try block
    try:
        # Establishing the connection
        connection = mysql.connector.connect(
            host=host,
            user=user,
            password=password,
            database=database
        )
        
        # Check if the connection was successful
        if connection.is_connected():
            print("Connection to the database is successful")
            return connection
        else:
            print("Failed to connect to the database")
            return None
    
    except Error as e:
        print(f"Error: {e}")
        return None

    finally:
        # Optionally, close the connection in case of success or failure
        if connection and connection.is_connected():
            connection.close()
            print("Connection closed")

# Example usage
if __name__ == "__main__":
    # Replace with your actual database credentials
    host = 'localhost'
    user = 'root'
    password = 'your_password'  # Replace with your password
    database = 'your_database'  # Replace with your database name

    db_connection = connect_to_database(host, user, password, database)
