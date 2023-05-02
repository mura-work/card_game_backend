DROP TABLE IF EXISTS test;

CREATE TABLE test (
    id INT PRIMARY KEY AUTO_INCREMENT,
    result VARCHAR(255) NOT NULL,
    player_hands JSON,
    dealer_hands JSON,
    playing_date_time DATE NOT NULL,
    user_id INT NOT NULL
);

INSERT INTO test (result, player_hands, dealer_hands, playing_date_time, user_id)
VALUES ('WIN', null, null, '2023-04-01', 1000);