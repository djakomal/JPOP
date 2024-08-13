use JPOP;
CREATE DATABASE JPOP;
#SELECT * FROM roles;
#SELECT * FROM User;
#SHOW TABLES;
#drop  database P302;

-----------------------------------------------
-- Insert ROLE_USER if it does not exist
#INSERT INTO roles (name)
#SELECT 'ROLE_USER'
#WHERE NOT EXISTS (SELECT 1 FROM roles WHERE name = 'ROLE_USER');

-- Insert ROLE_MODERATOR if it does not exist
#INSERT INTO roles (name)
#SELECT 'ROLE_MODERATOR'
#WHERE NOT EXISTS (SELECT 1 FROM roles WHERE name = 'ROLE_MODERATOR');


#INSERT INTO Admin (id, confirmation_token, username, enabled, first_name, gender, last_name, lastseen, password, authority)
#VALUES (1, '12345678-1234-1234-1234-123456789012', 'andre', 1, 'Andre', 'Male', 'LastName', '2024-07-08', 'password123', 'ROLE_USER');



-----------------------------------------------------------------

