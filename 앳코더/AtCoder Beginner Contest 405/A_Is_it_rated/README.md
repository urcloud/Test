# A - Is it rated?

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 100 points

## Problem Statement
AtCoder Regular Contest (ARC) currently has two divisions: Div.1 and Div.2. In ARC Div.1, participants whose rating is between 1600 and 2999, inclusive, are rated. In ARC Div.2, participants whose rating is between 1200 and 2399, inclusive, are rated.

You are given positive integers R and X.

Determine whether a person with rating R is rated in ARC Div.X.

## Constraints
* 1≤R≤4229
* 1≤X≤2
* All input values are integers.

## Input
The input is given from Standard Input in the following format:
> R X

## Output
If a person with rating R is rated in ARC Div.X, output Yes; otherwise, output No.

### Sample Input 1
> 2000 1
### Sample Output 1
> Yes

Because 2000 lies between 1600 and 2999, a person with rating 2000 is rated in ARC Div.1.

### Sample Input 2
> 1000 1
### Sample Output 2
> No

Because 1000 is less than 1600, a person with rating 1000 is not rated in ARC Div.1.

### Sample Input 3
> 1500 2
### Sample Output 3
> Yes

Because 1500 lies between 1200 and 2399, a person with rating 1500 is rated in ARC Div.2.

### Sample Input 4
> 2800 2
### Sample Output 4
> No

Because 2800 exceeds 2399, a person with rating 2800 is not rated in ARC Div.2.