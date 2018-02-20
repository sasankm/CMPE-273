var john_car = {
  car_owner : 'John',
  car_name :'ferrari',
  car_model : 458,
  car_color : 'red',
  car_performance : function(speed){
    if(speed >= 250){
      console.log(this.car_owner + ' owns a good ' + this.car_name);
    }
    else{
      console.log('Not a good ' + this.car_name);
    }
  }
}
console.log(john_car.car_name);//ACCESSING THE PROPERTIES IN A OBJECT
console.log(john_car.car_model);
john_car.car_performance(189);//CALLING THE METHOD IN A OBJECT
