# `Python Notes`

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

| Operator | Description                  | Example             |
|----------|------------------------------|---------------------|
| `&`      | Bitwise AND                  | `5 & 3` → `1`       |
| `|`      | Bitwise OR                   | `5 | 3` → `7`       |
| `^`      | Bitwise XOR                  | `5 ^ 3` → `6`       |
| `~`      | Bitwise NOT                  | `~5` → `-6`         |
| `<<`     | Bitwise left shift           | `5 << 1` → `10`     |
| `>>`     | Bitwise right shift          | `5 >> 1` → `2`      |

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

### ` Note` :

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

## `Loops`

They are used to execute the block of code multiple times.
Python supports two main types of loops: for loops and while loops.

### `While Loop`

  The while loop repeatedly executes a block of code as long as a specified condition is True.

#### `Note` :

    Iss loop ka use tabb karte hai jab hume pata na ho ki ye loop
    kitne baar chalega.

    Ye loop tab tak chalega jab tak ki koi given condition true hoga.

```python
  Syntax :

      while condition:
        # Code to execute
```

`Example` : Print numbers from 1 to 5:

```python

count = 1
while count<=5:
count = count + 1

```

### `For Loop`

The for loop in Python is used to iterate over a sequence (such as a list, tuple, dictionary, set, or string).

```python
  for variable in sequence:
  # Code block to be executed
```

` Example` 1: Iterating Over a List

```python
    fruits = ["apple", "banana", "cherry"]
    for fruit in fruits:
    print(fruit)

    #output :
    apple
    banana
    cherry
```

`Example` 2: Iterating Over a String

```python
   for letter in "Python":
   print(letter)

   #output :
   P
   y
   t
   h
   o
   n

```

`Example` 3: Using `range()` Function

  The range() function is often used with for loops to generate a sequence of numbers.

```python
    for i in range(5):
    print(i)

    #output :
    0
    1
    2
    3
    4
```

`Example` 4: Using `else` with for Loop

  You can use an else block with a for loop. The code inside the else block will be executed after the loop finishes its iteration, but only if the loop was not terminated by a break statement.

```python
  for i in range(3):
  print(i)
  else:
  print("Loop completed")

  #output :
  0
  1
  2
  Loop completed

```

#### `break`

  The break statement is used to exit the loop prematurely, regardless of the loop's iteration conditions.

`Example`: Using `break` in a Loop

```python
    for i in range(5):
    if i == 3:
        break
    print(i)

    #output :
    0
    1
    2
```

#### `continue`

  The continue statement is used to skip the current iteration of the loop and move to the next iteration.

`Example`: Using continue in a Loop

```python
    for i in range(5):
    if i == 2:
        continue
    print(i)

    #output :
    0
    1
    3
    4
```

##### `NOTE`

    `break` and `continue` statements  are useful for controlling loop   behavior based on specific conditions.

#### `pass` statement

   pass is a null statement that does nothing. It is used as a placeholder for future code.

```python
    Syntax :

    for el in range(10):
      pass
```



# `Lists in Python`


A **list** in Python is a collection data type that is ordered and mutable. Lists are one of the most commonly used data types in Python due to their versatility and the wide range of operations that can be performed on them.

## Creating Lists
Lists are created by placing the items (elements) inside square brackets `[]`, separated by commas.

### Example:
```python
my_list = [1, 2, 3]
```

## Accessing List Elements
You can access the elements of a list by using indexing, where the first element has an index of `0`.

### Example:
```python
my_list = ['apple', 'banana', 'cherry']
print(my_list[0])  # Output: apple
```

## Modifying Lists
Lists are **mutable**, meaning that you can change, add, or remove elements after the list has been created.

### Example:
```python
my_list = [1, 2, 3]
my_list[0] = 10
print(my_list)  # Output: [10, 2, 3]
```

## List Operations

### 1. **Concatenation**:
Lists can be concatenated using the `+` operator.
```python
list1 = [1, 2, 3]
list2 = [4, 5, 6]
result = list1 + list2  # Output: [1, 2, 3, 4, 5, 6]
```

