# harj_lukot_v2.pdf

## Task 1

![alt text](image.png)

![alt text](image-1.png)

The second connection is able to read the data
because the lock allows read.

![alt text](image-2.png)

The update is not possible because the lock does not allow write.

![alt text](image-3.png)

After unlocking the tables the query is able to update the data.

## Task 2

![alt text](image-4.png)

![alt text](image-5.png)

The read hangs.

![alt text](image-6.png)

After unlocking the tables the query is able to read the data with the interest added.
The lock stopped the query from reading the data.

## Task 3

![alt text](image-7.png)

![alt text](image-8.png)

The update hangs.

![alt text](image-9.png)

The update is possible after committing the transaction.

The update hangs because the tables are write locked.

## Task 4

