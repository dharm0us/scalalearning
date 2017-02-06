val n = 10
for(i <- 1 to n) println(i)
for(c <- "Hello") println(c)

//arrow expressions are called generators

//multiple generators
for(i <- 1 to 3; j <- 1 to 3) print((10*i + j) + " ")

//guards
for(i <- 1 to 3; j <- 1 to 3 if i!= j) print((10*i + j) + " ")

//collecting values from the for loop
for(i <- 1 to 3; j <- 1 to 3 if i!= j) yield i
