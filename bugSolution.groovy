```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Or handle nulls differently based on requirements
  } else if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Prints 5
println myMethod(2, 8) // Prints 8
println myMethod(null, 5) // Prints null
println myMethod(5, null) // Prints null
```