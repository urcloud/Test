# B - Not All

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 200 points

## Problem Statement
You are given an integer sequence $ A=(A_1, A_2, … , A_N)$ of length N and a positive integer M.

Your goal is to make the following condition false by performing this operation between 0 and N times (inclusive): remove the last element of A.
* Condition: A contains every integer from 1 through M.

Find the minimum number of operations required.

Under the constraints of this problem, it can be proved that it is always possible to make the condition false by performing the operation between 0 and N times.

## Constraints
* 1≤M≤N≤100
* $ 1≤A_i≤M $
* All input values are integers.

## Input
The input is given from Standard Input in the following format:
> N M
>
>$A_1 A_2 … A_N$
​ 
## Output
Output the minimum number of operations required to make the condition false.

### Sample Input 1
> 5 3
>
> 3 2 3 1 2
### Sample Output 1
> 2

Initially, A=(3,2,3,1,2). Since A contains every integer from 1 through 3, the condition holds.

If you perform the operation once, A=(3,2,3,1). The condition still holds.

If you perform the operation once more, A=(3,2,3). The integer 1 is missing, so the condition no longer holds.

Therefore, the minimum required number of operations is 2.

### Sample Input 2
> 4 3
>
> 1 3 1 3
### Sample Output 2
> 0

Since A initially lacks the integer 2, the condition is already false, so no operation is needed.

### Sample Input 3
> 10 4
>
> 1 3 3 4 2 1 3 1 2 4
### Sample Output 3
> 6