CREATE DATABASE transportasi_db;
USE transportasi_db;
CREATE TABLE users (
 id INT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50) NOT NULL,
 password VARCHAR(50) NOT NULL
);
-- Akun untuk tes login
INSERT INTO users (username, password) VALUES ('admin', 'admin123');
CREATE TABLE kendaraan (
 id INT AUTO_INCREMENT PRIMARY KEY,
 plat_nomor VARCHAR(20) NOT NULL,
 jenis VARCHAR(50) NOT NULL,
 merk VARCHAR(50) NOT NULL
);
CREATE TABLE sopir (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nama VARCHAR(100) NOT NULL,
 no_sim VARCHAR(30) NOT NULL,
 no_hp VARCHAR(20) NOT NULL
);
