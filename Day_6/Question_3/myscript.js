let name=prompt("Enter your name: ");
const title = document.getElementById('myname');
title.innerHTML+=name;

const clock_time = document.getElementById('time');
function clock(){
    let date=new Date();
    let time=date.toLocaleTimeString();
    clock_time.innerText=time;
}
setInterval(clock,1000);

const dark_mode=document.getElementById('dark');
const attr = document.getElementById('attributes');
dark_mode.onclick=function(){
    attr.classList.toggle('dark');
}