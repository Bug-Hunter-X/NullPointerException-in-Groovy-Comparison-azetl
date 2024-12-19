# Groovy NullPointerException in Comparison

This repository demonstrates a common but easily missed error in Groovy: NullPointerExceptions arising from implicit type coercion during comparisons.

The `bug.groovy` file contains a method that compares two numbers and returns the larger one. However, if either number is null, a NullPointerException is thrown because Groovy's implicit type handling doesn't gracefully handle null comparisons in this context.

The `bugSolution.groovy` file presents a corrected version that explicitly handles null values, preventing the exception.