DROP TABLE IF EXISTS player_black_jack_hands;
DROP TABLE IF EXISTS dealer_black_jack_hands;
DROP TABLE IF EXISTS black_jack_histories;

CREATE TABLE black_jack_histories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    result VARCHAR(255) NOT NULL,
    playing_date_time DATE NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE player_black_jack_hands (
    id INT PRIMARY KEY AUTO_INCREMENT,
    black_jack_history_id INT NOT NULL,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (black_jack_history_id) REFERENCES black_jack_histories(id)
);

CREATE TABLE dealer_black_jack_hands (
    id INT PRIMARY KEY AUTO_INCREMENT,
    black_jack_history_id INT NOT NULL,
    suit VARCHAR(255) NOT NULL,
    rank VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (black_jack_history_id) REFERENCES black_jack_histories(id)
);

INSERT INTO black_jack_histories (result, playing_date_time, user_id)
VALUES ('WIN', '2023-04-01', 1000);

INSERT INTO player_black_jack_hands (suit, rank, black_jack_history_id)
VALUES ('CLUB', '3', 1);

INSERT INTO dealer_black_jack_hands (suit, rank, black_jack_history_id)
VALUES ('CLUB', 'A', 1);