CREATE TABLE payments ( --create the 3 tables
    customer_name varchar(128), --note: varchar(128) to store tet ie. string
    processed_at date,
    amount int
);

CREATE TABLE balances (
    username varchar(128),
    balance int
);

CREATE TABLE large_table (
    random_int int --note: int means integer numbers (this thread helps know when to use int vs. tinyint vs. bigint etc.: https://stackoverflow.com/questions/43844221/mysql-differences-between-integer-and-varchar)
);
--insert some values (rows of data) into payments
INSERT INTO payments VALUES ('clement', '2019-12-15', 10);
INSERT INTO payments VALUES ('antoine', '2020-01-01', 100);
INSERT INTO payments VALUES ('clement', '2020-01-02', 10);
INSERT INTO payments VALUES ('antoine', '2020-01-02', 100);
INSERT INTO payments VALUES ('antoine', '2020-01-03', 100);
INSERT INTO payments VALUES ('simon', '2020-02-05', 1000);
INSERT INTO payments VALUES ('antoine', '2020-02-01', 100);
INSERT INTO payments VALUES ('clement', '2020-02-03', 10);
INSERT INTO payments VALUES ('meghan', '2020-01-12', 80);
INSERT INTO payments VALUES ('meghan', '2020-01-13', 70);
INSERT INTO payments VALUES ('meghan', '2020-01-14', 90);
INSERT INTO payments VALUES ('alex', '2019-12-11', 10);
INSERT INTO payments VALUES ('clement', '2020-02-01', 10);
INSERT INTO payments VALUES ('marli', '2020-01-18', 10);
INSERT INTO payments VALUES ('alex', '2019-12-15', 10);
INSERT INTO payments VALUES ('marli', '2020-01-25', 10);
INSERT INTO payments VALUES ('marli', '2020-02-02', 10);
--insert some values (rows of data) into balances
INSERT INTO balances VALUES ('antonie', 0);
INSERT INTO balances VALUES ('clement', 1000);
--insert some values (rows of data) into large_table
INSERT INTO large_table (random_int)--'random_int' has yet to be defined... the next 2 lines create this column
SELECT round(random() * 1000000000)
FROM generate_series(1, 500000000) s(i);
--generate_series: https://learn.microsoft.com/en-us/sql/t-sql/functions/generate-series-transact-sql?view=sql-server-ver16
--s(i): idk what this does yet!