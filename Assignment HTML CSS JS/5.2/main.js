var name = prompt("Enter name: ");
var dob = prompt("Enter date of birth (MM/dd/yyyy): ");
var sex = prompt("Enter sex: ");
console.log("name: ",name);
console.log("dob: ",dob);
console.log("sex: ",sex);
console.log("Age: ",new Date().getFullYear() - new Date(dob).getFullYear());