### 2. **Repetition**:
You can repeat a list a certain number of times using the `*` operator.
```python
my_list = ['a', 'b'] * 3  # Output: ['a', 'b', 'a', 'b', 'a', 'b']
```

### 3. **Slicing**:
You can access a range of elements in a list by using slicing.
```python
my_list = [0, 1, 2, 3, 4]
sliced = my_list[1:4]  # Output: [1, 2, 3]
```

### 4. **Appending Elements**:
You can add elements to the end of a list using the `append()` method.
```python
my_list = [1, 2, 3]
my_list.append(4)
print(my_list)  # Output: [1, 2, 3, 4]
```

### 5. **Inserting Elements**:
You can insert elements at a specific position using the `insert()` method.
```python
my_list = [1, 2, 3]
my_list.insert(1, 10)
print(my_list)  # Output: [1, 10, 2, 3]
```

### 6. **Removing Elements**:
You can remove elements from a list using the `remove()` method or the `pop()` method.
```python
my_list = [1, 2, 3, 2]
my_list.remove(2)  # Removes the first occurrence of 2
print(my_list)  # Output: [1, 3, 2]

popped_element = my_list.pop(1)  # Removes and returns the element at index 1
print(popped_element)  # Output: 3
```

## List Methods
Lists come with a variety of built-in methods that allow you to perform common operations.

### 1. **sort()**:
Sorts the elements of the list in ascending or descending order.
```python
my_list = [3, 1, 2]
my_list.sort()
print(my_list)  # Output: [1, 2, 3]
```

### 2. **reverse()**:
Reverses the order of elements in the list.
```python
my_list = [1, 2, 3]
my_list.reverse()
print(my_list)  # Output: [3, 2, 1]
```

### 3. **count()**:
Returns the number of times a specified value occurs in the list.
```python
my_list = [1, 2, 2, 3]
print(my_list.count(2))  # Output: 2
```

### 4. **index()**:
Returns the index of the first occurrence of the specified value.
```python
my_list = [1, 2, 3]
print(my_list.index(2))  # Output: 1
```

### 5. **extend()**:
Adds the elements of an iterable (e.g., list, tuple) to the end of the list.
```python
my_list = [1, 2, 3]
my_list.extend([4, 5])
print(my_list)  # Output: [1, 2, 3, 4, 5]
```

## When to Use Lists
- Use lists when you need a collection of items that can be modified.
- Lists are great for storing items in a specific order and for performing various operations on the data.

## Conclusion
Lists are a powerful and flexible data type in Python, allowing for the storage and manipulation of ordered collections of items. They are widely used in Python programming due to their ease of use and the variety of operations they support.




# `Tuples in Python`

## Introduction
A **tuple** in Python is a collection data type that is ordered and immutable. Tuples are similar to lists, but unlike lists, tuples cannot be changed after they are created. Tuples are often used to store related pieces of data.

## Creating Tuples
Tuples are created by placing the items (elements) inside parentheses `()` separated by commas.

### Example:
```python
my_tuple = (1, 2, 3)
```

## Accessing Tuple Elements
You can access the elements of a tuple by using indexing, where the first element has an index of `0`.

### Example:
```python
my_tuple = ('apple', 'banana', 'cherry')
print(my_tuple[0])  # Output: apple
```

## Tuple Immutability
Tuples are **immutable**, meaning that once a tuple is created, you cannot change, add, or remove elements.

### Example:
```python
my_tuple = (1, 2, 3)
# The following will raise an error
my_tuple[0] = 10
```

## Tuple Operations

### 1. **Concatenation**:
Tuples can be concatenated using the `+` operator.
```python
tuple1 = (1, 2, 3)
tuple2 = (4, 5, 6)
result = tuple1 + tuple2  # Output: (1, 2, 3, 4, 5, 6)
```

### 2. **Repetition**:
You can repeat a tuple a certain number of times using the `*` operator.
```python
my_tuple = ('a', 'b') * 3  # Output: ('a', 'b', 'a', 'b', 'a', 'b')
```

