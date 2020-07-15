//String Methods

var mytxt="Welcome to Javascript."
//1. split()->A string can be converted to an array with the split() method
console.log(mytxt.split(' '));
//2.charCodeAt()->returns the unicode of the character at a specified index in a string
console.log(mytxt.charCodeAt(8));    
//3. ECMAScript 5 (2009) allows property access [ ] on strings
console.log(mytxt[8]);
//4.trim()->removes whitespace from both sides of a string
var mytxt = "       Hello World!        ";
console.log(mytxt.trim());
