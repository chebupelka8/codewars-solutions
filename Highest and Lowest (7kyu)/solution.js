function highAndLow(numbers){
  return [Math.max(...numbers.split(" ")), Math.min(...numbers.split(" "))].join(" ")
}