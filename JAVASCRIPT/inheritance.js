var Person = function(name, year, job){
	this.name = name;
	this.year= year;
	this.job = job;

}

Person.prototype.calculateage = function(){
	console.log(2018 - this.year);
};

Person.prototype.lastname = 'smith';


var john = new Person('john',1995,'student');
var mike = new Person('mike',1990,'engineer');

john.calculateage();
mike.calculateage();
console.log(john.lastname);
