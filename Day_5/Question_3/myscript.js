console.log("COMPLETED TODOS");
fetch('https://jsonplaceholder.typicode.com/todos')
.then(response=>response.json())
.then(
    data=>{
    for(var i=0;i<data.length;i++){
        if(data[i].completed==true){
            console.log(data[i]);
        }
        }
    }
);
