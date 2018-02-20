var array = ['sasank', 'john', 26, true];
var array1 = ['paul','smith'];
var array2 = [['john', 21],['mike', 34]];

array.push(34);
array.unshift('Mr.');
var b = array.length;//ARRAY LENGTH
console.log(array);
console.log(b);
array.pop();
console.log(array);
var c = array.concat(array1);//CONCATINATE TWO ARRAYS
console.log(c);
for(var i=0;i<c.length;i++){//LOOPING THROUGH ARRAYS
  console.log(c[i]);
}
console.log(array2);
console.log(array2[1][0]);
