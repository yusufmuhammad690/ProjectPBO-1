-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 19, 2021 at 04:14 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `datajne`
--

CREATE TABLE `datajne` (
  `noresi` int(20) NOT NULL,
  `namapenerima` varchar(100) NOT NULL,
  `nohp` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jenisbarang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datajne`
--

INSERT INTO `datajne` (`noresi`, `namapenerima`, `nohp`, `alamat`, `jenisbarang`) VALUES
(1, 'muhammad', '93242', 'asda', 'dasfa'),
(2, 'muhammad yusuf', '85369067', 'kota raman', 'kaca'),
(223, 'muhammad ronal', '085369067474', 'raman utar', 'bonkea'),
(123123, 'muh', '1234', 'asd', 'asd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datajne`
--
ALTER TABLE `datajne`
  ADD PRIMARY KEY (`noresi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
