# A - Thermometer

Time Limit: 2 sec / Memory Limit: 1024 MB
Score : 100 points

## Problem Statement
Takahashi measured his body temperature and found it to be X ∘C.

Body temperature is classified into the following:
* Higher than or equal to 38.0 ∘C: “High fever”
* Higher than or equal to 37.5 ∘C and lower than 38.0 ∘C: “Fever”
* Lower than 37.5 ∘C: “Normal”

Which classification does Takahashi's body temperature fall into? Present the answer as an integer according to the Output section.


## Constraints
* 30≤X≤50
* X is given to one decimal place.


## Input
The input is given from Standard Input in the following format:
> X

## Output
Print an integer specified below corresponding to Takahashi's body temperature classification.

* High fever: 1
* Fever: 2
* Normal: 3


### Sample Input 1
> 40.0
### Sample Output 1
> 1

His body temperature is 40.0 ∘C, which is classified as a high fever. Thus, print 1.

### Sample Input 2
> 37.7
### Sample Output 2
> 2

His body temperature is 37.7 ∘C, which is classified as a fever. Thus, print 2.

### Sample Input 3
> 36.6
### Sample Output 3
> 3

His body temperature is 36.6 ∘C, which is classified as a normal temperature. Thus, print 3.