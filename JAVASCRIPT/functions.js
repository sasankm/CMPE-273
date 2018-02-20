function present_age(birthyear){
  var age = 2018 - birthyear;
  return age;
}
function retirementage(name, birthyear){
  var age = present_age(birthyear);//FUNCTION CALLING ANOTHER FUNCTION
  var retirement = 60 - age;
  if(retirement>=0){
    console.log(name + ' retires in '+ retirement + ' years');
  }
  else{
    console.log(name + ' has already retired'+ ' and its been '+ retirement +' years');
  }
}
retirementage('sasank',1996);
retirementage('paul', 1945);
