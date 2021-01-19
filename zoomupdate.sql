-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 19 Jan 2021 pada 01.04
-- Versi Server: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `zoom`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `paket`
--

CREATE TABLE `paket` (
  `kode` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `maks_participant` int(20) NOT NULL,
  `durasi` varchar(30) NOT NULL,
  `harga` int(30) NOT NULL,
  `stok` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `paket`
--

INSERT INTO `paket` (`kode`, `nama`, `maks_participant`, `durasi`, `harga`, `stok`) VALUES
('Zoom', 'Zoom', 215, '1 Hari', 50000, 1),
('Zoom1', 'zoom', 300, '2 hari', 30000, 0),
('Zoom2', 'ZoomMurah', 155, '1 Hari', 50000, 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE `pembelian` (
  `ID_Pembelian` int(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Alamat` varchar(30) NOT NULL,
  `NoTelp` varchar(30) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `Tanggal` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembelian`
--

INSERT INTO `pembelian` (`ID_Pembelian`, `Nama`, `Alamat`, `NoTelp`, `kode`, `Tanggal`) VALUES
(1, 'reyhan', 'Indramayu', '081324717062', 'zoom', '24 Januari 2021'),
(2, 'Reihan', 'Bogor', '081324123', 'Zoom2', '25 Januari 2021'),
(3, 'ReyhanDs', 'Indramayu', '081324123', 'Zoom1', '30 Januari 2021'),
(4, 'ReyhanDs1', 'Indramayu', '081324123', 'Zoom1', '30 Januari 2021'),
(5, 'ReyhanDs1', 'Indramayu', '081324123', 'Zoom2', '30 Januari 2022'),
(6, 'ReyhanDs1', 'Indramayu', '08132412334', 'Zoom', '30 Januari 2022'),
(7, 'Rei', 'Indramayu', '0812', 'Zoom2', '121'),
(8, 'testing', 'testing', '123', 'Zoom2', '1'),
(9, 're', 'sa', '2', 'Zoom1', '2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('reyhan', 'razor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `paket`
--
ALTER TABLE `paket`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`ID_Pembelian`),
  ADD KEY `kodebeli` (`kode`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `ID_Pembelian` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `kodebeli` FOREIGN KEY (`kode`) REFERENCES `paket` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
