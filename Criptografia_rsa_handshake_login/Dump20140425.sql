CREATE DATABASE  IF NOT EXISTS `seguranca` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `seguranca`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: seguranca
-- ------------------------------------------------------
-- Server version	5.7.2-m12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mensagem`
--

DROP TABLE IF EXISTS `mensagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensagem` (
  `idMensagem` int(11) NOT NULL,
  `mensagem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idMensagem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensagem`
--

LOCK TABLES `mensagem` WRITE;
/*!40000 ALTER TABLE `mensagem` DISABLE KEYS */;
INSERT INTO `mensagem` VALUES (1001,'Sistema iniciado.'),(1002,'Sistema encerrado.'),(2001,'Autentica√ß√£o etapa 1 iniciada.'),(2002,'Autentica√ß√£o etapa 1 encerrada.'),(2003,'Login name <login_name> identificado com acesso liberado.'),(2004,'Login name <login_name> identificado com acesso bloqueado.'),(2005,'Login name <login_name> n√£o identificado.'),(3001,'Autentica√ß√£o etapa 2 iniciada para <login_name>.'),(3002,'Autentica√ß√£o etapa 2 encerrada para <login_name>.'),(3003,'Senha pessoal verificada positivamente para <login_name>.'),(3004,'Senha pessoal verificada negativamente para <login_name>.'),(3005,'Primeiro erro da senha pessoal contabilizado para <login_name>.'),(3006,'Segundo erro da senha pessoal contabilizado para <login_name>.'),(3007,'Terceiro erro da senha pessoal contabilizado para <login_name>.'),(3008,'Acesso do usuario <login_name> bloqueado pela autentica√ß√£o etapa 2.'),(4001,'Autentica√ß√£o etapa 3 iniciada para <login_name>.'),(4002,'Autentica√ß√£o etapa 3 encerrada para <login_name>.'),(4003,'Chave privada verificada positivamente para <login_name>.'),(4004,'Primeiro erro de chave privada contabilizado para <login_name>.'),(4005,'Segundo erro de chave privada contabilizado para <login_name>.'),(4006,'Terceiro erro de chave privada contabilizado para <login_name>.'),(4007,'Acesso do usuario <login_name> bloqueado pela autentica√ß√£o etapa 3.'),(5001,'Tela principal apresentada para <login_name>.'),(5002,'Op√ß√£o 1 do menu principal selecionada por <login_name>.'),(5003,'Op√ß√£o 2 do menu principal selecionada por <login_name>.'),(5004,'Op√ß√£o 3 do menu principal selecionada por <login_name>.'),(5005,'Op√ß√£o 4 do menu principal selecionada por <login_name>.'),(6001,'Tela de cadastro apresentada para <login_name>.'),(6002,'Bot√£o cadastrar pressionado por <login_name>.'),(6003,'Bot√£o voltar de cadastrar para o menu principal pressionado por <login_name>.'),(7001,'Tela de altera√ß√£o apresentada para <login_name>.'),(7002,'Bot√£o alterar pressionado por <login_name>.'),(7003,'Bot√£o voltar de alterar para o menu principal pressionado por <login_name>.'),(8001,'Tela de consulta apresentada para <login_name>.'),(8002,'Bot√£o voltar de consultar para o menu principal pressionado por <login_name>.'),(8003,'Arquivo <arq_name> selecionado por <login_name> para decripta√ß√£o,'),(8004,'Arquivo <arq_name> decriptado com sucesso para <login_name>.'),(8005,'Arquivo <arq_name> verificado com sucesso para <login_name>.'),(8006,'Falha na decripta√ß√£o do arquivo <arq_name> para <login_name>.'),(8007,'Falha na verifica√ß√£o do arquivo <arq_name> para <login_name>.'),(9001,'Tela de sa√≠da apresentada para <login_name>.'),(9002,'Bot√£o sair pressionado por <login_name>.'),(9003,'Bot√£o voltar de sair para o menu principal pressionado por <login_name>.'),(9004,'Arquivos decriptados apagados com sucesso para <login_name>.'),(9005,'Arquivo decriptado <nome_arquivo> n√£o p√¥de ser apagado para <login_name>.');
/*!40000 ALTER TABLE `mensagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registro` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `arquivo` varchar(255) DEFAULT NULL,
  `dataRegistro` datetime DEFAULT NULL,
  `idMensagem` int(11) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `auxLogin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`)
) ENGINE=InnoDB AUTO_INCREMENT=1835 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1641,NULL,'2014-04-25 11:01:09',1001,0,NULL),(1642,NULL,'2014-04-25 11:01:10',2001,0,NULL),(1643,NULL,'2014-04-25 11:03:03',1001,0,NULL),(1644,NULL,'2014-04-25 11:03:04',2001,0,NULL),(1645,NULL,'2014-04-25 11:03:49',2003,1,NULL),(1646,NULL,'2014-04-25 11:03:49',2002,1,NULL),(1647,NULL,'2014-04-25 11:03:50',3001,1,NULL),(1648,NULL,'2014-04-25 11:04:34',3002,1,NULL),(1649,NULL,'2014-04-25 11:04:35',3003,1,NULL),(1650,NULL,'2014-04-25 11:04:35',4001,1,NULL),(1651,NULL,'2014-04-25 11:05:03',4003,1,NULL),(1652,NULL,'2014-04-25 11:05:03',5001,1,NULL),(1653,NULL,'2014-04-25 11:05:08',5003,1,NULL),(1654,NULL,'2014-04-25 11:05:08',8001,1,NULL),(1655,'ArquivoTeste.txt','2014-04-25 11:05:39',8003,1,NULL),(1656,'ArquivoTeste.txt','2014-04-25 11:05:39',8005,1,NULL),(1657,'ArquivoTeste.txt','2014-04-25 11:05:39',8004,1,NULL),(1658,NULL,'2014-04-25 11:11:19',1001,0,NULL),(1659,NULL,'2014-04-25 11:11:20',2001,0,NULL),(1660,NULL,'2014-04-25 11:11:46',2003,1,NULL),(1661,NULL,'2014-04-25 11:11:46',2002,1,NULL),(1662,NULL,'2014-04-25 11:11:46',3001,1,NULL),(1663,NULL,'2014-04-25 11:11:57',3002,1,NULL),(1664,NULL,'2014-04-25 11:11:57',3003,1,NULL),(1665,NULL,'2014-04-25 11:11:57',4001,1,NULL),(1666,NULL,'2014-04-25 11:12:14',4003,1,NULL),(1667,NULL,'2014-04-25 11:12:14',5001,1,NULL),(1668,NULL,'2014-04-25 11:12:15',5003,1,NULL),(1669,NULL,'2014-04-25 11:12:15',8001,1,NULL),(1670,'ArquivoTeste.txt','2014-04-25 11:12:39',8003,1,NULL),(1671,'ArquivoTeste.txt','2014-04-25 11:12:40',8005,1,NULL),(1672,'ArquivoTeste.txt','2014-04-25 11:12:40',8004,1,NULL),(1673,NULL,'2014-04-25 11:17:20',1001,0,NULL),(1674,NULL,'2014-04-25 11:17:20',2001,0,NULL),(1675,NULL,'2014-04-25 11:17:55',2003,1,NULL),(1676,NULL,'2014-04-25 11:17:55',2002,1,NULL),(1677,NULL,'2014-04-25 11:17:55',3001,1,NULL),(1678,NULL,'2014-04-25 11:18:04',3002,1,NULL),(1679,NULL,'2014-04-25 11:18:04',3003,1,NULL),(1680,NULL,'2014-04-25 11:18:04',4001,1,NULL),(1681,NULL,'2014-04-25 11:18:17',4003,1,NULL),(1682,NULL,'2014-04-25 11:18:17',5001,1,NULL),(1683,NULL,'2014-04-25 11:18:18',5003,1,NULL),(1684,NULL,'2014-04-25 11:18:18',8001,1,NULL),(1685,'ArquivoTeste.txt','2014-04-25 11:18:37',8003,1,NULL),(1686,'ArquivoTeste.txt','2014-04-25 11:18:37',8005,1,NULL),(1687,'ArquivoTeste.txt','2014-04-25 11:18:37',8004,1,NULL),(1688,NULL,'2014-04-25 11:20:56',1001,0,NULL),(1689,NULL,'2014-04-25 11:20:56',2001,0,NULL),(1690,NULL,'2014-04-25 11:21:05',2003,1,NULL),(1691,NULL,'2014-04-25 11:21:05',2002,1,NULL),(1692,NULL,'2014-04-25 11:21:05',3001,1,NULL),(1693,NULL,'2014-04-25 11:21:15',3002,1,NULL),(1694,NULL,'2014-04-25 11:21:15',3003,1,NULL),(1695,NULL,'2014-04-25 11:21:15',4001,1,NULL),(1696,NULL,'2014-04-25 11:21:29',4003,1,NULL),(1697,NULL,'2014-04-25 11:21:29',5001,1,NULL),(1698,NULL,'2014-04-25 11:21:30',5003,1,NULL),(1699,NULL,'2014-04-25 11:21:30',8001,1,NULL),(1700,'ArquivoTeste.txt','2014-04-25 11:21:41',8003,1,NULL),(1701,'ArquivoTeste.txt','2014-04-25 11:21:41',8005,1,NULL),(1702,'ArquivoTeste.txt','2014-04-25 11:21:41',8004,1,NULL),(1703,NULL,'2014-04-25 11:41:01',1001,0,NULL),(1704,NULL,'2014-04-25 11:41:01',2001,0,NULL),(1705,NULL,'2014-04-25 11:42:04',1001,0,NULL),(1706,NULL,'2014-04-25 11:42:04',2001,0,NULL),(1707,NULL,'2014-04-25 11:42:45',2003,1,NULL),(1708,NULL,'2014-04-25 11:42:45',2002,1,NULL),(1709,NULL,'2014-04-25 11:42:45',3001,1,NULL),(1710,NULL,'2014-04-25 11:42:56',3002,1,NULL),(1711,NULL,'2014-04-25 11:42:56',3003,1,NULL),(1712,NULL,'2014-04-25 11:42:56',4001,1,NULL),(1713,NULL,'2014-04-25 11:43:15',4003,1,NULL),(1714,NULL,'2014-04-25 11:43:15',5001,1,NULL),(1715,NULL,'2014-04-25 11:43:16',5003,1,NULL),(1716,NULL,'2014-04-25 11:43:16',8001,1,NULL),(1717,'ArquivoTeste.txt','2014-04-25 11:43:25',8003,1,NULL),(1718,'ArquivoTeste.txt','2014-04-25 11:43:25',8005,1,NULL),(1719,'ArquivoTeste.txt','2014-04-25 11:43:25',8004,1,NULL),(1720,NULL,'2014-04-25 11:44:27',1001,0,NULL),(1721,NULL,'2014-04-25 11:44:27',2001,0,NULL),(1722,NULL,'2014-04-25 11:44:39',2003,1,NULL),(1723,NULL,'2014-04-25 11:44:39',2002,1,NULL),(1724,NULL,'2014-04-25 11:44:39',3001,1,NULL),(1725,NULL,'2014-04-25 11:44:50',3002,1,NULL),(1726,NULL,'2014-04-25 11:44:50',3003,1,NULL),(1727,NULL,'2014-04-25 11:44:50',4001,1,NULL),(1728,NULL,'2014-04-25 11:45:04',4003,1,NULL),(1729,NULL,'2014-04-25 11:45:04',5001,1,NULL),(1730,NULL,'2014-04-25 11:45:05',5003,1,NULL),(1731,NULL,'2014-04-25 11:45:05',8001,1,NULL),(1732,'ArquivoTeste.txt','2014-04-25 11:45:15',8003,1,NULL),(1733,'ArquivoTeste.txt','2014-04-25 11:45:15',8005,1,NULL),(1734,'ArquivoTeste.txt','2014-04-25 11:45:15',8004,1,NULL),(1735,NULL,'2014-04-25 11:55:01',1001,0,NULL),(1736,NULL,'2014-04-25 11:55:01',2001,0,NULL),(1737,NULL,'2014-04-25 11:55:36',2003,1,NULL),(1738,NULL,'2014-04-25 11:55:36',2002,1,NULL),(1739,NULL,'2014-04-25 11:55:36',3001,1,NULL),(1740,NULL,'2014-04-25 11:55:45',3002,1,NULL),(1741,NULL,'2014-04-25 11:55:45',3003,1,NULL),(1742,NULL,'2014-04-25 11:55:45',4001,1,NULL),(1743,NULL,'2014-04-25 11:56:57',1001,0,NULL),(1744,NULL,'2014-04-25 11:56:57',2001,0,NULL),(1745,NULL,'2014-04-25 12:33:32',1001,0,NULL),(1746,NULL,'2014-04-25 12:33:32',2001,0,NULL),(1747,NULL,'2014-04-25 12:38:53',1001,0,NULL),(1748,NULL,'2014-04-25 12:38:53',2001,0,NULL),(1749,NULL,'2014-04-25 12:39:48',2003,1,NULL),(1750,NULL,'2014-04-25 12:39:48',2002,1,NULL),(1751,NULL,'2014-04-25 12:39:48',3001,1,NULL),(1752,NULL,'2014-04-25 12:39:56',3002,1,NULL),(1753,NULL,'2014-04-25 12:39:56',3003,1,NULL),(1754,NULL,'2014-04-25 12:39:56',4001,1,NULL),(1755,NULL,'2014-04-25 12:41:30',1001,0,NULL),(1756,NULL,'2014-04-25 12:41:31',2001,0,NULL),(1757,NULL,'2014-04-25 12:48:40',1001,0,NULL),(1758,NULL,'2014-04-25 12:48:41',2001,0,NULL),(1759,NULL,'2014-04-25 13:00:37',1001,0,NULL),(1760,NULL,'2014-04-25 13:00:38',2001,0,NULL),(1761,NULL,'2014-04-25 13:02:58',1001,0,NULL),(1762,NULL,'2014-04-25 13:02:58',2001,0,NULL),(1763,NULL,'2014-04-25 13:03:16',2003,1,NULL),(1764,NULL,'2014-04-25 13:03:16',2002,1,NULL),(1765,NULL,'2014-04-25 13:03:16',3001,1,NULL),(1766,NULL,'2014-04-25 13:03:38',1001,0,NULL),(1767,NULL,'2014-04-25 13:03:39',2001,0,NULL),(1768,NULL,'2014-04-25 13:05:04',1001,0,NULL),(1769,NULL,'2014-04-25 13:05:05',2001,0,NULL),(1770,NULL,'2014-04-25 13:15:11',1001,0,NULL),(1771,NULL,'2014-04-25 13:15:12',2001,0,NULL),(1772,NULL,'2014-04-25 13:16:50',1001,0,NULL),(1773,NULL,'2014-04-25 13:16:50',2001,0,NULL),(1774,NULL,'2014-04-25 13:17:38',1001,0,NULL),(1775,NULL,'2014-04-25 13:17:39',2001,0,NULL),(1776,NULL,'2014-04-25 13:18:03',1001,0,NULL),(1777,NULL,'2014-04-25 13:18:03',2001,0,NULL),(1778,NULL,'2014-04-25 13:21:03',1001,0,NULL),(1779,NULL,'2014-04-25 13:21:03',2001,0,NULL),(1780,NULL,'2014-04-25 13:21:26',2003,1,NULL),(1781,NULL,'2014-04-25 13:21:26',2002,1,NULL),(1782,NULL,'2014-04-25 13:21:26',3001,1,NULL),(1783,NULL,'2014-04-25 13:21:51',3002,1,NULL),(1784,NULL,'2014-04-25 13:21:51',3003,1,NULL),(1785,NULL,'2014-04-25 13:21:51',4001,1,NULL),(1786,NULL,'2014-04-25 13:22:04',4003,1,NULL),(1787,NULL,'2014-04-25 13:22:04',5001,1,NULL),(1788,NULL,'2014-04-25 13:22:05',5003,1,NULL),(1789,NULL,'2014-04-25 13:22:05',8001,1,NULL),(1790,'ArquivoTeste.txt','2014-04-25 13:22:13',8003,1,NULL),(1791,'ArquivoTeste.txt','2014-04-25 13:22:13',8005,1,NULL),(1792,'ArquivoTeste.txt','2014-04-25 13:22:13',8004,1,NULL),(1793,NULL,'2014-04-25 13:22:15',8002,1,NULL),(1794,NULL,'2014-04-25 13:22:15',5001,1,NULL),(1795,NULL,'2014-04-25 13:22:16',5005,1,NULL),(1796,NULL,'2014-04-25 13:22:16',9001,1,NULL),(1797,NULL,'2014-04-25 13:22:18',9002,1,NULL),(1798,NULL,'2014-04-25 13:22:18',1002,1,NULL),(1799,NULL,'2014-04-25 13:22:18',9004,1,NULL),(1800,NULL,'2014-04-25 13:39:27',1001,0,NULL),(1801,NULL,'2014-04-25 13:39:27',2001,0,NULL),(1802,NULL,'2014-04-25 13:40:29',1001,0,NULL),(1803,NULL,'2014-04-25 13:40:29',2001,0,NULL),(1804,NULL,'2014-04-25 13:43:52',1001,0,NULL),(1805,NULL,'2014-04-25 13:43:53',2001,0,NULL),(1806,NULL,'2014-04-25 13:48:38',1001,0,NULL),(1807,NULL,'2014-04-25 13:48:39',2001,0,NULL),(1808,NULL,'2014-04-25 13:49:31',2003,1,NULL),(1809,NULL,'2014-04-25 13:49:31',2002,1,NULL),(1810,NULL,'2014-04-25 13:49:31',3001,1,NULL),(1811,NULL,'2014-04-25 13:50:24',1001,0,NULL),(1812,NULL,'2014-04-25 13:50:24',2001,0,NULL),(1813,NULL,'2014-04-25 13:51:06',1001,0,NULL),(1814,NULL,'2014-04-25 13:51:06',2001,0,NULL),(1815,NULL,'2014-04-25 14:24:25',1001,0,NULL),(1816,NULL,'2014-04-25 14:24:26',2001,0,NULL),(1817,NULL,'2014-04-25 14:24:39',2003,1,NULL),(1818,NULL,'2014-04-25 14:24:39',2002,1,NULL),(1819,NULL,'2014-04-25 14:24:39',3001,1,NULL),(1820,NULL,'2014-04-25 15:08:24',1001,0,NULL),(1821,NULL,'2014-04-25 15:08:25',2001,0,NULL),(1822,NULL,'2014-04-25 15:09:06',2003,1,NULL),(1823,NULL,'2014-04-25 15:09:06',2002,1,NULL),(1824,NULL,'2014-04-25 15:09:06',3001,1,NULL),(1825,NULL,'2014-04-25 15:09:17',3002,1,NULL),(1826,NULL,'2014-04-25 15:09:17',3003,1,NULL),(1827,NULL,'2014-04-25 15:09:17',4001,1,NULL),(1828,NULL,'2014-04-25 15:12:22',4003,1,NULL),(1829,NULL,'2014-04-25 15:12:22',5001,1,NULL),(1830,NULL,'2014-04-25 15:12:23',5003,1,NULL),(1831,NULL,'2014-04-25 15:12:23',8001,1,NULL),(1832,'ArquivoTeste.txt','2014-04-25 15:12:34',8003,1,NULL),(1833,'ArquivoTeste.txt','2014-04-25 15:12:34',8005,1,NULL),(1834,'ArquivoTeste.txt','2014-04-25 15:12:34',8004,1,NULL);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `acessoBloqueado` tinyint(1) DEFAULT NULL,
  `caminhoToken` varchar(255) DEFAULT NULL,
  `chavePublica` blob,
  `data_bloqueio` datetime DEFAULT NULL,
  `descricaoUsuario` varchar(255) DEFAULT NULL,
  `fraseSecreta` varchar(255) DEFAULT NULL,
  `grupo` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nomeUsuario` varchar(255) DEFAULT NULL,
  `salt` int(11) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `tentativas_senha` int(11) DEFAULT NULL,
  `totalAcessos` int(11) DEFAULT NULL,
  `totalAcessosUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,0,NULL,'0Åü0\r	*ÜHÜ˜\r\0Åç\00ÅâÅÅ\0õ§˜6Ô$»€ãhSP$òsûÑ|º˜I∏ëY≥|ÍGbmıçIjì…ÒYd∑MoKf˚¢€xöQe¨íi!—#˝ôe:›êªüÿ\'O∆∑!!ˆ$ò1*ÆiÍ°+µÚ˜∞¨≥∑hÿ¸Ÿkÿ=∆U€πw„îyÇó—<ãø®M5\0',NULL,'minha senha eh 149418. Testar userpriv','segredo','ADMIN','mica','Michelle Rodrigues',821855936,'aeed74a21eb2ddd897c2736185d994a4',2,NULL,NULL),(2,0,NULL,'0Åü0\r	*ÜHÜ˜\r\0Åç\00ÅâÅÅ\0õ§˜6Ô$»€ãhSP$òsûÑ|º˜I∏ëY≥|ÍGbmıçIjì…ÒYd∑MoKf˚¢€xöQe¨íi!—#˝ôe:›êªüÿ\'O∆∑!!ˆ$ò1*ÆiÍ°+µÚ˜∞¨≥∑hÿ¸Ÿkÿ=∆U€πw„îyÇó—<ãø®M5\0',NULL,'aline senha 1111',NULL,'USER','aline','Aline Moraes',260357400,'b8682d8ca2573f961e47328a288fc19e',0,NULL,NULL),(3,0,NULL,'0Åü0\r	*ÜHÜ˜\r\0Åç\00ÅâÅÅ\0õ§˜6Ô$»€ãhSP$òsûÑ|º˜I∏ëY≥|ÍGbmıçIjì…ÒYd∑MoKf˚¢€xöQe¨íi!—#˝ôe:›êªüÿ\'O∆∑!!ˆ$ò1*ÆiÍ°+µÚ˜∞¨≥∑hÿ¸Ÿkÿ=∆U€πw„îyÇó—<ãø®M5\0',NULL,'aline senha 123456',NULL,'USER','aline2','Aline Santos',786416410,'268617192bbb5f3662025fb8c006a5e9',0,NULL,NULL),(4,0,NULL,'0Åü0\r	*ÜHÜ˜\r\0Åç\00ÅâÅÅ\0õ§˜6Ô$»€ãhSP$òsûÑ|º˜I∏ëY≥|ÍGbmıçIjì…ÒYd∑MoKf˚¢€xöQe¨íi!—#˝ôe:›êªüÿ\'O∆∑!!ˆ$ò1*ÆiÍ°+µÚ˜∞¨≥∑hÿ¸Ÿkÿ=∆U€πw„îyÇó—<ãø®M5\0',NULL,'grupo selecione mica 3 senha 231212',NULL,'USER','mica3','aline SAntos',807046997,'fc0c76157d5c5556c1fc32214f66efca',0,NULL,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-25 15:21:27
