var credit_card ={
  "name":"sasank",
  "type":"visa",
  "acc_type":"checkings",
  "acc_num":12345,
  "family_details":[{"fname":"siva","mname":"siri","siblings":1},
{"address":"san jose","apt":445}]
};
var send  = JSON.stringify(credit_card);//SENDING THE OBJECT TO SERVER BY CONVERTING TO STRING
console.log(send);
console.log(credit_card.family_details[0]);
console.log(typeof(send));//RETUNRS THE TYPE FOR credit_card WHICH IS NOW STRING
var receive = JSON.parse(send);//RECEIVES THE STRING FROM SERVER AND CONVERTS TO OBJECT
console.log(receive);
console.log(typeof(receive));//RETUNRS THE TYPE FOR CREDIT CARD WHIC IS NOW OBJECT
