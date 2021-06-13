var users = [
    { id: 1, first_name: "Eamon", last_name: "Harhoff", email: "eharhoff0@imageshack.us", gender: "Male", age: 76, salary: 18888 },
    { id: 2, first_name: "Laney", last_name: "Whittam", email: "lwhittam1@issuu.com", gender: "Female", age: 42, salary: 15018 },
    { id: 3, first_name: "Lynett", last_name: "Twinberrow", email: "ltwinberrow2@gov.uk", gender: "Female", age: 99, salary: 13343 }
];


console.log("List of users have gender = male and age < 40: ",users.filter(user => user.gender == "Female" && user.age > 40));  
console.log("Average age of users: ",(users.reduce((avg, user) => avg += user.age, 0)/users.length).toFixed(2));  



