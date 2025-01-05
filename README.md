# Income Tax Calculation Program

## Description
To calculate the income tax a person needs to pay, a country applies the following rules:

1. **Salary Tax**: The person pays tax on their salary according to the table below:

| Salary Range          | Tax Rate         |
|-----------------------|------------------|
| Below 3000 per month  | Exempt           
| From 3000 to 5000 (exclusive) | 10%        |
| 5000 or above         | 20%              |

2. If the person has earned income from services, the tax charged is **15%**.

3. If the person has earned capital gains (e.g., from real estate, stocks), the tax charged is **20%**.

4. The person can deduct up to **30%** of their gross tax due with medical or educational expenses. However, if their medical and educational expenses are less than 30%, only the actual expenses can be deducted.

## Objective
Create a program to read the data of **N** taxpayers, storing the data of these taxpayers in a list. Then, the program should display a tax summary for each taxpayer, as shown in the example below.

You must use a `TaxPayer` class (as provided in the project) to represent each taxpayer. Note that your list will have to be a `List<TaxPayer>`. 

Remember to respect the names provided in the project (since the project specification was given to you, you must follow the provided specification). Feel free to implement constructors to facilitate object instantiation.


![image](https://github.com/user-attachments/assets/99ee0b03-f900-48d4-8b5d-61c2b4f75d1e)


## Example Output:

![image](https://github.com/user-attachments/assets/6e352eea-8657-4eed-9043-520227bdacdc)



## Requirements:
- Implement the `TaxPayer` class with the appropriate attributes and methods.
- Store the data of multiple taxpayers in a `List<TaxPayer>`.
- Calculate and display the tax for each taxpayer according to the rules.
- Include deduction calculations based on medical and educational expenses.

## Technologies Used:
- Java (or another suitable programming language)

## Actor:
Matheus Accorsi
