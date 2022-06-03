

function madLibs() {



   

  var storyDiv = document.getElementById("story");
  var pname = document.getElementById("pname").value;
  var char = document.getElementById("char").value;
  var adverb = document.getElementById("adverb").value;
  var adjective = document.getElementById("adjective").value;



  storyDiv.innerHTML = "<h2><br>Rajan's Crazy Madlibs Story<br></h2>"+
  "Hi Everyone, my name is " +pname+ 
  ".<br> One day, I was visiting New York"+" with my friends call me   "+char+ 
  "<br> My favorite color is the color of red and <br>"+
  " my favorite thing to do is " + adverb + " to meet " + char + 
  ". But " +char+ " turned out to be very " +adjective+ 
  " and <br>" +pname+ " did not enjoy the meeting with my friends.<br><br><br>";
}

var libButton = document.getElementById('button');
libButton.addEventListener('click', madLibs);