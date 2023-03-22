-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2023 at 06:22 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `angajat`
--

CREATE TABLE `angajat` (
  `cod_angajat` int(11) NOT NULL,
  `cnp` bigint(13) NOT NULL,
  `nume` varchar(50) NOT NULL,
  `prenume` varchar(50) NOT NULL,
  `adresa` varchar(100) NOT NULL,
  `telefon` int(10) NOT NULL,
  `salariu` int(11) NOT NULL,
  `data_angajare` date NOT NULL,
  `cod_departament` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `angajat`
--

INSERT INTO `angajat` (`cod_angajat`, `cnp`, `nume`, `prenume`, `adresa`, `telefon`, `salariu`, `data_angajare`, `cod_departament`) VALUES
(1, 1234567890123, 'Gheorghe', 'AFA', 'Galati', 712341234, 1000, '2023-01-01', 1),
(2, 1231231231234, 'Ionescu', 'Adrian', 'Braila', 771231231, 2000, '2022-02-02', 2),
(3, 1, 'a', 'b', 'c', 2, 3, '2020-12-20', 3);

-- --------------------------------------------------------

--
-- Table structure for table `camera`
--

CREATE TABLE `camera` (
  `cod_camera` int(11) NOT NULL,
  `nr_camera` tinyint(1) NOT NULL,
  `etaj` tinyint(1) NOT NULL,
  `tip_camera` varchar(50) NOT NULL,
  `pret` int(11) NOT NULL,
  `cod_rezervare` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `cod_client` int(11) NOT NULL,
  `cnp` bigint(13) NOT NULL,
  `nume` varchar(50) NOT NULL,
  `prenume` varchar(50) NOT NULL,
  `adresa` varchar(100) NOT NULL,
  `telefon` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `departament`
--

CREATE TABLE `departament` (
  `cod_departament` int(11) NOT NULL,
  `nume_departament` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `departament`
--

INSERT INTO `departament` (`cod_departament`, `nume_departament`) VALUES
(1, 'HR');

-- --------------------------------------------------------

--
-- Table structure for table `furnizor`
--

CREATE TABLE `furnizor` (
  `cod_furnizor` int(11) NOT NULL,
  `nume` varchar(50) NOT NULL,
  `adresa` varchar(50) NOT NULL,
  `telefon` int(10) NOT NULL,
  `cod_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rezervare`
--

CREATE TABLE `rezervare` (
  `cod_rezervare` int(11) NOT NULL,
  `data` date NOT NULL,
  `nr_zile` int(11) NOT NULL,
  `cod_client` int(11) NOT NULL,
  `cod_angajat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `angajat`
--
ALTER TABLE `angajat`
  ADD PRIMARY KEY (`cod_angajat`),
  ADD UNIQUE KEY `cod_departament` (`cod_departament`);

--
-- Indexes for table `camera`
--
ALTER TABLE `camera`
  ADD PRIMARY KEY (`cod_camera`),
  ADD UNIQUE KEY `cod_rezervare` (`cod_rezervare`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`cod_client`);

--
-- Indexes for table `departament`
--
ALTER TABLE `departament`
  ADD PRIMARY KEY (`cod_departament`);

--
-- Indexes for table `furnizor`
--
ALTER TABLE `furnizor`
  ADD PRIMARY KEY (`cod_furnizor`),
  ADD UNIQUE KEY `cod_client` (`cod_client`);

--
-- Indexes for table `rezervare`
--
ALTER TABLE `rezervare`
  ADD PRIMARY KEY (`cod_rezervare`),
  ADD UNIQUE KEY `cod_client` (`cod_client`),
  ADD UNIQUE KEY `cod_angajat` (`cod_angajat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `angajat`
--
ALTER TABLE `angajat`
  MODIFY `cod_angajat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `camera`
--
ALTER TABLE `camera`
  MODIFY `cod_camera` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `cod_client` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `departament`
--
ALTER TABLE `departament`
  MODIFY `cod_departament` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `furnizor`
--
ALTER TABLE `furnizor`
  MODIFY `cod_furnizor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rezervare`
--
ALTER TABLE `rezervare`
  MODIFY `cod_rezervare` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
