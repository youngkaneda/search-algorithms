# Java implementations for Search Algorithms :coffee:  

**The problem** : Given an array ``arr[]`` of n elements, write a function to search a given element ``x`` in ``arr[]``.


## Linear Search :heavy_check_mark:
*( Can be used for unsorted arrays )*

It sequentially checks each element of the array for the target value until a match is found or until all the elements have been searched.

**Time complexity = O(n)**

**Steps :**

1. start from the index 0 of an array and one by one, compare ``x`` with each element of the array;
2. if ``x`` matches with the element, so return the index;
3. if doesn't matches and the array has reached the limit, then return -1;

![Alt Text](https://www.tutorialspoint.com/data_structures_algorithms/images/linear_search.gif)

## Binary Search :heavy_check_mark:
*( Is used for sorted arrays )*

Binary search is a array search algorithm that follows the paradigm of division and conquest. It performs successive divisions of the search space by comparing the searched element ``x`` with the element in the middle of the array.

**Time complexity = O(Log n)**

**Steps :**
    
1. Compare ``x`` with the middle element;
2. If ``x`` matches with middle element, return the mid index;
3. Else If ``x`` is greater than the mid element, then ``x`` can only search in right half after the mid element. So, go to right half;
4. Else (``x`` is smaller), go to the left half.

*(image example will be added later)*

## Jump Search :heavy_check_mark:
*( Is used for sorted arrays )*

The basic idea is to check fewer elements of an array ``arr[]`` by jumping ahead by fixed steps, a value ``j``, in place of searching all elements, and when ``arr[j]`` is greater then ``x``, jump back once and make a linear, or whatever search you want, to find the position of ``x``. 
The best fixed value is caulculated by the square root of the lenght of array that will be used.
 
**Time complexity = O(√n)**

**The time complexity of the auxiliar search changes accordingly with the search used.**

**Steps :** *(the value of ``j`` is updated in every iterarion by ``j+= sqrt(arr.size)``)*

1. Jump from index 0 to index ``j``;
2. If ``arr[j]`` is equals to ``x``, then return ``j``;
3. Else If ``arr[j]`` is greater than ``x``, so jump back in array with the previous value of ``j`` and do a linear search, or a binary search, to find the position of ``x`` and then return it;
4. Else, so update the value of ``j`` and go to step 2.
5. If the value of ``j`` becomes greater than ``arr.size`` so return -1.

*(image example will be added later)*

## Interpolation Search :heavy_check_mark:
*( Is used for sorted arrays )*

Interpolation search may go to different locations according the value of key being searched. For example if the value of key is closer to the last element, interpolation search is likely to start search toward the end side. It works like an search in a phone book, when you look at the person number in the phone book, starting by the letters closer to the name of the person searched. 

**Time complexity = O (log log n)) if elements are uniformly distributed**

**In worst case it can take upto O(n)**

To find the position to be searched, it uses following formula:
``` 
pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]

arr[] ==> Array where elements need to be searched
x     ==> Element to be searched
lo    ==> Starting index in arr[]
hi    ==> Ending index in arr[]
```

**Steps :**

1. Calculate the value of ``pos`` using the formula.
2. If it is a match, return the index of ``x``.
3. If ``x`` is less than ``arr[pos]``, calculate the probe position of the left sub-array, taking ``hi = pos - 1``. Otherwise calculate the same in the right sub-array, taking ``lo = pos + 1``.
4. Repeat until a match is found or the sub-array reduces to zero, and then return -1.

*(image example will be added later)*

## Exponential Search :construction:
## Sublist Search :construction:
## Fibonacci Search :construction:

