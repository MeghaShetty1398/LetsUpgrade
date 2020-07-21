let num=prompt("Enter the number: ");
let myarr=[]
for(i=1;i<=num;i++){
    myarr.push(i);
}
console.log(`Array is ${myarr}`);
//FILTER FUNCTION
let odd=myarr.filter(n=>n%2!=0);
console.log(`Odd number from array is ${odd}`);
//MAP FUNCTION
let cubes=odd.map(n=>n*n*n);
console.log(`Cubes of odd number generated is ${cubes}`);
