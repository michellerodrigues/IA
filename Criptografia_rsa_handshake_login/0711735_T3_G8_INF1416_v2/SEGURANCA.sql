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
INSERT INTO `mensagem` VALUES (1001,'Sistema iniciado.'),(1002,'Sistema encerrado.'),(2001,'Autenticação etapa 1 iniciada.'),(2002,'Autenticação etapa 1 encerrada.'),(2003,'Login name <login_name> identificado com acesso liberado.'),(2004,'Login name <login_name> identificado com acesso bloqueado.'),(2005,'Login name <login_name> não identificado.'),(3001,'Autenticação etapa 2 iniciada para <login_name>.'),(3002,'Autenticação etapa 2 encerrada para <login_name>.'),(3003,'Senha pessoal verificada positivamente para <login_name>.'),(3004,'Senha pessoal verificada negativamente para <login_name>.'),(3005,'Primeiro erro da senha pessoal contabilizado para <login_name>.'),(3006,'Segundo erro da senha pessoal contabilizado para <login_name>.'),(3007,'Terceiro erro da senha pessoal contabilizado para <login_name>.'),(3008,'Acesso do usuario <login_name> bloqueado pela autenticação etapa 2.'),(4001,'Autenticação etapa 3 iniciada para <login_name>.'),(4002,'Autenticação etapa 3 encerrada para <login_name>.'),(4003,'Chave privada verificada positivamente para <login_name>.'),(4004,'Primeiro erro de chave privada contabilizado para <login_name>.'),(4005,'Segundo erro de chave privada contabilizado para <login_name>.'),(4006,'Terceiro erro de chave privada contabilizado para <login_name>.'),(4007,'Acesso do usuario <login_name> bloqueado pela autenticação etapa 3.'),(5001,'Tela principal apresentada para <login_name>.'),(5002,'Opção 1 do menu principal selecionada por <login_name>.'),(5003,'Opção 2 do menu principal selecionada por <login_name>.'),(5004,'Opção 3 do menu principal selecionada por <login_name>.'),(5005,'Opção 4 do menu principal selecionada por <login_name>.'),(6001,'Tela de cadastro apresentada para <login_name>.'),(6002,'Botão cadastrar pressionado por <login_name>.'),(6003,'Botão voltar de cadastrar para o menu principal pressionado por <login_name>.'),(7001,'Tela de alteração apresentada para <login_name>.'),(7002,'Botão alterar pressionado por <login_name>.'),(7003,'Botão voltar de alterar para o menu principal pressionado por <login_name>.'),(8001,'Tela de consulta apresentada para <login_name>.'),(8002,'Botão voltar de consultar para o menu principal pressionado por <login_name>.'),(8003,'Arquivo <arq_name> selecionado por <login_name> para decriptação,'),(8004,'Arquivo <arq_name> decriptado com sucesso para <login_name>.'),(8005,'Arquivo <arq_name> verificado com sucesso para <login_name>.'),(8006,'Falha na decriptação do arquivo <arq_name> para <login_name>.'),(8007,'Falha na verificação do arquivo <arq_name> para <login_name>.'),(9001,'Tela de saída apresentada para <login_name>.'),(9002,'Botão sair pressionado por <login_name>.'),(9003,'Botão voltar de sair para o menu principal pressionado por <login_name>.'),(9005,'Arquivo decriptado <nome_arquivo> não pôde ser apagado para <login_name>.');
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
  `dado` varchar(255) DEFAULT NULL,
  `dataRegistro` datetime DEFAULT NULL,
  `idMensagem` int(11) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1,NULL,NULL,'2014-04-16 16:34:46',1001,0,NULL),(2,NULL,NULL,'2014-04-16 16:34:47',2001,0,NULL),(3,NULL,'mica','2014-04-16 16:34:56',2005,0,'mica'),(4,NULL,'mica','2014-04-16 16:36:14',2005,0,'mica'),(5,NULL,NULL,'2014-04-16 16:38:10',1001,0,NULL),(6,NULL,NULL,'2014-04-16 16:38:11',2001,0,NULL),(7,NULL,'mica','2014-04-16 16:38:16',2003,1,NULL),(8,NULL,'mica','2014-04-16 16:38:16',2002,1,NULL),(9,NULL,'mica','2014-04-16 16:38:17',3001,1,NULL),(10,NULL,'mica','2014-04-16 16:39:05',3004,1,NULL),(11,NULL,'mica','2014-04-16 16:39:06',3001,1,NULL),(12,NULL,'mica','2014-04-16 16:39:28',3004,1,NULL),(13,NULL,'mica','2014-04-16 16:39:29',3001,1,NULL),(14,NULL,NULL,'2014-04-16 16:42:51',1001,0,NULL),(15,NULL,NULL,'2014-04-16 16:42:52',2001,0,NULL),(16,NULL,'mica','2014-04-16 16:42:59',2003,1,NULL),(17,NULL,'mica','2014-04-16 16:42:59',2002,1,NULL),(18,NULL,'mica','2014-04-16 16:42:59',3001,1,NULL),(19,NULL,'mica','2014-04-16 16:43:11',3004,1,NULL),(20,NULL,'mica','2014-04-16 16:43:13',3001,1,NULL),(21,NULL,NULL,'2014-04-16 16:45:18',1001,0,NULL),(22,NULL,NULL,'2014-04-16 16:45:18',2001,0,NULL),(23,NULL,'mica','2014-04-16 16:45:31',2003,1,NULL),(24,NULL,'mica','2014-04-16 16:45:31',2002,1,NULL),(25,NULL,'mica','2014-04-16 16:45:31',3001,1,NULL),(26,NULL,'mica','2014-04-16 16:45:43',3004,1,NULL),(27,NULL,'mica','2014-04-16 16:45:46',3001,1,NULL),(28,NULL,NULL,'2014-04-16 17:00:26',1001,0,NULL),(29,NULL,NULL,'2014-04-16 17:00:27',2001,0,NULL),(30,NULL,'mica','2014-04-16 17:00:35',2003,1,NULL),(31,NULL,'mica','2014-04-16 17:00:35',2002,1,NULL),(32,NULL,'mica','2014-04-16 17:00:35',3001,1,NULL),(33,NULL,'mica','2014-04-16 17:00:45',3004,1,NULL),(34,NULL,'mica','2014-04-16 17:00:47',3001,1,NULL),(35,NULL,NULL,'2014-04-16 17:04:56',1001,0,NULL),(36,NULL,NULL,'2014-04-16 17:04:56',2001,0,NULL),(37,NULL,NULL,'2014-04-16 17:06:04',1001,0,NULL),(38,NULL,NULL,'2014-04-16 17:06:04',2001,0,NULL),(39,NULL,NULL,'2014-04-16 17:06:17',1001,0,NULL),(40,NULL,NULL,'2014-04-16 17:06:17',2001,0,NULL),(41,NULL,NULL,'2014-04-16 17:06:48',1001,0,NULL),(42,NULL,NULL,'2014-04-16 17:06:48',2001,0,NULL),(43,NULL,'mica','2014-04-16 17:06:58',2003,1,NULL),(44,NULL,'mica','2014-04-16 17:06:58',2002,1,NULL),(45,NULL,'mica','2014-04-16 17:06:58',3001,1,NULL),(46,NULL,'mica','2014-04-16 17:07:17',3004,1,NULL),(47,NULL,'mica','2014-04-16 17:07:32',3001,1,NULL),(48,NULL,'mica','2014-04-16 17:07:49',3003,1,NULL),(49,NULL,'mica','2014-04-16 17:07:49',3002,1,NULL),(50,NULL,'mica','2014-04-16 17:07:49',4001,1,NULL),(51,NULL,'mica','2014-04-16 17:08:31',4001,1,NULL),(52,NULL,'mica','2014-04-16 17:08:47',4001,1,NULL),(53,NULL,NULL,'2014-04-16 17:14:21',1001,0,NULL),(54,NULL,NULL,'2014-04-16 17:14:22',2001,0,NULL),(55,NULL,'mica','2014-04-16 17:14:32',2003,1,NULL),(56,NULL,'mica','2014-04-16 17:14:32',2002,1,NULL),(57,NULL,'mica','2014-04-16 17:14:32',3001,1,NULL),(58,NULL,'mica','2014-04-16 17:14:42',3003,1,NULL),(59,NULL,'mica','2014-04-16 17:14:42',3002,1,NULL),(60,NULL,'mica','2014-04-16 17:14:42',4001,1,NULL),(61,NULL,NULL,'2014-04-16 17:15:33',1001,0,NULL),(62,NULL,NULL,'2014-04-16 17:15:33',2001,0,NULL),(63,NULL,'mica','2014-04-16 17:15:41',2003,1,NULL),(64,NULL,'mica','2014-04-16 17:15:41',2002,1,NULL),(65,NULL,'mica','2014-04-16 17:15:41',3001,1,NULL),(66,NULL,'mica','2014-04-16 17:15:59',3003,1,NULL),(67,NULL,'mica','2014-04-16 17:15:59',3002,1,NULL),(68,NULL,'mica','2014-04-16 17:15:59',4001,1,NULL),(69,NULL,NULL,'2014-04-16 17:19:03',1001,0,NULL),(70,NULL,NULL,'2014-04-16 17:19:04',2001,0,NULL),(71,NULL,'mica','2014-04-16 17:19:11',2003,1,NULL),(72,NULL,'mica','2014-04-16 17:19:11',2002,1,NULL),(73,NULL,'mica','2014-04-16 17:19:11',3001,1,NULL),(74,NULL,'mica','2014-04-16 17:19:31',3003,1,NULL),(75,NULL,'mica','2014-04-16 17:19:31',3002,1,NULL),(76,NULL,'mica','2014-04-16 17:19:31',4001,1,NULL),(77,NULL,'mica','2014-04-16 17:20:29',4001,1,NULL);
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
  `chavePublica` varchar(255) DEFAULT NULL,
  `confirmacaoSenha` varchar(255) DEFAULT NULL,
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
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,0,NULL,'com.sun.crypto.provider.DESKey@fffe7e9b',NULL,NULL,'minha senha eh 126414','banana não tem caroço','ADMIN','mica','Michelle Rodrigues',821855936,'A9395DF8DC97FA95991FAF212A6EE9004A909717A40FAFB35C261270BA83A5C1C17AE23C6E839FB9DEE00A1DF26149A29D54E3C10FCFFBEB17C9CC298C85EF81',0,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'seguranca'
--

--
-- Dumping routines for database 'seguranca'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-16 17:25:28
