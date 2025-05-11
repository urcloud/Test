# C - Sum of Product

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 300 points

## Problem Statement
You are given a length-N integer sequence $A=(A_1, A_2, … , A_N)$.

Compute the value of $\sum_{1≤i<j≤N} A_iA_j$.

## Constraints
* $ 2≤N≤3×10^5$
* $ 1≤A_i≤10^4$
* All input values are integers.

## Input
The input is given from Standard Input in the following format:
> N
>
> $A_1 A_2 … A_N
​
### Output
Output the answer.

### Sample Input 1
> 3
> 
> 4 2 3
### Sample Output 1
> 26

We have $\sum_{1≤i<j≤N} A_iA_j=A_1A_2 + A_1A_3 + A_2A_3 =4⋅2+4⋅3+2⋅3=26.$

### Sample Input 2
> 2
>
> 9 45

### Sample Output 2
> 405

### Sample Input 3
> 10
>
> 7781 8803 8630 9065 8831 9182 8593 7660 7548 8617
### Sample Output 3
> 3227530139