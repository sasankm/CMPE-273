

localStorage.setItem('name', 'sasank matavalam');
let val = localStorage.getItem('name');
console.log(val);
let key = 'mysjsuid';
localStorage.setItem(key, 123456);

let family = {
    "name":"sasank",
    "age":22,
    "game":"cricket",
    "items":[
        "bat",
        "ball",
        "wickets",
        "keeping pads & gloves",
        "batting glove,pads"
    ]
};
let str = JSON.stringify(family);
localStorage.setItem("PlayerDetails", str);
let orig = localStorage.getItem("PlayerDetails");
console.log(orig);
let obj = JSON.parse(orig);
console.log(obj);
