create table Plan(
plan_id numeric primary key,
rate numeric
);

insert into Plan values(1,100);
insert into Plan values(2,200);

use app_plan;
select * from Plan;

use app_customer;
select * from customer;
delete from customer;

use app_friend;
select * from friend;
delete from friend;