var welcomeMsg = "Hi There! This programe is developed to find out missing number from 10 number series which follows n+1 sequence."+
                 "Means you can enter 9 numbers and we will find the missing one.continue ? (yes) :";

const prompt = require('prompt-sync')({sigint: true});
let answer = prompt(welcomeMsg);
if(answer === "yes"){
var numbersToEnter = 1;
var minNum = 0;
var numArray = new Array();
while (numbersToEnter<=9) {
  let n = prompt("Enter Number "+numbersToEnter +" : ");
  if(n !== ""){
    numArray.push(Number(n));
    numbersToEnter++;
  }
}

var temp = numArray[0];
for (var i = 0; i < numArray.length -1; i++) {
  for (var j = 0; j < numArray.length - i -1; j++) {
    if (numArray[j]>numArray[j+1]) {
      temp = numArray[j];
      numArray[j] = numArray[j+1];
      numArray[j+1]=temp;
    }
  }
}

var allOk = new Array();
var missingNum = new Array() ;
for (var i = 1; i < numArray.length; i++) {
    if ((numArray[i] - numArray[i-1]) != 1) {
      missingNum.push(numArray[i] - 1);
    }else if ((numArray[i] - numArray[i-1]) == 1) {
      allOk.push(true);
    }
}

 var size = missingNum.length ;

 if (size === 0) {
  if (allOk.length === 8) {
    console.log("Maybe missing number is "+(numArray[0]-1)+" or "+(numArray[8]+1));
  }else{
   console.log("you entered number sequence is not followed the n+1 sequence");
  }
 }else if(size > 1){
  console.log("we cannot identify the real missing number");
 }else if (size === 1) {
  console.log("missing number is : "+missingNum);
 }

}else{
  console.log("Exit");
}