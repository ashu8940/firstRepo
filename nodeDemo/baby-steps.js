'use strict'
var sum=0;
const myarr=process.argv.slice(2);
for(var i=0; i<=myarr.length-1; i++){
	sum=sum+Number(myarr[i]);
}
console.log(sum);