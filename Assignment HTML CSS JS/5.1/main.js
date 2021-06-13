// 1
var arrInt = [3,4,1,5,2,6,8,7];
console.log("Number array: ",arrInt);

// 2
var arrIntEven = arrInt.filter(value => value % 2 == 0);
console.log("Array of even values: ",arrIntEven);
console.log("Sum of even values: ",arrInt.reduce((sum,number) => number % 2 == 0 ? sum += number : sum += 0, 0));

// 3 
var arrIntOdd = arrInt.filter(value => value % 2 == 1);
console.log("Array of odd values: ",arrIntOdd);
console.log("Sum of odd values: ",arrInt.reduce((sum,number) => number % 2 == 1 ? sum += number : sum += 0, 0));

// 4
// var a = parseInt(prompt("Enter value of a: "));
// var b = parseInt(prompt("Enter value of b: "));
// console.log("a = " + a);
// console.log("b = " + b);
// for (; a <= b; a++) {
//     console.log(arrInt[a]);
// }

// 5
function SelectionSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
    }
}

function InsertionSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        let key = arr[i];
        let j = i - 1;
        while (j >=0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

// console.log("Selection Sort:");
// SelectionSort(arrInt);
// SelectionSort(arrIntEven);
// SelectionSort(arrIntOdd);

console.log("Insertion Sort:");
InsertionSort(arrInt);
InsertionSort(arrIntEven);
InsertionSort(arrIntOdd);

console.log(arrInt);
console.log(arrIntEven);
console.log(arrIntOdd);