#                                  `Python Notes`


### `Introduction`:

->Python is a simple and easy to understand language.

->Python is a high level language.

->Pyhton is free and open source language.

->Python is portable language.

### `Variables` :-

    A variable is a name given to a memory location in a program.

  **`Example`**:
  ```python

        a = 1 , b = 2 , c = 3
        b = "Ankit"
        c = true

  ```

### `Keywords`:-

      These are the reserved words in Python whose meaning is
      already known to its interpreter.

  **Example**:
  ```python
        if , else ,elif, while, for,
  ```

### `Data Types` :-

      They specify the different sizes and values that can be stored in a variable.
    ->Integer
    ->Boolean
    ->String
    ->Float
    ->None

### `Comments` :-

             They are ignored by the Python interpreter and do not
             affect the execution of the program.

->> There are two types of comments in python:-

**1.Single Line Comments**
```python
        # This is a single-line comment
      x = 5  # Assigning a value to x
```

**2.Multi-Line comments**
```python

    '''
    This is a multi-line comment or docstring
    It can span multiple lines and is commonly used to provide
    detailed explanations about code sections or documentation.

    '''
```

### `Operators` :-

    Operators are special symbols or keywords that are used to
    perform operations on variables and values.

### 1. `Arithmetic Operators` :-

        These operators are used to perform mathematical operations.


| Operator | Description         | Example          |
| -------- | ------------------- | ---------------- |
| `+`      | Addition            | `3 + 2` → `5`    |
| `-`      | Subtraction         | `5 - 2` → `3`    |
| `*`      | Multiplication      | `4 * 3` → `12`   |
| `/`      | Division            | `10 / 2` → `5.0` |
| `%`      | Modulus (remainder) | `7 % 3` → `1`    |
| `**`     | Exponentiation      | `2 ** 3` → `8`   |
| `//`     | Floor Division      | `10 // 3` → `3`  |

### 2. `Comparison Operators` :-

           These operators compare two values and return a boolean result (True or False).

| Operator | Description              | Example           |
| -------- | ------------------------ | ----------------- |
| `==`     | Equal to                 | `5 == 5` → `True` |
| `!=`     | Not equal to             | `5 != 2` → `True` |
| `>`      | Greater than             | `5 > 3` → `True`  |
| `<`      | Less than                | `3 < 5` → `True`  |
| `>=`     | Greater than or equal to | `5 >= 5` → `True` |
| `<=`     | Less than or equal to    | `3 <= 5` → `True` |

### 3. `Logical Operators `:-

     These operators are used to combine conditional statements.

| Operator | Description                                       | Example                    |
| -------- | ------------------------------------------------- | -------------------------- |
| `and`    | Returns `True` if both statements are `True`      | `True and False` → `False` |
| `or`     | Returns `True` if one of the statements is `True` | `True or False` → `True`   |
| `not`    | Reverses the boolean value                        | `not True` → `False`       |

### 4. `Assignment Operators` :-

     These operators are used to assign values to variables.

| Operator | Description             | Example                          |
| -------- | ----------------------- | -------------------------------- |
| `=`      | Assign                  | `x = 5`                          |
| `+=`     | Add and assign          | `x += 3` (same as `x = x + 3`)   |
| `-=`     | Subtract and assign     | `x -= 2` (same as `x = x - 2`)   |
| `*=`     | Multiply and assign     | `x *= 4` (same as `x = x * 4`)   |
| `/=`     | Divide and assign       | `x /= 2` (same as `x = x / 2`)   |
| `%=`     | Modulus and assign      | `x %= 3` (same as `x = x % 3`)   |
| `**=`    | Exponent and assign     | `x **= 2` (same as `x = x ** 2`) |
| `//=`    | Floor divide and assign | `x //= 2` (same as `x = x // 2`) |

### 5.` Bitwise Operators`

    These operators are used to perform bit-level operations on binary numbers.

| Operator | Description         | Example         |
| -------- | ------------------- | --------------- | --- | ------ |
| `&`      | Bitwise AND         | `5 & 3` → `1`   |
| `        | `                   | Bitwise OR      | `5  | 3`→`7` |
| `^`      | Bitwise XOR         | `5 ^ 3` → `6`   |
| `~`      | Bitwise NOT         | `~5` → `-6`     |
| `<<`     | Bitwise left shift  | `5 << 1` → `10` |
| `>>`     | Bitwise right shift | `5 >> 1` → `2`  |

### 6. `Identity Operators`:-

       These operators are used to compare the memory location of two objects.

| Operator | Description                                              | Example                                                      |
| -------- | -------------------------------------------------------- | ------------------------------------------------------------ |
| `is`     | Returns `True` if both variables are the same object     | `x is y` → `True` if `x` and `y` are the same object         |
| `is not` | Returns `True` if both variables are not the same object | `x is not y` → `True` if `x` and `y` are not the same object |

### 7. `Membership Operators`

      These operators are used to test if a sequence is present in an object.

| Operator | Description                                                                        | Example                       |
| -------- | ---------------------------------------------------------------------------------- | ----------------------------- |
| `in`     | Returns `True` if a sequence with the specified value is present in the object     | `'a' in 'apple'` → `True`     |
| `not in` | Returns `True` if a sequence with the specified value is not present in the object | `'x' not in 'apple'` → `True` |

### `First Python Program`
```python
      print("Hello Ankit")  # output : Hello Ankit
      print("Hello India")  # output : Hello India
```

## `Take Input In Python`

     We use an inbuilt function to take input.
  ```python
     input()
 ```

  **Example**:
```python
      n=input("Enter your name")
      print(n)
```

      In this example , suppose you entered "Ankit"
      then you will get the output => Ankit

