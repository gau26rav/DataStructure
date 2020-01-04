# Heap Data Structure

A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

   1. Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all of      it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
   2. Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.

The implementation for heap data structure(Min Heap) in JAVA is PriorityQueue - 

Equivalent Operations are -
 
- ExtractMin - Poll() = As it will always return the root which will hold the min value and will call the heapify then.
- Insert - add() =  Insert and call the heapify up to maintain the balanced min heap property.


### Questions covered in the class

- Given an almost sorted array, every element is almost k distance from its sorted position.Sort the array
	
		IP : arr[] = [10, 5, 1, 20, 15]
		K = 2
		OP: [1, 5, 10, 15, 20]

- Find the kth largest element at every given point.
- Given an array of integers and a number k find the k largest elements of the array.
- Merge K sorted arrays
- Given a stream of numbers print median at every level