### 3. **Slicing**:
You can access a range of elements in a tuple by using slicing.
```python
my_tuple = (0, 1, 2, 3, 4)
sliced = my_tuple[1:4]  # Output: (1, 2, 3)
```

## Tuple Methods
Since tuples are immutable, they have a limited number of methods compared to lists.

### 1. `count()`:
Returns the number of times a specified value occurs in a tuple.
```python
my_tuple = (1, 2, 2, 3)
print(my_tuple.count(2))  # Output: 2
```

### 2. `index()`:
Searches the tuple for a specified value and returns the position of where it was found.
```python
my_tuple = (1, 2, 3)
print(my_tuple.index(2))  # Output: 1
```

## Packing and Unpacking
### **Tuple Packing**:
You can pack values into a tuple.
```python
my_tuple = 1, 2, 'apple'
```

### **Tuple Unpacking**:
You can unpack a tuple into individual variables.
```python
a, b, c = my_tuple
print(a)  # Output: 1
print(b)  # Output: 2
print(c)  # Output: apple
```

## When to Use Tuples
- Use tuples when you have a collection of items that should not be changed.
- Tuples can be used as keys in dictionaries, whereas lists cannot.

## Conclusion
Tuples are a versatile and immutable data type in Python that allows for the storage of ordered items. They are particularly useful when you want to ensure the data cannot be modified.


# `Dictionaries in Python`

A **dictionary** in Python is a collection data type that is unordered, mutable, and indexed. Dictionaries are used to store data values in key-value pairs, where each key is unique.

## Creating Dictionaries
Dictionaries are created by placing the items inside curly braces `{}`, separated by commas, with each item being a key-value pair.

### Example:
```python
my_dict = {"name": "Alice", "age": 25, "city": "New York"}
```

## Accessing Dictionary Elements
You can access the values in a dictionary by using their keys.

### Example:
```python
my_dict = {"name": "Alice", "age": 25, "city": "New York"}
print(my_dict["name"])  # Output: Alice
```

## Modifying Dictionaries
Dictionaries are **mutable**, meaning that you can change, add, or remove elements after the dictionary has been created.

### Example: Changing Values
```python
my_dict = {"name": "Alice", "age": 25, "city": "New York"}
my_dict["age"] = 30
print(my_dict)  # Output: {'name': 'Alice', 'age': 30, 'city': 'New York'}
```

### Example: Adding New Key-Value Pairs
```python
my_dict = {"name": "Alice", "age": 25}
my_dict["city"] = "New York"
print(my_dict)  # Output: {'name': 'Alice', 'age': 25, 'city': 'New York'}
```

### Example: Removing Key-Value Pairs
```python
my_dict = {"name": "Alice", "age": 25, "city": "New York"}
my_dict.pop("age")
print(my_dict)  # Output: {'name': 'Alice', 'city': 'New York'}
```

## Dictionary Operations

### 1. **Checking if Key Exists**:
You can check if a key exists in a dictionary using the `in` keyword.
```python
my_dict = {"name": "Alice", "age": 25}
print("name" in my_dict)  # Output: True
print("address" in my_dict)  # Output: False
```

### 2. **Iterating Over a Dictionary**:
You can iterate over a dictionary using a `for` loop.
```python
my_dict = {"name": "Alice", "age": 25}
for key in my_dict:
    print(key, my_dict[key])
# Output:
# name Alice
# age 25
```

### 3. **Getting All Keys**:
You can get a list of all the keys in a dictionary using the `keys()` method.
```python
my_dict = {"name": "Alice", "age": 25}
keys = my_dict.keys()
print(keys)  # Output: dict_keys(['name', 'age'])
```

### 4. **Getting All Values**:
You can get a list of all the values in a dictionary using the `values()` method.
```python
my_dict = {"name": "Alice", "age": 25}
values = my_dict.values()
print(values)  # Output: dict_values(['Alice', 25])
```

### 5. **Getting All Key-Value Pairs**:
You can get a list of all the key-value pairs in a dictionary using the `items()` method.
```python
my_dict = {"name": "Alice", "age": 25}
items = my_dict.items()
print(items)  # Output: dict_items([('name', 'Alice'), ('age', 25)])
```

