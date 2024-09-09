# Assignment_Indexing_v4.pdf

## Task 1

![alt text](image.png)

You can verify the existance of and index by running the SHOW INDEX command
on a specified table or database. The command will return a list of indexes.

## Task 2

![alt text](image-2.png)
![alt text](image-1.png)

The EXPLAIN command in SQL is used to analyze and provide information about how a specific SQL query will be executed by the database engine. It helps in understanding the execution plan and performance of the query.

## Task 3

The `FORCE INDEX` tells the query optimizer to use the specified index for the query.

![alt text](image-3.png)

The `USE INDEX` suggests to the query optimizer to consider the specified indexes when executing the query. It does not force the optimizer to use the index.

![alt text](image-4.png)

The `IGNORE INDEX` tells the query optimizer to ignore the specified indexes when executing the query.

![alt text](image-5.png)

![alt text](image-6.png)

## Task 4

![alt text](image-7.png)

![alt text](image-8.png)

Adding the force tag to the query.

![alt text](image-9.png)

The index has no effect on the query time.

## Task 5

(Side note! The query example for creating the index is plainly wrong)

Creating the index.

![alt text](image-10.png)

Index with length of 2

![alt text](image-13.png)

Index with length of 4

![alt text](image-14.png)

Index with length of 6

![alt text](image-15.png)

Index with length of 8

![alt text](image-16.png)

The first 6 characters seems to be enough for the index to be as effective as possible.

## Task 6

(Side note! There is no such variable as "slow_queries_log" in MySQL)

Cant be assed to debug the log file.