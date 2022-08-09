create View bill as (select  customer_order.id, customer_order.ticket_code, customer_order.price, customer_order.seating, schedule.start_time as movie_schedule,
    schedule.room, movie.name as movie_name,customer.real_name as partner_name,customer.gender as partner_gender,customer.phone_number as partner_telephone
    , cinema.name as cinema_name
    from customer_order
    left join movie_schedule as schedule ON customer_order.movie_schedule_id=schedule.id
    left join movie ON customer_order.movie_id=movie.id
    left join cinema ON customer_order.cinema_id=cinema.id
    left join pair ON customer_order.user_id=pair.user_id
    left join customer ON pair.partner_id=customer.id
)