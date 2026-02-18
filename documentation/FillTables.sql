INSERT INTO category(category) VALUES('plot'), ('acting'), ('visuals');
INSERT INTO movie(title) VALUES('Up'), ('Inception'), ('Arrival');
INSERT INTO cinema_user(username, password) VALUES('Rasmus', '123'), ('Lennart', '456');
INSERT INTO voting(user_id, movie_id) VALUES(1, 2);
INSERT INTO rating(movie_id, user_id) VALUES(1, 1), (2, 1), (1,2), (2, 2);
INSERT INTO rating_category(rating_id, category_id, value) VALUES(1, 1, 10), (1, 2, 7), (3, 1, 5), (3, 2, 7);
