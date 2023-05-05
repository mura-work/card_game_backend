DROP TABLE IF EXISTS black_jack_histories;
DROP TABLE IF EXISTS player_black_jack_hands;
DROP TABLE IF EXISTS dealer_black_jack_hands;

CREATE TABLE black_jack_histories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    result VARCHAR(255) NOT NULL,
    playing_date_time DATE NOT NULL,
    user_id INT NOT NULL
);

CREATE TABLE player_black_jack_hands (
    id INT PRIMARY KEY AUTO_INCREMENT,
    black_jack_history_id INT NOT NULL,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL
);

CREATE TABLE dealer_black_jack_hands (
    id INT PRIMARY KEY AUTO_INCREMENT,
    black_jack_history_id INT NOT NULL,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL
);

INSERT INTO black_jack_histories (result, playing_date_time, user_id)
VALUES ('WIN', '2023-04-01', 1000);

INSERT INTO player_black_jack_hands (black_jack_history_id, suit, rank)
VALUES (1, 'CLUB', '3');

INSERT INTO dealer_black_jack_hands (black_jack_history_id, suit, rank)
VALUES (1, 'CLUB', 'A');