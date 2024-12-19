```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Prints 5
println myMethod(2, 8) // Prints 8
println myMethod(null, 5) // Throws NullPointerException
```