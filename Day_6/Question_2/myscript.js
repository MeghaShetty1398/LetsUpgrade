let num=prompt("Enter a number: ","1");
if(num==''){num=0}
var mytxt=document.getElementById('mytxt');
for(i=1;i<=10;i++){
    mytxt.innerHTML+=`${num} x ${i} =${num*i}<br>`
}