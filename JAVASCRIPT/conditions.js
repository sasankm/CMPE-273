function job(age)
{
  if(age >=21 && age<= 23){
    console.log( 'You can apply but must take an exam');
  }
  else if(age>23 && age <=29){
    console.log('No need of exam');
  }
  else {
    console.log('Not eligible');
  }
}
job(34);
job(25);
job(23);
