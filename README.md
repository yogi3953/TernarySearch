# TernarySearch
Ternary Search is a divide and conquer search algorithm that works on a sorted array. It is similar to Binary Search but divides the search space into three parts instead of two.

# How Ternary Search Works?
Find two midpoints:

mid1 = low + (high - low) / 3
mid2 = high - (high - low) / 3
Compare the target element with arr[mid1] and arr[mid2]:

If target == arr[mid1], return mid1.
If target == arr[mid2], return mid2.
If target < arr[mid1], search in the left segment [low, mid1 - 1].
If target > arr[mid2], search in the right segment [mid2 + 1, high].
Otherwise, search in the middle segment [mid1 + 1, mid2 - 1].
Repeat the process until the search space is exhausted.

Time Complexity:
# Best Case: 𝑂(1)(if the element is found immediately).
# Worst Case: 𝑂(log3𝑁)(dividing the array into three parts).
# Space Complexity: 𝑂(1)(for the iterative version), 𝑂(log3𝑁)(for the recursive version due to function calls).
