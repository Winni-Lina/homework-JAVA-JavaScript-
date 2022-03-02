function shadowing_example(){
	console.log("F",val);
	val++
}

var val = 0;
shadowing_example();
console.log("O",val);