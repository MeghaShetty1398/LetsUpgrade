let num=+prompt("Enter a number","2")
for(let i=2;i<=num;i++){
    let p=0;
    for(let j=2;j<i;j++){
        if((i%j)==0){
            p=1;
            break;
        }
    }
    if(p==0){
        console.log(i);
    }
}