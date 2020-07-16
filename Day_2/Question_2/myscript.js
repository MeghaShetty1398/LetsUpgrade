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
//5.The replace() method replaces a specified value with another value in a string
var mytxt="Hello Friends";
console.log(mytxt.replace("Hello","Welcome"));
//6.slice() extracts a part of a string and returns the extracted part in a new string.The method takes 2 parameters: the start position, and the end position (end not included).
var str = "Apple, Banana, Kiwi";
console.log(str.slice(7, 13));
//substr() is similar to slice(). The difference is that the second parameter specifies the length of the extracted part.
var str = "Apple, Banana, Kiwi";
console.log(str.substr(7, 6));
//The search() method searches a string for a specified value and returns the position of the match.
var str = "Please locate where 'locate' occurs!";
console.log(str.search("locate"));