## Dictionary Methods
Dictionaries come with a variety of built-in methods that allow you to perform common operations.

### 1. **get()**:
Returns the value for the specified key if the key exists in the dictionary.
```python
my_dict = {"name": "Alice", "age": 25}
print(my_dict.get("name"))  # Output: Alice
print(my_dict.get("address", "Not Found"))  # Output: Not Found
```

### 2. **update()**:
Updates the dictionary with the elements from another dictionary or from an iterable of key-value pairs.
```python
my_dict = {"name": "Alice", "age": 25}
my_dict.update({"age": 30, "city": "New York"})
print(my_dict)  # Output: {'name': 'Alice', 'age': 30, 'city': 'New York'}
```

### 3. **clear()**:
Removes all elements from the dictionary.
```python
my_dict = {"name": "Alice", "age": 25}
my_dict.clear()
print(my_dict)  # Output: {}
```

### 4. **copy()**:
Returns a shallow copy of the dictionary.
```python
my_dict = {"name": "Alice", "age": 25}
new_dict = my_dict.copy()
print(new_dict)  # Output: {'name': 'Alice', 'age': 25}
```

## When to Use Dictionaries
- Use dictionaries when you need a collection of items that are paired (key-value pairs) and where the keys are unique.
- Dictionaries are ideal for scenarios where you need fast lookups based on a custom key.

## Conclusion
Dictionaries are a powerful and flexible data type in Python, allowing for the storage and manipulation of key-value pairs. They are widely used for tasks that require efficient data retrieval based on keys.



# `Python Sets`

A set is a collection data type in Python that is unordered, mutable, and does not allow duplicate elements. Sets are commonly used for membership testing, removing duplicates from a sequence, and performing mathematical operations like union, intersection, difference, and symmetric difference.

## Key Features
1. **Unordered**: The elements in a set are not stored in any particular order. This means that you cannot access elements using an index or a key.

2. **Mutable**: You can add or remove items from a set, but the elements themselves must be immutable (e.g., numbers, strings, tuples).

3. **No Duplicates**: A set automatically removes duplicate values. If you add an element that already exists in the set, it will not raise an error but simply ignore the addition.

## Creating a Set
You can create a set by placing all the elements inside curly braces `{}`, separated by commas, or by using the `set()` function.

```python
# Example of creating a set
my_set = {1, 2, 3, 4, 5}
print(my_set)

# Using the set() function
my_set = set([1, 2, 3, 4, 5])
print(my_set)
```

## Basic Operations

### Adding Elements
You can add a single element to a set using the `add()` method, or multiple elements using the `update()` method.

```python
my_set.add(6)
my_set.update([7, 8])
```

### Removing Elements
You can remove elements using the `remove()` method (raises an error if the element does not exist) or the `discard()` method (does not raise an error).

```python
my_set.remove(6)
my_set.discard(7)
```

### Set Operations
Python provides built-in methods for performing set operations like union, intersection, difference, and symmetric difference.

```python
set_a = {1, 2, 3, 4}
set_b = {3, 4, 5, 6}

# Union
print(set_a | set_b)  # Output: {1, 2, 3, 4, 5, 6}

# Intersection
print(set_a & set_b)  # Output: {3, 4}

# Difference
print(set_a - set_b)  # Output: {1, 2}

# Symmetric Difference
print(set_a ^ set_b)  # Output: {1, 2, 5, 6}
```


# `Functions` 

## Introduction
Functions are blocks of reusable code that perform a specific task. They help in breaking down complex problems into smaller, manageable parts, making the code more modular, readable, and maintainable.

Recursion is a technique where a function calls itself in order to solve a problem. It breaks down a problem into smaller sub-problems, each of which is a smaller instance of the same problem.

## Functions in Python

### Defining a Function
A function is defined using the `def` keyword, followed by the function name, parentheses `()`, and a colon `:`. The code block inside the function is indented.

```python
def greet(name):
    return f"Hello, {name}!"
```

