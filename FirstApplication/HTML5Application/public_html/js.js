/*TASK 2 A simple function*/
// Add function with name displayDate here
// inside the function, set innerHTML of element with id date to Date()
// Call the function displayDate
function displayDate(){
    document.getElementById("date").innerHTML=Date();
}
displayDate(); 
alert("first handler");
/*TASK 3 Event listener*/
// Register the function displayDate as listener on the click event of element with id showdate
document.getElementById("showdate").addEventListener("click",displayDate);
document.getElementById("showdate").addEventListener("click",function(){alert("first")});
//document.getElementById("showdate").onclick=displayDate;cument.getElementById("showdate").onclick=display


/*TASK 4 Function with arguments*/
// Create a function called add. It should take two arguments, n1 and n2
// Assuming that both arguments are numbers, add them together and store the result in a local variable called result
// Return the value of the local result variable
// Try out the function from the console



/*TASK 5 More functions*/
// After testing the add function, copy it three times
// Rename the copies subtract, multiply and divide
// Replace the plus operator with -, * and / respectively
// Try out the functions from the console



/*TASK 6 complex function with a switch statement*/
// Create a function called calculate
// Resister this function as listener to the click event of the element with id calculate
// Within the function, get the values of elements with ids n1 and n2 and store them in local variables
// Next, get the value of the element with id operator
// Create a local variable result
// Create a switch statement, using this value as the condition
// If the case is "+", run the function add and store the return value in the local variable result.
// Remember to add a break statement so that the switch block is exited after the function call
// Repeat with cases "-", "*" and "/" and run the previously created functions respectively.
// After the switch block, add code to change the innerHTML of element with id result to the local variable result.



/*TASK 7 If statement*/
// Before the switch block in the calculate function, add if statements to make sure that the values of n1 and n2 are numerical
// Use the built in function isNaN() to validate variables n1 and n2
// Display an error message if a value is not numerical
// Cancel out the rest of the function body by using a return statement after the error message has been shown



/*TASK 8 For loop*/
// Inspect the variable carsArray. Note that it is an array of strings
// sort the array
// Loop through the array using a for loop.
// Start the first iteration by setting the variable i to 0
// Loop for as long as i is less than the length of the array
// Add one to i after each iteration
// Inside the loop, add the present value to a local variable, use comma as delimiter
// After the loop, display the value of the variable as innerHTML of element with id cars
var carsArray=["Volvo", "SAAB", "Ford", "Toyota", "Citroen", "BMW"];



/*TASK 9 For in loop*/
// Inspect the variable carsObject. Note that it is an array of objects
// Also note that there is a hole in the array at index 5
// Create a for in loop to iterate through the array
// Get all cars from Sweden and display them in element with id swedishcars. Use a <br /> as delimiter
var carsObject=[{"name":"Volvo","country":"Sweden"}, {"name":"Ford","country":"USA"}, {"name":"Toyota","country":"Japan"},{"name":"SAAB","country":"Sweden"}, {"name":"BMW","country":"Germany"}];
carsObject[6]={"name":"Cooper","country":"UK"};



