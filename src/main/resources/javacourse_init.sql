CREATE TABLE student (
    id integer not null primary key,
    first_name text not null,
    last_name text not null,
    age integer not null
);

/*
 Добавьте данные в таблицу student. Например:
*/
 INSERT INTO student(id, first_name, last_name, age) VALUES
 (1, 'Савелий', 'Петров', 18),
 (2, 'Мария', 'Игнатьева', 23),
 (3, 'Валерий', 'Петров', 12),
 (4, 'Яна', 'Петрова', 34),
 (5, 'Людмила', 'Петрова', 65),
 (6, 'Илья', 'Петров', 5);
