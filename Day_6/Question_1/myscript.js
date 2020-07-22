let mycolor=["red","black","green","yellow","blue"];
let i=0;
function setBackground()
{
    document.body.style.backgroundColor=mycolor[i];
    if(i==(mycolor.length)){
        i=-1;
    }
    i++;
}
setInterval(setBackground,5000);