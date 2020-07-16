let mark=+prompt("Enter your marks out of 100: ");
let grade="";

//Using Conditional statement
if(mark<30){
    grade='C'
}
else if(mark>=30 && mark<60)
{
    grade='B'
}
else
{
    grade='A'
}
console.log(`Marks are ${mark} and grade is ${grade}`)

//Using Switch statement
switch(mark)
{
    case(mark<30):
        grade='C';
        break;
    case (mark>=30 && mark<60):
        grade='B';
        break;
    case (mark>=60 && mark <=100):
        grade='A'
        break;
}
console.log(`Marks are ${mark} and grade is ${grade}`)

//Using ternary operator
grade=mark<30?'C':(mark>=30 && mark<60)?'B':(mark>=60 && mark<=100)?'A':'';
console.log(`Marks are ${mark} and grade is ${grade}`)