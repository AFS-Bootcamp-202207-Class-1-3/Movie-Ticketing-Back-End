create View order_detail as (select  customer_order.id, customer_order.price, customer_order.is_pay, customer_order.seating,
    schedule.start_time as movie_schedule,schedule.room, movie.name as movie_name,customer.real_name as user_name
    from customer_order
    left join movie_schedule as schedule ON customer_order.movie_schedule_id=schedule.id
    left join movie ON customer_order.movie_id=movie.id
    left join customer ON customer_order.user_id=customer.id
)