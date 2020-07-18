let sales=+prompt("Enter sales made by Employee: ","0");
let commission;
if(sales>=0 && sales<=5000){
    commission=sales*0.02;
}
else if(sales>=5001 && sales<=10000){
    commission=sales*0.05;
}
else if(sales>=10001 && sales<=20000){
    commission=sales*0.07;
}
else if(sales>20000){
    commission=sales*0.10;
}
console.log(`The total commission earned by the employee is : ${commission}`);