### Calling a Function
Once a function is defined, you can call it by using its name followed by parentheses `()`.

```python
message = greet("Alice")
print(message)  # Output: Hello, Alice!
```

### Function Arguments
Functions can accept arguments (parameters) to pass data to the function.

```python
def add(a, b):
    return a + b

result = add(3, 4)
print(result)  # Output: 7
```

### Default Arguments
You can provide default values to function arguments. If the argument is not passed, the default value is used.

```python
def greet(name="Guest"):
    return f"Hello, {name}!"

print(greet())        # Output: Hello, Guest!
print(greet("Bob"))   # Output: Hello, Bob!
```

### Return Values
A function can return a value using the `return` keyword.

```python
def multiply(a, b):
    return a * b

result = multiply(5, 6)
print(result)  # Output: 30
```

# `Recursion in Python`

### What is Recursion?
Recursion is a process in which a function calls itself as a subroutine. This allows the function to be repeated several times as it can call itself during its execution.

### Example: Factorial of a Number
The factorial of a number `n` is the product of all positive integers less than or equal to `n`. It can be calculated using recursion.

```python
def factorial(n):
    if n == 1:  # Base case
        return 1
    else:
        return n * factorial(n - 1)  # Recursive call

result = factorial(5)
print(result)  # Output: 120
```

### Example: Fibonacci Sequence
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

```python
def fibonacci(n):
    if n == 0:  # Base case
        return 0
    elif n == 1:  # Base case
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)  # Recursive call

for i in range(6):
    print(fibonacci(i), end=" ")  # Output: 0 1 1 2 3 5
```

### Advantages of Recursion
- Simplifies the code for problems that can be broken down into similar sub-problems.
- Often results in more elegant and readable code.

### Disadvantages of Recursion
- Can lead to performance issues due to excessive memory usage (stack overflow) if the recursion depth is too large.
- Can be harder to debug and understand compared to iterative solutions.

## Conclusion
Functions are essential building blocks in Python that help make code modular and reusable. 
Recursion is a powerful tool for solving problems that can be broken down into smaller sub-problems. 
Understanding when and how to use recursion is crucial for writing efficient and effective code.




# `Python File Handling` 

This guide covers three fundamental topics in Python: file handling, exception handling, and Object-Oriented Programming (OOP) concepts. These topics are crucial for managing data, handling errors gracefully, and designing robust, scalable software.

## File Handling in Python

### Opening and Closing Files
Python provides built-in functions to work with files. The `open()` function is used to open a file, and the `close()` function is used to close it.

```python
# Open a file
file = open('example.txt', 'r')  # 'r' for reading, 'w' for writing, 'a' for appending

# Perform file operations
content = file.read()
print(content)

# Close the file
file.close()
```

### Reading Files
You can read the entire content, line by line, or a specific number of characters from a file.

```python
# Read entire file
file = open('example.txt', 'r')
content = file.read()
print(content)
file.close()

# Read line by line
file = open('example.txt', 'r')
for line in file:
    print(line.strip())
file.close()
```

### Writing to Files
You can write text to a file using the `write()` method. Opening a file in write mode (`'w'`) will overwrite the existing content, while append mode (`'a'`) will add content to the end.

```python
file = open('example.txt', 'w')
file.write("Hello, World!")
file.close()
```

### Using `with` Statement
The `with` statement is used for file handling to ensure that the file is properly closed after its suite finishes.

```python
with open('example.txt', 'r') as file:
    content = file.read()
    print(content)
```

# `Exception Handling in Python`


Exception handling allows you to handle runtime errors in your program. Python provides the `try`, `except`, `else`, and `finally` blocks to catch and handle exceptions.

### Basic Exception Handling
```python
try:
    x = 10 / 0
except ZeroDivisionError as e:
    print(f"Error: {e}")
```

### Handling Multiple Exceptions
You can handle multiple exceptions by specifying them in a tuple or using multiple `except` blocks.

```python
try:
    x = int("Hello")
except (ValueError, TypeError) as e:
    print(f"Error: {e}")
```

