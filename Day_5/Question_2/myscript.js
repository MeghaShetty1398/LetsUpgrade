class User{
    constructor(name,age,email){
        this.name=name;
        this.age=age;
        this.email=email
    }
    login(){
        console.log(`${this.name} has logged in.`)
        return this;
    }
    logout(){
        console.log(`${this.name} has logged out.`)
        return this;
    }
}
class Moderator extends User{
    constructor(name,age,email,coins){
        super(name,age,email);
        this.coins=coins
    }
    addCoin()
    {
        this.coins++;
        console.log(`Currently, you have coins ${this.coins}.`)
        return this;
    }
    removeCoin()
    {
        this.coins--;
        console.log(`Currently, you have ${this.coins}.`)
        return this;
    }
}
class Admin extends Moderator{
    courses=[];
    constructor(name,age,email,coins,course)
    {
        super(name,age,email,coins);
        this.courses.push(course);
    }
    addCourse(course)
    {
        this.courses.push(course);
        console.log(`Currently, your courses are ${this.courses}.`)
        return this;
    }
    removeCourse()
    {
        this.courses.pop();
        console.log(`Currently, your courses are ${this.courses}.`)
        return this;
    }
}
let admin1=new Admin("Megha",20,"shettymegha098@gmail.com",5,"Javascript");
admin1.login().addCoin().removeCoin().addCourse("Python").removeCourse().logout();