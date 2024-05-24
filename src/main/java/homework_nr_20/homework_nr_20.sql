create table books(
book_id serial primary key,
name text,
author text,
date_of_publishing date,
genre text,
avaible_count int
);

insert into books  ("name",author,date_of_publishing,genre,avaible_count)
values('The Great Gatsby', 'F. Scott Fitzgerald', '1925-01-01', 'Classics', 3),
('To Kill a Mockingbird', 'Harper Lee', '1960-01-01', 'Fiction', 5),
('1984', 'George Orwell', '1949-01-01', 'Science Fiction', 2),
('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);

select *
from books;

-- END HOMEWORK_NR_19
--########################################################################

create table leased_books (
book_leased_id serial primary key,
book_id int references books (book_id),
name text,
surname text,
date_of_lease date,
date_of_return date
);

insert into leased_books (book_id,"name",surname,date_of_lease,date_of_return)
values
(1,'Andrei','Guzun','2024-07-01','2024-07-10'),
(2,'Vasile','Busmachiu','2024-07-05',null),
(3,'Amedeea','Hincu','2024-07-11','2024-07-22'),
(4,'Evelina','Croitoru','2024-07-18','2024-07-28');

select *
from leased_books lb ;

--Книги, которые не были взяты в прокат
select *
from books b
where book_id not in (select book_id from leased_books lb);

--Все книги с информацией о аренде
select b.*,lb.date_of_lease , lb.date_of_return
from books b
left join leased_books lb on b.book_id  = lb.book_id ;

--Имя, фамилия, date_of_return (при условии, что ни одна запись не была NULL)
select name , surname ,date_of_return
from leased_books lb
where date_of_return is not null ;

--Имя, фамилия, date_of_return (при условии, что ни одна запись не была NULL) // Запрос с условием на имя Amedeea xD
select name , surname ,date_of_return
from leased_books lb
where date_of_return is not null
and name like 'A%e%e%';