### `` Note`` :

    ->By default all the input are taken in string .

    ->To take input of different data types, we need to explicitly convert it.


  - **Example for Integer Input**:
```python
      age = int(input("Enter your age: "))
      print(age)
```

  - **Example for Float Input**:
  ```python
        height = float(input("Enter your height: "))
        print(height)
  ```

   - **Example for Boolean Input**:
  ```python
        is_student = bool(int(input("Are you a student? (1 for True, 0 for False): ")))
        print(is_student)
  ```

### ` Strings`

     A string is a sequence of characters enclosed in quotes.

     Example :
      name = "Ankit"
      print(name)

### `Properties of Strings`

1. **Immutability**:

   - **Definition**: Strings in Python are immutable, meaning once a string is created, it cannot be changed.
   - **Example**:
     ```python
     s = "Hello"
     s[0] = "h"  # This will raise an error
     ```

2. **Concatenation**:

   - **Definition**: You can concatenate strings using the `+` operator.
   - **Example**:
     ```python
     s1 = "Hello"
     s2 = " World"
     s3 = s1 + s2  # s3 is "Hello World"
     ```

3. **Repetition**:

   - **Definition**: You can repeat strings using the `*` operator.
   - **Example**:
     ```python
     s = "Hello"
     s_repeated = s * 3  # s_repeated is "HelloHelloHello"
     ```

4. **Indexing**:

   - **Definition**: Strings can be indexed, where indexing starts from `0`.
   - **Example**:
     ```python
     s = "Hello"
     print(s[0])  # Output: 'H'
     ```

5. **Slicing**:

   - **Definition**: You can extract parts of a string using slicing.
   - **Example**:
     ```python
     s = "Hello"
     print(s[1:4])  # Output: 'ell'
     ```

6. **Length**:
   - **Definition**: The length of a string can be found using the `len()` function.
   - **Example**:
     ```python
     s = "Hello"
     print(len(s))  # Output: 5
     ```

### `Common String Methods`

1. **`upper()`**:

   - **Definition**: Converts all characters in the string to uppercase.
   - **Example**:
     ```python
     s = "Hello"
     print(s.upper())  # Output: 'HELLO'
     ```

2. **`lower()`**:

   - **Definition**: Converts all characters in the string to lowercase.
   - **Example**:
     ```python
     s = "Hello"
     print(s.lower())  # Output: 'hello'
     ```

3. **`strip()`**:

   - **Definition**: Removes any leading and trailing whitespace characters.
   - **Example**:
     ```python
     s = "  Hello  "
     print(s.strip())  # Output: 'Hello'
     ```

4. **`replace()`**:

   - **Definition**: Replaces a specified phrase with another specified phrase.
   - **Example**:
     ```python
     s = "Hello World"
     print(s.replace("World", "Python"))  # Output: 'Hello Python'
     ```

5. **`split()`**:

   - **Definition**: Splits the string into a list where each word is a list item.
   - **Example**:
     ```python
     s = "Hello World"
     print(s.split())  # Output: ['Hello', 'World']
     ```

6. **`join()`**:

   - **Definition**: Joins elements of an iterable (e.g., list) into a single string.
   - **Example**:
     ```python
     words = ["Hello", "World"]
     print(" ".join(words))  # Output: 'Hello World'
     ```

7. **`find()`**:

   - **Definition**: Finds the first occurrence of a specified value and returns its index.
   - **Example**:
     ```python
     s = "Hello World"
     print(s.find("World"))  # Output: 6
     ```

8. **`format()`**:

   - **Definition**: Formats specified values and inserts them inside the string's placeholders.
   - **Example**:
     ```python
     s = "Hello {}"
     print(s.format("World"))  # Output: 'Hello World'
     ```

9. **`isdigit()`**:

   - **Definition**: Returns `True` if all characters in the string are digits.
   - **Example**:
     ```python
     s = "123"
     print(s.isdigit())  # Output: True
     ```

10. **`isalpha()`**:

    - **Definition**: Returns `True` if all characters in the string are alphabetic.
    - **Example**:
      ```python
      s = "Hello"
      print(s.isalpha())  # Output: True
      ```

11. **`startswith()`**:

    - **Definition**: Returns `True` if the string starts with the specified value.
    - **Example**:
      ```python
      s = "Hello World"
      print(s.startswith("Hello"))  # Output: True
      ```

12. **`endswith()`**:
    - **Definition**: Returns `True` if the string ends with the specified value.
    - **Example**:
      ```python
      s = "Hello World"
      print(s.endswith("World"))  # Output: True
      ```

## ` Conditional Statements`

- **Definition**: Conditional statements are used to perform different actions based on different conditions.
- **Types**:

  1. **`if` Statement**:
     ```python
     if condition:
         # code to execute
     ```
  2. **`elif` Statement**:
     ```python
     if condition1:
         # code to execute
     elif condition2:
         # code to execute
     ```
  3. **`else` Statement**:
     ```python
     if condition1:
         # code to execute
     else:
         # code to execute
     ```

  ## Examples :

  Example 1: `if` Statement
  ```python
      x = 10
      if x > 5:
         print("x is greater than 5")

      Output: x is greater than 5
    
  ```
   Example 2: `if-else` Statement
  ```python
     x = 3
    if x > 5:
       print("x is greater than 5")
    else:
       print("x is 5 or less")

      Output: x is 5 or less
    
  ```
   Example 3: `if-elif-else` Statement
  ```python
      x = 5
      if x > 5:
        print("x is greater than 5")
      elif x==5:
        print("x is equal to 5")
      else :
        print("x is less than 5")

      Output: x is equal to 5
    
  ```
