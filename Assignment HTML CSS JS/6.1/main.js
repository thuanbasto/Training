// 1
function isCreditCard(str) {
    let re = /^[0-9]{16}$/;
    return re.test(str);
}
console.log("Credit card");
console.log(isCreditCard("1234567890123456"));
console.log(isCreditCard("123456789012345"));
// 2 
function isNumber(str) {
    let re = /^[0-9]+$/;
    return re.test(str);
}
console.log("Number");
console.log(isNumber("1234567890123456"));
console.log(isNumber("1234a"));
// 3
function isEmail(str) {
    let re = /^[\w._-]{6,}@[\w]+(\.[a-zA-Z]{2,6})+$/i; 
    return re.test(str);
}
console.log("Email");
console.log(isEmail("thuan1@fsoft.com.vn.as"));
console.log(isEmail("123141@a1aa.com."));
// 4
function isURL(str) {
    let re = /^(http)?s?:?(\/\/)?(www.)?[\w]+(\.[\w]{2,})+(\/{1}[\w]+)*\/?$/i; 
    return re.test(str);
}
console.log("Url");
console.log(isURL("http://www.w3schools.com/"));
console.log(isURL("https://www.w3schools.com/"));
console.log(isURL("www.w3schools.com/"));
console.log(isURL("www.w3schools.com"));
console.log(isURL("www.w3schools.com.vn/123/1/1/3/"));
console.log(isURL("www.w3schools."));
console.log(isURL("ww.w3schools.com.a"));
console.log(isURL("w3schools.com.as/"));

// 5
function isAlphabetAndNumber(str) {
    let re = /^[\w]+$/i; 
    return re.test(str);
}
console.log("Alphabet And Number");
console.log(isAlphabetAndNumber("1"));
console.log(isAlphabetAndNumber("1a/"));
console.log(isAlphabetAndNumber("1a.1"));
console.log(isAlphabetAndNumber("1231asdad"));
