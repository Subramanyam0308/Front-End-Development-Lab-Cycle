let a=[11,4,13,15,16];
let b=a.map((x)=>{return x*x});
console.log("b="+b);
let c=a.filter((x)=>{return x%2==0});
console.log("c="+c);
let d=a.reduce((sum,i)=>{return sum+i});
console.log("d="+d);
/*let e=a.reduce(add,100);
function add(sum,i){
    return sum+i;
}
console.log("e="+e);*/