### Using `else` and `finally` Blocks
- `else`: Executes if no exceptions occur.
- `finally`: Always executes, whether an exception occurs or not.

```python
try:
    x = 5 / 1
except ZeroDivisionError:
    print("Division by zero!")
else:
    print("No exceptions occurred!")
finally:
    print("This will always execute.")
```

# `Object-Oriented Programming (OOP) in Python`

Object-Oriented Programming (OOP) is a paradigm that uses objects and classes to design and build applications. Key concepts include classes, objects, inheritance, polymorphism, encapsulation, and abstraction.

### Classes and Objects
- **Class**: A blueprint for creating objects (instances).
- **Object**: An instance of a class.

```python
class Dog:
    def __init__(self, name, breed):
        self.name = name
        self.breed = breed

    def bark(self):
        return f"{self.name} says woof!"

# Creating an object
my_dog = Dog("Buddy", "Golden Retriever")
print(my_dog.bark())  # Output: Buddy says woof!
```

### Inheritance
Inheritance allows a class (child class) to inherit attributes and methods from another class (parent class).

```python
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return f"{self.name} makes a sound"

class Dog(Animal):
    def speak(self):
        return f"{self.name} says woof!"

my_dog = Dog("Buddy")
print(my_dog.speak())  # Output: Buddy says woof!
```

### Polymorphism
Polymorphism allows different classes to be treated as instances of the same class through a common interface.

```python
class Cat(Animal):
    def speak(self):
        return f"{self.name} says meow!"

animals = [Dog("Buddy"), Cat("Whiskers")]

for animal in animals:
    print(animal.speak())
```

### Encapsulation
Encapsulation restricts access to certain methods and variables, which is achieved by defining private methods or variables using an underscore `_`.

```python
class Car:
    def __init__(self, make, model):
        self._make = make  # Protected attribute
        self.__model = model  # Private attribute

    def get_model(self):
        return self.__model

my_car = Car("Toyota", "Corolla")
print(my_car.get_model())  # Output: Corolla
```

### Abstraction
Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object.

```python
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

my_rectangle = Rectangle(3, 4)
print(my_rectangle.area())  # Output: 12
```

## Conclusion
Understanding file handling, exception handling, and OOP concepts is crucial for writing efficient and reliable Python code. File handling allows you to manage data, exception handling helps in managing errors gracefully, and OOP concepts provide a structured approach to designing complex software.

# `Python Practice Programming Questions`

### `Basics`

1. Write a Python program to print "Hello, World!".
2. Write a Python program to add two numbers.
3. Write a Python program to find the square root of a number.
4. Write a Python program to calculate the area of a circle.
5. Write a Python program to swap two variables.
6. Write a Python program to generate a random number.
7. Write a Python program to check if a number is positive, negative, or zero.
8. Write a Python program to check if a number is odd or even.
9. Write a Python program to find the largest among three numbers.
10. Write a Python program to check if a year is a leap year.

### `Control Flow`

11. Write a Python program to print all natural numbers up to `n` (user input).
12. Write a Python program to find the factorial of a number using a loop.
13. Write a Python program to print the Fibonacci sequence up to `n` terms.
14. Write a Python program to check if a number is prime.
15. Write a Python program to print the first `n` prime numbers.
16. Write a Python program to calculate the sum of all numbers in a given range.
17. Write a Python program to find the sum of digits of a number.
18. Write a Python program to reverse a number.
19. Write a Python program to check if a number is a palindrome.
20. Write a Python program to find the greatest common divisor (GCD) of two numbers.

### `Strings`

21. Write a Python program to reverse a string.
22. Write a Python program to check if a string is a palindrome.
23. Write a Python program to find the length of a string.
24. Write a Python program to count the number of vowels in a string.
25. Write a Python program to remove all whitespace from a string.
26. Write a Python program to check if a string contains only digits.
27. Write a Python program to count the frequency of each character in a string.
28. Write a Python program to convert a string to uppercase.
29. Write a Python program to find the first non-repeating character in a string.
30. Write a Python program to remove duplicate characters from a string.

