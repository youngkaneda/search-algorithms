# Java implementations for Search Algorithms :coffee:  

## Linear Search :heavy_check_mark:
*( Can be used for unsorted arrays )*

Given an array ``arr[]`` of n elements, write a function to search a given element x in ``arr[]``.

**Time complexity = O(n)**

**Steps :**

1. start from the index 0 of an array and one by one, compare x with each element of the array;
2. if x matches with the element, so return the index;
3. if doesn't matches return -1;

![Alt Text](https://www.tutorialspoint.com/data_structures_algorithms/images/linear_search.gif)

## Binary Search :heavy_check_mark:
*( Is used for sorted arrays )*

Given an array ``arr[]`` of n elements, write a function to search a given element x in ``arr[]``.

**Time complexity = O(Log n)**

**Steps :**
    
1. Compare x with the middle element;
2. If x matches with middle element, return the mid index;
3. Else If x is greater than the mid element, then x can only search in right half after the mid element. So, go to right half;
4. Else (x is smaller), go to the left half.

*(image example will be later added)*

## Jump Search :construction:
## Interpolation Search :construction:
## Exponential Search :construction:
## Sublist Search :construction:
## Fibonacci Search :construction:

