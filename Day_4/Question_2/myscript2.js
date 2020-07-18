const student={
    name:"Helsinki",
    age:24,
    projects:{
        diceGames:"Two player dice game using Javascript"
    }
}
//Destructuring Objects
console.log(student.name);
console.log(student.age);
console.log(student.projects.diceGames);

const {name,age,projects:{diceGames}}=student;
console.log(`Hello, I am ${name}. My age is ${age}. I am doing project ${diceGames}`);