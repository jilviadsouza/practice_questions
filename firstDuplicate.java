/* firstDuplicate
Given an array a that contains only numbers in the range from 1 to a.length, 
find the first duplicate number for which the second occurrence has the minimal index. 
In other words, if there are more than 1 duplicated numbers, return the number for which 
the second occurrence has a smaller index than the second occurrence of the other number does. 
If there are no such elements, return -1.

Example

For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.

There are 2 duplicates: numbers 2 and 3. 
The second occurrence of 3 has a smaller index than the second occurrence of 2 does, 
so the answer is 3.

For a = [2, 2], the output should be firstDuplicate(a) = 2;

For a = [2, 4, 3, 5, 1], the output should be firstDuplicate(a) = -1.


*/


/* FIRST ATTEMPT:
the run time of this is O(n^2), which isn't optimal at all. it solved 21/23 tests.

*/

int firstDuplicate(int[] a) {

int min_index = a.length; //making it as big as possible so we can update w the min

for(int i = 0; i < a.length; i++){
    for(int j = i+1; j < a.length; j++){
        if (a[i] == a[j]){
            min_index = Math.min(min_index, j);
        }
    }
}

if(min_index == a.length) return -1;
else return a[min_index];
}


/* SECOND ATTEMPT: 

needed a linear run time. the objective is to return the first occurrence of a duplicate. 
here, we're storing our duplicates in a hashset. if the set already contains a[i], then that means we found our first duplicate, so we just return it. if it wasn't visited before, add it into the set. if no duplicates are found, return -1. 
run time is O(n)

*/

int firstDuplicate(int[] a) {

HashSet<Integer> seen = new HashSet<>();

for(int i = 0; i < a.length; i++){
    if(seen.contains(a[i])){
        return a[i];
    } else {
        seen.add(a[i]);
    }
}
    return -1;
}