principal = float(input("Enter the fixed deposit amount: "))
rate = float(input("Enter the interest rate: "))
time = float(input("Enter the tenure in years: "))
simple_interest = (principal * rate * time) / 100
total_return = principal + simple_interest
print("The total return after", time, "years is:", total_return)
