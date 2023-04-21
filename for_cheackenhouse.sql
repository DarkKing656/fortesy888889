-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 21, 2023 at 08:36 PM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `for_cheackenhouse`
--

-- --------------------------------------------------------

--
-- Table structure for table `cheaken`
--

CREATE TABLE `cheaken` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cheaken_house`
--

CREATE TABLE `cheaken_house` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cheaken_house`
--

INSERT INTO `cheaken_house` (`id`, `name`) VALUES
(302, 'fgff-gggg--66'),
(352, 'GHg=hhhh-hhh');

-- --------------------------------------------------------

--
-- Table structure for table `cheaken_house_seq`
--

CREATE TABLE `cheaken_house_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cheaken_house_seq`
--

INSERT INTO `cheaken_house_seq` (`next_val`) VALUES
(451);

-- --------------------------------------------------------

--
-- Table structure for table `cheaken_seq`
--

CREATE TABLE `cheaken_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cheaken_seq`
--

INSERT INTO `cheaken_seq` (`next_val`) VALUES
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cheaken`
--
ALTER TABLE `cheaken`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cheaken_house`
--
ALTER TABLE `cheaken_house`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
