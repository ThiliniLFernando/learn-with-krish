const prompt = require('prompt-sync')({sigint:true});
let seq = prompt("Enter number sequence.Separate each number with comma : ");
var numArray = seq.split(",");
//var numArray = [22,28,23,24,25,26,27];
findMissing(numArray);

function findMissing(numArray){

  numArray.sort(function(a,b){return a-b});

  var allOk = 0;
  var missingNum = new Array() ;
  for (var i = 1; i < numArray.length; i++) {
    if ((numArray[i] - numArray[i-1]) == 2) {
      missingNum.push(numArray[i] - 1);
    }else if ((numArray[i] - numArray[i-1]) == 1) {
      allOk++;
    }
  }

  var size = missingNum.length ;

  if (size === 0) {
    if (allOk === numArray.length-1) {
      var lastIn = numArray.length - 1 ;
      console.log("Maybe missing number is "+(numArray[0]-1)+" or "+(Number(numArray[lastIn])+1));
    }else{
      console.log("you entered number sequence is not followed the n+1 sequence");
    }
  }else if(size > 1){
    console.log("Cannot identify the real missing number. There are "+missingNum+" missing numbers followed the n+1 sequence");
  }else if (size === 1) {
    console.log("missing number is : "+missingNum);
  }
}