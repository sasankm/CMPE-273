var exp = 'Hi my name is sasank reddy';
var regexp = /.nk/;
var regexp1 = /h/i;//CASE INSENSITIVE MATCHING FOR H CHARACTER
var regexp3 = /d+/;

console.log(regexp1.test(exp));
console.log(exp.match(regexp));
console.log(regexp3.exec(exp));
console.log(exp.search('is'));//RETURNS THE INDEX NUMBER OF CHARACTER FOUND
console.log(exp.replace('reddy','matavalam'));
console.log(exp.split('s'));//SPLITS THE S  CHARACTER FROM THE STRING

if(regexp.test(exp) == true){
  console.log('its working');
}
else {
  console.log('not working');
}
