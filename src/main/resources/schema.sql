## postgresqlのログイン方法
psql -U card_game_backend -d card_game_backend;

DROP TABLE IF EXISTS player_black_jack_hands;
DROP TABLE IF EXISTS dealer_black_jack_hands;
DROP TABLE IF EXISTS black_jack_histories;

CREATE TABLE black_jack_histories (
    id SERIAL PRIMARY KEY,
    result VARCHAR(255) NOT NULL,
    playing_date_time DATE NOT NULL,
    user_id INT NOT NULL,
    total_point INT NOT NULL,
    point_difference INT NOT NULL
);

CREATE TABLE player_black_jack_hands (
    id SERIAL PRIMARY KEY,
    black_jack_history_id INT,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL,
    image_id INT NOT NULL,
    FOREIGN KEY (black_jack_history_id) REFERENCES black_jack_histories(id)
);

CREATE TABLE dealer_black_jack_hands (
    id SERIAL PRIMARY KEY,
    black_jack_history_id INT,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL,
    image_id INT NOT NULL,
    FOREIGN KEY (black_jack_history_id) REFERENCES black_jack_histories(id)
);

INSERT INTO black_jack_histories (id, result, playing_date_time, user_id, total_point, point_difference)
VALUES (1, 'WIN', '2023-04-01', 1000,  100, 10);

INSERT INTO player_black_jack_hands (id, black_jack_history_id, suit, rank, image_id)
VALUES (1, 1, 'Spades', '3', 3);

INSERT INTO dealer_black_jack_hands (id, black_jack_history_id, suit, rank, image_id)
VALUES (1, 1, 'Spades', 'A', 1);
