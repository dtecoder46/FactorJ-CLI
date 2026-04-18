# FactorJ CLI

A CLI tool to help make finding factors of numbers easier

# How to Run
1. Fork this repo onto your local machine
2. Install OpenJDK (Java)
3. Install Python
4. TBD

# Algorithm

1. Global scope
    1. Request values from SQLite database
    2. Try
        1. Ask the user for an integer
    3. Except if the input is a decimal (input mismatcherror)
        1. Print an error message
    4. Take the absolute value to account for negatives
    5. If the input integer exists in the database
        1. Print the result value and factors
    6. Otherwise
        1. Call the recursive method
    7. Print out the factors of the number
2. Recursive method
    1. Define a list of factors
    2. If the integer is even
        1. Add 2 to the factors list
        2. Calculate the division and use it in the recursive function call
    3. Otherwise if the integer is divisible by 3
        1. Add 2 to the factors list
        2. Calculate the division and use it in the recursive function call
    4. Otherwise if the integer is divisible by 5
        1. Add 2 to the factors list
        2. Calculate the division and use it in the recursive function call
    5. Otherwise if the integer is divisible by 7
        1. Add 7 to the factors list
        2. Calculate the division and use it in the recursive function call
    6. Otherwise return 1 and the random integer (prime number)
    7. If the integer is 1, call the compression method with the list of factors
3. Compression method
    1. Get the factor list length
    2. Find the middle index
        1. Define integers sumOfLeft and sumOfRight
    3. Loop over the factor list
        1. If the current index is greater than the middle index
            1. Add the current factor to sumOfRight
        2. Else
            1. Add the current factor to sumOfLeft
4. Long-term storage
    1. Write sums and result to JSON file
    2. Python
        1. Parse JSON file
        2. Send results to SQLite

# References

[Java: Getting Started with Java](https://dev.java/learn/getting-started/#compiling-running) 
[w3Schools Java Tutorial](https://www.w3schools.com/java/default.asp)

