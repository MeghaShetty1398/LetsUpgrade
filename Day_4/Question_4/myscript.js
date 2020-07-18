let num1,num2,num,score,total;
let add=()=>{
    num1=+prompt("Enter first number:","0");
    num2=+prompt("Enter second number:","0");
    alert(`Addition is ${num1+num2}`);
}
let sub=()=>{
    num1=+prompt("Enter first number:","0");
    num2=+prompt("Enter second number:","0");
    alert(`Subtraction is ${num1-num2}`);
}
let multiply=()=>{
    num1=+prompt("Enter first number:","0");
    num2=+prompt("Enter second number:","0");
    alert(`Multiplication is ${num1*num2}`);
}
let divide=()=>{
    num1=+prompt("Enter first number:","0");
    num2=+prompt("Enter second number:","0");
    (num2==0)?alert("Cannot divide number by zero."):alert(`Division is ${num1/num2}`);
}
let sqrt=()=>{
    num=+prompt("Enter number:","0");
    alert(`Square Root is ${Math.sqrt(num)}`);
}
let percentage=()=>{
    score=+prompt("Enter score you get:","0");
    total=+prompt("Enter total score:","0");
    alert(`Your percentage is ${(score*100)/total}`);
}