var a;
  try{
    if(a == null)
    {
    throw 'empty';
  }
  else
  {
    throw 'a number';
  }
}
catch(error)
{
  console.log("input is "+ error);
}
finally
{
  console.log('execute anyways');
}
