/* function reverse()
{
    var str = document.getElementById('str').value;
    var n = str.length;
    var first = 0;
    var last = 0;
    var nstr = "";
    for(var i=0;i<n;i++)
    {
        if(str[i]==" ")
        {
            last = i-1;
            while(last>=first)
            {
                nstr += str[last];
                last--;
            }
            nstr += " ";
            first = i + 1;
        }
        if(i == n-1)
        {
            last = i;
            while(last>=first)
            {
                nstr += str[last];
                last--;
            }
        }
    }
    document.write(`<h2>${nstr}</h2>`);
}
 */
/* var arr = ['a','b','c','d','e'];
console.log(arr);
arr = arr.splice(0,0);
console.log(arr); */

/* var arr = [1,2,3,4]
arr.unshift(12);
arr.unshift(13);
arr.unshift(14);
arr.shift();
arr.shift();
console.log(arr); */

/* function anagramcheck(){
    var a = document.getElementById('str1').value;
    var b = document.getElementById('str2').value;
    var flag  = 1;
    for(var i=0;i<a.length;i++)
    {
        if(!a.includes(b[i])){
            document.write("<h2>false</h2>");
            return false;
        }
    }
    document.write("<h2>true</h2>");
    return true;
} */
   /*  for(var i=1;i<=100;i++)
    {
        if(i%3==0 && i%5==0)
        {
            console.log(i+" fizzbuzz");
        }
        else if(i%3==0)
        {
            console.log(i+" fizz");
        }
        else if(i%5==0)
        {
            console.log(i+" buzz");
        }
        else{
            console.log(i+" ");
        }
    }
 */
   /*  function validName(){
        var string = document.getElementById('str').value;
        let firstName = "";
        let middleName = "";
        let lastName = "";
        let spacecount = 0;
        let dotcount = 0;
        let e = "";
        for (let i = 0; i < string.length; i++) {
          if (string[i] === ".") {
            dotcount += 1;
          }
          if (string[i] === " ") {
            spacecount += 1;
          }
          if (spacecount === 0) {
            firstName += string[i];
          } else
          if (spacecount === 1) {
            if (string[i] !== " ") {
              middleName += string[i];
            }
          } else 
          if (spacecount === 2) {
            if (string[i] !== " ") {
              lastName += string[i];
            }
          }
        }
        if (string[string.length - 1] === ".") {
            dotcount -= 1;
          }

        let firstNameRegex = /^[A-Z][a-zA-Z]+$|^[A-Z]\W$/g;
        let a = firstNameRegex.test(firstName);
        let a1 = firstName.match(firstNameRegex);

        let middleNameRegex = /^[A-Z][a-zA-Z]+$|^[A-Z]\W$/g;
        let b = middleNameRegex.test(middleName);
        let b1 = middleName.match(middleNameRegex);

        let lastNameRegex = /^[A-Z][a-zA-Z]+$/g;
        let c = lastNameRegex.test(lastName);
        let c1 = lastName.match(lastNameRegex);

          if (a === true && b === true && c === true && spacecount === 2
              && (dotcount === 0 || dotcount === 2)) {
            e = true;
          } else
          if (a === true && b === true && c === true && spacecount === 2 
              && (middleName[middleName.length - 1] === ".")) {
            e = true;
          } else
          if (a === true && b === true && spacecount === 1) {
            e = true; 
          } else
          e = false;
            let fullName = firstName + " " + middleName + " " + lastName
          return e;
      }
       */
/* 
      function check(){
        var n = 23;
        var sum = 0;
        while(n%10!=0)
        {
          sum += n%10;
          n = n/10;
        }
        if(sum%2!=0)  console.log("oddish")
        else  console.log("even")
      } */

      //Binary search using recursion

 /*      function recursiveBinarySearch(array,low,high,element){
          console.log(low+" from 2nd if statement "+high+" and the search "+element);
            if (high >= low){
                var middle = Math.floor(low + (high - low)/2);
                console.log(middle);
                if (array[middle] == element){
                  return middle;
                }
                if (array[middle] > element)
                {
                  console.log(array[middle]+" from 2nd if statement");
                  return recursiveBinarySearch(array, low, middle-1, element);
                }
                else{
                  console.log(array[middle]+" from else statement");
                  return recursiveBinarySearch(array, middle+1, high, element);
                }
                }
            return -1;
        }
var array = [1,2,34,4,5,6,8,7,9];
var low = 0;
var high = array.length - 1;
var element = 8;
 console.log(recursiveBinarySearch(array,0,high,element));

 */

/*  var arr = [1,2,3,44,4];
 var arr2 = [69,35,67,88]
 arr = arr.concat(arr2);
 arr = arr.concat(10,23,3,4,44);
 console.log(arr); */

 const person = {
  age:14,
  car:"bmw",
  name:"antony"
 };
 console.log(person.gg);
/*  const per = Object.keys(person);

 */
/* const per = Object.assign(person); 
const pp = Object.entries(person);
console.log(per.hasOwnProperty());
console.log(pp); */
/* const humon ={
  name:"antony",
  age:15
};
const human = humon;
humon.name = "antony jeson";
console.log(humon);
console.log(human);
 */
/* const ar = ["harish","kk","aas","sd","sdi"]
const map = new Map();
map.set(arr,ar);
console.log(map) */



      
      
 
