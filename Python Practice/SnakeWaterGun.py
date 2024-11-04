import random

def game(comp, you):
    if comp == you:
        return None
    elif comp == 's':
        if you == 'w':
            return False
        elif you == 'g':
            return True
    elif comp == 'w':
        if you == 'g':
            return False
        elif you == 's':
            return True
    elif comp == 'g':
        if you == 's':
            return False
        elif you == 'w':
            return True

def print_intro():
    print("\n" + "="*50)
    print("          Welcome to Snake, Water, Gun Game!")
    print("="*50 + "\n")
    print("Rules:")
    print("Snake (s) beats Water (w)")
    print("Water (w) beats Gun (g)")
    print("Gun (g) beats Snake (s)\n")
    print("="*50 + "\n")

def print_round_info(round_number):
    print(f"\nRound {round_number}")
    print("="*15)

def print_choices(you, comp):
    print(f"You chose: {you.upper()}")
    print(f"Computer chose: {comp.upper()}")

def print_round_result(a):
    if a is None:
        print("Result: It's a tie!")
    elif a:
        print("Result: You win this round!")
    else:
        print("Result: Computer wins this round!")

def print_final_result(b, c):
    print("\n" + "="*50)
    print("                  Final Result")
    print("="*50)
    print(f"You won {b} rounds.")
    print(f"Computer won {c} rounds.")
    
    if b > c:
        print("\nCongratulations! You win the game!")
    elif b < c:
        print("\nSorry! You lose the game!")
    else:
        print("\nIt's a tie! Well played!")
    print("="*50 + "\n")

def main():
    print_intro()

    i = 5
    b = 0
    c = 0

    while i > 0:
        randNo = random.randint(1, 3)
        if randNo == 1:
            comp = 's'
        elif randNo == 2:
            comp = 'w'
        else:
            comp = 'g'
        
        print_round_info(6 - i)
        
        you = input("Your turn: Snake (s), Water (w), or Gun (g)? ").lower()

        # Validate input
        if you not in ['s', 'w', 'g']:
            print("Invalid input. Please choose 's' for Snake, 'w' for Water, or 'g' for Gun.")
            continue
        
        a = game(comp, you)
        
        print_choices(you, comp)
        print_round_result(a)
        
        if a is None:
            pass
        elif a:
            b += 1
        else:
            c += 1
        
        i -= 1  # Decrement the loop counter

    print_final_result(b, c)

# Standard boilerplate to call the main() function to begin the program.
if __name__ == "__main__":
    main()
