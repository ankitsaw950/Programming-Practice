# 28. Define a class BankAccount that uses private attributes for balance. Provide properties to get the balance and methods to deposit and withdraw, ensuring the  balance cannot go negative. 


class BankAccount:
    def __init__(self,initial):
        self.__balance = initial
    @property
    def balance(self):
        return self.__balance
    
    def deposit(self,amount):
        if amount > 0:
            self.__balance +=amount
            print("Amount Deposited :" + str(amount))
        else:
            print("Deposit amount must be positive.")
    
    def withdraw(self, amount):
        if amount > 0:
            if amount <= self.__balance:
                self.__balance -= amount
                print("Amount Withdrawn :"+ str(amount))
            else:
                print("Withdrawl Amount must be positive.")

account = BankAccount(100)
print("Initial balance:", account.balance)

account.deposit(50)
print("Balance after deposit:", account.balance)

account.withdraw(30)
print("Balance after withdrawal:", account.balance)

account.withdraw(200)