### `Lists`

31. Write a Python program to find the sum of all elements in a list.
32. Write a Python program to find the largest and smallest elements in a list.
33. Write a Python program to remove duplicates from a list.
34. Write a Python program to find the second largest number in a list.
35. Write a Python program to check if a list is empty.
36. Write a Python program to merge two lists and sort them.
37. Write a Python program to find the common elements in two lists.
38. Write a Python program to find all even numbers in a list.
39. Write a Python program to remove all odd numbers from a list.
40. Write a Python program to flatten a nested list.

### `Tuples`

41. Write a Python program to create a tuple with different data types.
42. Write a Python program to find the length of a tuple.
43. Write a Python program to convert a tuple to a string.
44. Write a Python program to find the index of an item in a tuple.
45. Write a Python program to count the occurrences of an item in a tuple.
46. Write a Python program to convert a list to a tuple.
47. Write a Python program to reverse a tuple.
48. Write a Python program to replace the last value of tuples in a list.
49. Write a Python program to find the repeated items in a tuple.
50. Write a Python program to remove an item from a tuple.

### `Dictionaries`

51. Write a Python program to create a dictionary from two lists.
52. Write a Python program to sort a dictionary by its keys.
53. Write a Python program to add a key-value pair to a dictionary.
54. Write a Python program to merge two dictionaries.
55. Write a Python program to iterate over a dictionary and print its keys and values.
56. Write a Python program to find the maximum and minimum values in a dictionary.
57. Write a Python program to remove a key from a dictionary.
58. Write a Python program to check if a key exists in a dictionary.
59. Write a Python program to invert a dictionary (swap keys and values).
60. Write a Python program to count the frequency of words in a given text.

### `Sets`

61. Write a Python program to create a set and add elements to it.
62. Write a Python program to remove an element from a set.
63. Write a Python program to check if an element is present in a set.
64. Write a Python program to find the union of two sets.
65. Write a Python program to find the intersection of two sets.
66. Write a Python program to find the difference between two sets.
67. Write a Python program to find the symmetric difference between two sets.
68. Write a Python program to check if a set is a subset of another set.
69. Write a Python program to iterate over a set.
70. Write a Python program to remove duplicates from a list using a set.

### `File Handling`

71. Write a Python program to read a file and print its contents.
72. Write a Python program to write a list to a file.
73. Write a Python program to append text to an existing file.
74. Write a Python program to read a file line by line and store it into a list.
75. Write a Python program to count the number of lines in a file.
76. Write a Python program to read a file and count the frequency of words.
77. Write a Python program to read a file and print only the first `n` lines.
78. Write a Python program to find the longest word in a file.
79. Write a Python program to copy the contents of one file to another.
80. Write a Python program to delete a file.

### `Exception Handling`

81. Write a Python program to handle division by zero.
82. Write a Python program to handle multiple exceptions using a single `except` block.
83. Write a Python program that raises an exception if a negative number is entered.
84. Write a Python program that uses a `try` and `finally` block.
85. Write a Python program to handle file not found exception.
86. Write a Python program to catch specific exceptions and print a custom error message.
87. Write a Python program that throws an exception if the input is not a number.
88. Write a Python program to create a custom exception class.
89. Write a Python program to demonstrate the use of the `else` block in exception handling.
90. Write a Python program to demonstrate exception chaining.

### `Object-Oriented Programming (OOP)`

91. Write a Python class to represent a rectangle and calculate its area and perimeter.
92. Write a Python class to represent a circle and calculate its area and circumference.
93. Write a Python class to represent a bank account with deposit and withdrawal methods.
94. Write a Python class to represent a student with methods to calculate the average grade.
95. Write a Python class to demonstrate the concept of inheritance.
96. Write a Python class to demonstrate method overriding.
97. Write a Python class to demonstrate the concept of encapsulation.
98. Write a Python class to demonstrate the concept of polymorphism.
99. Write a Python class to represent a car with methods to start and stop the engine.
100. Write a Python program to demonstrate the concept of abstraction using ABC (Abstract Base Class).