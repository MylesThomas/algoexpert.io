/*
Powerful Queries
*/

-- 1. Sum the number of payments for each user.
SELECT customer_name, count(*)
FROM payments
GROUP BY customer_name
ORDER BY count DESC;

-- 2. Sum the payment amounts for each month: 
SELECT sum(amount), extract(year from processed_at) as year, extract(month from processed_at) as month
FROM payments
GROUP BY month, year
ORDER BY sum DESC;

-- 3. Sum the payment amounts for each month for each user.
SELECT customer_name, sum(amount), extract(year from processed_at) as year, extract(month from processed_at) as month
FROM payments
GROUP BY customer_name, month, year
ORDER BY customer_name DESC;

-- 4. Find the largest single-user payments for each month
SELECT max(amount), year, month
FROM (
    SELECT customer_name, sum(amount) as amount, extract(year from processed_at) as year, extract(month from processed_at) as month
    FROM payments
    GROUP BY customer_name, month, year
) AS monthly_sums
GROUP BY year, month;


/*
Transactions
*/

-- 0. I added this: basic query to simply view the table
SELECT * FROM balances;

-- 1. Transfer 100 from Clement to Antoine.
BEGIN TRANSACTION;
UPDATE balances set balance = balance - 100 WHERE username = 'clement';
UPDATE balances set balance = balance + 100 WHERE username = 'antoine';
COMMIT;


/*
Database Indexes
*/

-- 1. Find the 10 largest ints.
SELECT * 
FROM large_table
ORDER BY random_int
DESC LIMIT 10;

-- 2. Create an index on the ints in the table.
CREATE INDEX large_table_random_int_idx
ON large_table(random_int);

-- 3. Repeat #1 and see how much faster it is!