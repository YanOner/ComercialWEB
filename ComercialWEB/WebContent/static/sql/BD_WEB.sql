CREATE DATABASE  IF NOT EXISTS `ginobigionibd` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ginobigionibd`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ginobigionibd
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `IdCliente` int(11) NOT NULL,
  `Nombres` varchar(100) DEFAULT NULL,
  `ApellidoPaterno` varchar(100) DEFAULT NULL,
  `ApellidoMaterno` varchar(100) DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  `NroDocumentoIdentidad` varchar(15) DEFAULT NULL,
  `RUC` varchar(11) DEFAULT NULL,
  `Celular` varchar(11) DEFAULT NULL,
  `FechaCreacion` date DEFAULT NULL,
  PRIMARY KEY (`IdCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Julia ','Gallego','Perez',NULL,'1','45213658',NULL,'945365882',NULL),(2,'Maria','Calara','Ruiz',NULL,'1','63582147',NULL,'957842567',NULL),(3,'Carmen','Zarate','Melez',NULL,'1','05487521',NULL,NULL,NULL),(4,'Luisa','Suarez','Alima',NULL,'1','45219853',NULL,'958421054',NULL),(5,'Marizta','Portorcarrero','Chavez',NULL,'1','04658910',NULL,'975124857',NULL),(6,'Flor de Maria','Rosales','Espinoza',NULL,'1','45963281',NULL,'948855217',NULL),(7,'Carmen','Florencia','Otiliano',NULL,'1','04217453',NULL,'963025841',NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colorproducto`
--

DROP TABLE IF EXISTS `colorproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colorproducto` (
  `IdColorProducto` int(11) NOT NULL,
  `Color` varchar(100) DEFAULT NULL,
  `IdEstado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdColorProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colorproducto`
--

LOCK TABLES `colorproducto` WRITE;
/*!40000 ALTER TABLE `colorproducto` DISABLE KEYS */;
INSERT INTO `colorproducto` VALUES (1,'Blanco','1'),(2,'Rosado','1'),(3,'Azul','1'),(4,'Negro','1'),(5,'Amarillo','1'),(6,'Verde','1'),(7,'Marrón','1'),(8,'Coral','1'),(9,'Violeta','1');
/*!40000 ALTER TABLE `colorproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `componente`
--

DROP TABLE IF EXISTS `componente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `componente` (
  `IdComponente` int(11) NOT NULL,
  `DescComponente` varchar(100) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdComponente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `componente`
--

LOCK TABLES `componente` WRITE;
/*!40000 ALTER TABLE `componente` DISABLE KEYS */;
INSERT INTO `componente` VALUES (1,'Capellada','1'),(2,'Forro','1'),(3,'Plantilla','1'),(4,'Suela','1'),(5,'Taco','1');
/*!40000 ALTER TABLE `componente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `costoubigeo`
--

DROP TABLE IF EXISTS `costoubigeo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `costoubigeo` (
  `CodUbigeoCosto` char(9) NOT NULL,
  `Descripion` varchar(100) DEFAULT NULL,
  `CostoEnvio` decimal(15,2) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`CodUbigeoCosto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `costoubigeo`
--

LOCK TABLES `costoubigeo` WRITE;
/*!40000 ALTER TABLE `costoubigeo` DISABLE KEYS */;
INSERT INTO `costoubigeo` VALUES ('010101',NULL,NULL,NULL);
/*!40000 ALTER TABLE `costoubigeo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courrier`
--

DROP TABLE IF EXISTS `courrier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courrier` (
  `idCourrier` int(11) NOT NULL,
  `Descripion` varchar(50) DEFAULT NULL,
  `Direccion` varchar(250) DEFAULT NULL,
  `Observacion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idCourrier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courrier`
--

LOCK TABLES `courrier` WRITE;
/*!40000 ALTER TABLE `courrier` DISABLE KEYS */;
INSERT INTO `courrier` VALUES (1,'Olva Courrier','Av. Paseo de la Republica 8045 - Cercado Lima',''),(2,'Cruz del Norte','Av. 28 de Julio 752 - La Victoria',NULL),(3,'Soyuz','Av. 28 de Julio 978 - La Victoria',NULL),(4,'Movil Tours','Av. Paseo de la Republica 7099 - Cercado de Lima',NULL);
/*!40000 ALTER TABLE `courrier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cupondescuento`
--

DROP TABLE IF EXISTS `cupondescuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cupondescuento` (
  `IdCuponDescuento` int(11) NOT NULL,
  `CodigoCupon` char(8) DEFAULT NULL,
  `FechaValInicio` date DEFAULT NULL,
  `FechaValFin` date DEFAULT NULL,
  `PorcDescuento` decimal(5,2) DEFAULT NULL,
  `MontoDescuento` decimal(15,2) DEFAULT NULL,
  `Observacion` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`IdCuponDescuento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cupondescuento`
--

LOCK TABLES `cupondescuento` WRITE;
/*!40000 ALTER TABLE `cupondescuento` DISABLE KEYS */;
INSERT INTO `cupondescuento` VALUES (1,'15DCTO',NULL,NULL,15.00,0.00,'Dia de la Madre'),(2,'10DAD',NULL,NULL,10.00,0.00,'Dia del Padre'),(3,'80AKF',NULL,NULL,0.00,80.00,'Descuento Promocional'),(4,'050PRI',NULL,NULL,0.00,50.00,'Primavera Descuento');
/*!40000 ALTER TABLE `cupondescuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleventa`
--

DROP TABLE IF EXISTS `detalleventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalleventa` (
  `IdVenta` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `IdColorProducto` int(11) NOT NULL,
  `NroTalla` int(11) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `PrecioUnitario` decimal(15,2) DEFAULT NULL,
  `SubTotal` decimal(15,2) DEFAULT NULL,
  `Total` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`IdVenta`,`IdProducto`,`IdColorProducto`,`NroTalla`),
  KEY `fk_DetalleVenta_ProductoTallaColor1` (`IdProducto`,`IdColorProducto`,`NroTalla`),
  CONSTRAINT `fk_DetalleVenta_ProductoTallaColor1` FOREIGN KEY (`IdProducto`, `IdColorProducto`, `NroTalla`) REFERENCES `productotallacolor` (`IdProducto`, `IdColorProducto`, `NroTalla`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_has_ProductoTallaColor_Venta1` FOREIGN KEY (`IdVenta`) REFERENCES `venta` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleventa`
--

LOCK TABLES `detalleventa` WRITE;
/*!40000 ALTER TABLE `detalleventa` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalleventa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `IdDireccion` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `Descripcion` varchar(250) DEFAULT NULL,
  `Referencia` varchar(500) DEFAULT NULL,
  `Telefono` varchar(10) DEFAULT NULL,
  `Distrito` varchar(50) DEFAULT NULL,
  `Provincia` varchar(50) DEFAULT NULL,
  `Departamento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdDireccion`,`IdCliente`),
  KEY `fk_Direccion_Cliente1` (`IdCliente`),
  CONSTRAINT `fk_Direccion_Cliente1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,1,'Av. Los Halcones 452','Altura Cuadra 4 Separadora Industrial',NULL,'Molina','Lima','Lima'),(1,2,'Jr. Ucayali 185','Paralela a la cuadra 4 de Miroquesada ','4852655','Cercado de Lima','Lima','Lima'),(1,3,'Av. La Marina 1940','a 2 Cuadras de plaza San Miguel','2458754','San Miguel','Lima','Lima'),(1,4,'Av. Proceres 958','Altura Centro de Salud Proceres de ESSALUD','3562478','Surco','Lima','Lima'),(1,5,'Av. Pizarro 247',NULL,'3254816','Rimac','Lima','Lima'),(2,1,'Av. Los Lirios 854','Frente a Plaza Vea de La Molina','4525632','Molina','Lima','Lima');
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disponibilidadmovilidad`
--

DROP TABLE IF EXISTS `disponibilidadmovilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disponibilidadmovilidad` (
  `IdMovilidad` int(11) NOT NULL,
  `IdOrdenDespacho` int(11) NOT NULL,
  `FechaMovilidad` date DEFAULT NULL,
  `AltoDisponible` decimal(5,2) DEFAULT NULL,
  `AnchoDisponible` decimal(5,2) DEFAULT NULL,
  `LargoDisponible` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`IdMovilidad`,`IdOrdenDespacho`),
  KEY `fk_OrdenDespacho_has_Movilidad_OrdenDespacho1` (`IdOrdenDespacho`),
  CONSTRAINT `fk_OrdenDespacho_has_Movilidad_Movilidad1` FOREIGN KEY (`IdMovilidad`) REFERENCES `movilidad` (`IdMovilidad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_OrdenDespacho_has_Movilidad_OrdenDespacho1` FOREIGN KEY (`IdOrdenDespacho`) REFERENCES `ordendespacho` (`IdOrdenDespacho`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disponibilidadmovilidad`
--

LOCK TABLES `disponibilidadmovilidad` WRITE;
/*!40000 ALTER TABLE `disponibilidadmovilidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `disponibilidadmovilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documentopago`
--

DROP TABLE IF EXISTS `documentopago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documentopago` (
  `NroSerie` char(5) NOT NULL,
  `CodDocumento` char(8) NOT NULL,
  `NroRuc` char(11) DEFAULT NULL,
  `TipoDocumento` char(1) DEFAULT NULL,
  `FechaPago` date DEFAULT NULL,
  `UsuarioGenero` char(15) DEFAULT NULL,
  `FehaGeneracion` date DEFAULT NULL,
  `UsuarioModifico` char(15) DEFAULT NULL,
  `FechaModificacion` date DEFAULT NULL,
  `Venta_idVenta` int(11) NOT NULL,
  PRIMARY KEY (`NroSerie`,`CodDocumento`),
  KEY `fk_DocumentoPago_Venta1` (`Venta_idVenta`),
  CONSTRAINT `fk_DocumentoPago_Venta1` FOREIGN KEY (`Venta_idVenta`) REFERENCES `venta` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documentopago`
--

LOCK TABLES `documentopago` WRITE;
/*!40000 ALTER TABLE `documentopago` DISABLE KEYS */;
/*!40000 ALTER TABLE `documentopago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fomapago`
--

DROP TABLE IF EXISTS `fomapago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fomapago` (
  `IdFomaPago` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdFomaPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fomapago`
--

LOCK TABLES `fomapago` WRITE;
/*!40000 ALTER TABLE `fomapago` DISABLE KEYS */;
INSERT INTO `fomapago` VALUES (1,'Contado','1'),(2,'Consignacion','1'),(3,'Tarjeta','1');
/*!40000 ALTER TABLE `fomapago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material` (
  `IdMaterial` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,'Cuero','1'),(2,'Sintético','1'),(3,'Textil','1'),(4,'Caucho','1'),(5,'Plástico','1'),(6,'Madera','1');
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movilidad`
--

DROP TABLE IF EXISTS `movilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movilidad` (
  `IdMovilidad` int(11) NOT NULL,
  `Placa` varchar(10) DEFAULT NULL,
  `Marca` varchar(50) DEFAULT NULL,
  `Modelo` varchar(50) DEFAULT NULL,
  `CapacidadAlto` decimal(15,2) DEFAULT NULL,
  `CapacidadLargo` decimal(15,2) DEFAULT NULL,
  `CapacidadAncho` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`IdMovilidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movilidad`
--

LOCK TABLES `movilidad` WRITE;
/*!40000 ALTER TABLE `movilidad` DISABLE KEYS */;
INSERT INTO `movilidad` VALUES (1,'ACE-451','Hyundai','Tucson',180.00,120.00,140.00),(2,'RSW-920','Nissan','Qashqai',190.00,110.00,150.00);
/*!40000 ALTER TABLE `movilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordenconsignacion`
--

DROP TABLE IF EXISTS `ordenconsignacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordenconsignacion` (
  `IdOrdenConsignacion` int(11) NOT NULL,
  `FechaProgramada` date NOT NULL,
  `IdVenta` int(11) NOT NULL,
  `NroCuota` int(11) DEFAULT NULL,
  `MontoCuota` decimal(15,2) DEFAULT NULL,
  `Mora` decimal(15,2) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdOrdenConsignacion`,`FechaProgramada`),
  KEY `fk_OrdenConsignacion_Venta1` (`IdVenta`),
  CONSTRAINT `fk_OrdenConsignacion_Venta1` FOREIGN KEY (`IdVenta`) REFERENCES `venta` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='							';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordenconsignacion`
--

LOCK TABLES `ordenconsignacion` WRITE;
/*!40000 ALTER TABLE `ordenconsignacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordenconsignacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordendespacho`
--

DROP TABLE IF EXISTS `ordendespacho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordendespacho` (
  `IdOrdenDespacho` int(11) NOT NULL,
  `FechaMovilidad` date DEFAULT NULL,
  `UsuarioAtendio` char(15) DEFAULT NULL,
  `FechaAtencion` date DEFAULT NULL,
  `FechaProgramada` date DEFAULT NULL,
  `FechaEntrega` date DEFAULT NULL,
  `IdVenta` int(11) NOT NULL,
  `IidCourrier` int(11) NOT NULL,
  PRIMARY KEY (`IdOrdenDespacho`),
  KEY `fk_OrdenDespacho_Venta1` (`IdVenta`),
  KEY `fk_OrdenDespacho_Courrier1` (`IidCourrier`),
  CONSTRAINT `fk_OrdenDespacho_Courrier1` FOREIGN KEY (`IidCourrier`) REFERENCES `courrier` (`idCourrier`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_OrdenDespacho_Venta1` FOREIGN KEY (`IdVenta`) REFERENCES `venta` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordendespacho`
--

LOCK TABLES `ordendespacho` WRITE;
/*!40000 ALTER TABLE `ordendespacho` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordendespacho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagosordenconsignacion`
--

DROP TABLE IF EXISTS `pagosordenconsignacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagosordenconsignacion` (
  `IdOrdenConsignacion` int(11) NOT NULL,
  `FechaProgramada` date NOT NULL,
  `Correlativo` int(11) NOT NULL,
  `MontoAbonado` decimal(15,2) DEFAULT NULL,
  `FechaPago` date DEFAULT NULL,
  `NroBoletaPago` char(15) DEFAULT NULL,
  PRIMARY KEY (`IdOrdenConsignacion`,`FechaProgramada`,`Correlativo`),
  CONSTRAINT `fk_PagosOrdenConsignacion_OrdenConsignacion1` FOREIGN KEY (`IdOrdenConsignacion`, `FechaProgramada`) REFERENCES `ordenconsignacion` (`IdOrdenConsignacion`, `FechaProgramada`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagosordenconsignacion`
--

LOCK TABLES `pagosordenconsignacion` WRITE;
/*!40000 ALTER TABLE `pagosordenconsignacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagosordenconsignacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partesproducto`
--

DROP TABLE IF EXISTS `partesproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partesproducto` (
  `IdComponente` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `IdMaterial` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`IdComponente`,`IdProducto`),
  KEY `fk_Componente_has_Producto_Producto1` (`IdProducto`),
  KEY `fk_PartesProducto_Material1` (`IdMaterial`),
  CONSTRAINT `fk_Componente_has_Producto_Componente1` FOREIGN KEY (`IdComponente`) REFERENCES `componente` (`IdComponente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Componente_has_Producto_Producto1` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_PartesProducto_Material1` FOREIGN KEY (`IdMaterial`) REFERENCES `material` (`IdMaterial`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partesproducto`
--

LOCK TABLES `partesproducto` WRITE;
/*!40000 ALTER TABLE `partesproducto` DISABLE KEYS */;
INSERT INTO `partesproducto` VALUES (1,1,3,NULL),(1,2,1,NULL),(1,3,1,NULL),(1,4,3,NULL),(1,5,1,NULL),(1,6,2,NULL),(1,7,1,NULL),(1,8,3,NULL),(1,9,1,NULL),(1,10,2,NULL),(1,11,1,NULL),(1,12,3,NULL),(1,13,1,NULL),(1,14,2,NULL),(1,15,2,NULL),(2,1,2,NULL),(2,2,2,NULL),(2,3,1,NULL),(2,4,3,NULL),(2,5,1,NULL),(2,6,2,NULL),(2,7,1,NULL),(2,8,3,NULL),(2,9,1,NULL),(2,10,2,NULL),(2,11,1,NULL),(2,12,3,NULL),(2,13,1,NULL),(2,14,2,NULL),(2,15,3,NULL),(3,1,3,NULL),(3,2,4,NULL),(3,3,3,NULL),(3,4,2,NULL),(3,5,1,NULL),(3,6,3,NULL),(3,7,3,NULL),(3,8,2,NULL),(3,9,1,NULL),(3,10,3,NULL),(3,11,3,NULL),(3,12,2,NULL),(3,13,1,NULL),(3,14,3,NULL),(3,15,2,NULL),(4,1,4,NULL),(4,2,2,NULL),(4,3,2,NULL),(4,4,2,NULL),(4,5,2,NULL),(4,6,6,NULL),(4,7,2,NULL),(4,8,2,NULL),(4,9,2,NULL),(4,10,6,NULL),(4,11,2,NULL),(4,12,2,NULL),(4,13,2,NULL),(4,14,6,NULL),(4,15,4,NULL),(5,1,6,NULL),(5,2,4,NULL),(5,3,4,NULL),(5,4,4,NULL),(5,5,2,NULL),(5,6,6,NULL),(5,7,4,NULL),(5,8,4,NULL),(5,9,2,NULL),(5,10,6,NULL),(5,11,4,NULL),(5,12,4,NULL),(5,13,2,NULL),(5,14,6,NULL),(5,15,4,NULL);
/*!40000 ALTER TABLE `partesproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `IdProducto` int(11) NOT NULL,
  `SKU` varchar(20) NOT NULL,
  `Descripcion` varchar(150) DEFAULT NULL,
  `IdTipoProducto` int(11) DEFAULT NULL,
  `Genero` char(1) DEFAULT NULL,
  `PrecioUnitario` decimal(15,2) DEFAULT NULL,
  `PrecioVendedor` decimal(15,2) DEFAULT NULL,
  `Estilo` varchar(50) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  `StockVenta` int(11) DEFAULT NULL,
  `StockObservado` int(11) DEFAULT NULL,
  `StockCritico` int(11) DEFAULT NULL,
  `FechaUltimaCarga` date DEFAULT NULL,
  `FechaProximaCarga` date DEFAULT NULL,
  `UsuarioGenero` char(15) DEFAULT NULL,
  `FechaGeneracion` date DEFAULT NULL,
  `UsuarioModifico` char(15) DEFAULT NULL,
  `FechaModificacion` date DEFAULT NULL,
  `AltoPaquete` decimal(5,2) DEFAULT NULL,
  `AnchoPaquete` decimal(5,2) DEFAULT NULL,
  `LargoPaquete` decimal(5,2) DEFAULT NULL,
  `Observacion` varchar(500) DEFAULT NULL,
  `IdTemporada` int(11) NOT NULL,
  `IdUMD` int(11) NOT NULL,
  `Peso` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`IdProducto`),
  KEY `fk_Producto_Temporada` (`IdTemporada`),
  KEY `fk_Producto_UnidadMedidaDimension1` (`IdUMD`),
  KEY `fk_Producto_TipoProducto1` (`IdTipoProducto`),
  CONSTRAINT `fk_Producto_Temporada` FOREIGN KEY (`IdTemporada`) REFERENCES `temporada` (`IdTemporada`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_TipoProducto1` FOREIGN KEY (`IdTipoProducto`) REFERENCES `tipoproducto` (`idTipoProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_UnidadMedidaDimension1` FOREIGN KEY (`IdUMD`) REFERENCES `unidadmedidadimension` (`IdUMD`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'ACM19421','Zapato Cuero AS450',1,'F',139.90,NULL,'Americano','1',98,0,25,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.95),(2,'ACM95621','Zapato WS632',1,'F',85.70,NULL,'Americano','1',152,0,32,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80),(3,'OMD96551','Sandalias TR452',4,'F',146.20,NULL,'Americano','1',150,0,30,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.88),(4,'XAER85115','Zapato BS-456',1,'F',95.00,NULL,'Americano','1',180,0,45,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.92),(5,'OLF2558','SP 9554',3,'F',85.50,NULL,'Americano','1',151,0,32,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80),(6,'KFM4751','SX 9510',3,'F',75.00,NULL,'Americano','1',160,0,25,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.95),(7,'ERA9654','Zapato',1,'F',99.70,NULL,'Americano','1',210,0,56,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80),(8,'TDW8542','Sandalias TX 889',4,'F',93.00,NULL,'Americano','1',150,0,30,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.88),(9,'RFW3251','GR 1277',5,'F',85.00,NULL,'Americano','1',180,0,45,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.92),(10,'RTQ3578','SPX 2845',5,'F',74.00,NULL,'Americano','1',85,0,15,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80),(11,'OKJ6752','Balerina XE 156',3,'F',139.90,NULL,'Americano','1',98,0,25,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.95),(12,'OPE7155','Botas SW 965',2,'F',154.00,NULL,'Americano','1',95,0,32,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80),(13,'OMD96551','Sandalias FD 741',4,'F',185.00,NULL,'Americano','1',150,0,30,NULL,NULL,'Admin',NULL,NULL,NULL,35.00,45.00,30.00,NULL,1,1,0.88),(14,'XAER85115','Botas AX781',2,'F',96.00,NULL,'Americano','1',175,0,40,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.92),(15,'OLF2558','Botas KE651',2,'F',140.00,NULL,'Americano','1',180,0,28,NULL,NULL,'Admin',NULL,NULL,NULL,30.00,44.00,28.00,NULL,1,1,0.80);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productotallacolor`
--

DROP TABLE IF EXISTS `productotallacolor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productotallacolor` (
  `IdProducto` int(11) NOT NULL,
  `IdColorProducto` int(11) NOT NULL,
  `NroTalla` int(11) NOT NULL,
  `StockVenta` int(11) DEFAULT NULL,
  `StockCritico` int(11) DEFAULT NULL,
  `StockObservado` int(11) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdProducto`,`IdColorProducto`,`NroTalla`),
  KEY `fk_ColorProducto_has_Talla_ColorProducto1` (`IdColorProducto`),
  KEY `fk_ColorProducto_has_Talla_Talla1` (`NroTalla`),
  CONSTRAINT `fk_ColorProducto_has_Talla_ColorProducto1` FOREIGN KEY (`IdColorProducto`) REFERENCES `colorproducto` (`IdColorProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ColorProducto_has_Talla_Producto1` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ColorProducto_has_Talla_Talla1` FOREIGN KEY (`NroTalla`) REFERENCES `talla` (`NroTalla`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productotallacolor`
--

LOCK TABLES `productotallacolor` WRITE;
/*!40000 ALTER TABLE `productotallacolor` DISABLE KEYS */;
INSERT INTO `productotallacolor` VALUES (1,1,38,10,4,0,'1'),(1,1,39,12,3,0,'1'),(1,1,40,11,3,0,'1'),(1,1,41,14,5,0,'1'),(1,2,38,11,4,0,'1'),(1,2,39,12,3,0,'1'),(1,2,40,11,3,0,'1'),(1,2,41,14,5,0,'1'),(1,2,42,10,4,0,'1'),(1,3,38,18,5,0,'1'),(1,3,39,0,4,0,'1'),(1,3,40,0,4,0,'1'),(1,3,41,10,4,0,'1'),(1,3,42,15,5,0,'1'),(1,4,38,18,5,0,'1'),(1,4,39,0,4,0,'1'),(1,4,40,0,4,0,'1'),(1,4,41,10,4,0,'1'),(1,4,42,15,5,0,'1'),(1,5,38,18,5,0,'1'),(1,5,39,0,4,0,'1'),(1,5,40,0,4,0,'1'),(1,5,41,0,4,0,'1'),(1,5,42,15,5,0,'1'),(2,2,42,10,4,0,'1'),(2,3,38,18,5,0,'1'),(2,3,39,0,4,0,'1'),(2,3,40,0,4,0,'1'),(2,3,41,10,4,0,'1'),(2,3,42,15,5,0,'1'),(2,4,38,18,5,0,'1'),(2,4,39,30,4,0,'1'),(2,4,40,32,4,0,'1'),(2,4,41,19,4,0,'1'),(2,4,42,27,5,0,'1'),(2,5,38,18,5,0,'1'),(2,5,39,0,4,0,'1'),(2,5,40,0,4,0,'1'),(2,5,41,0,4,0,'1'),(2,5,42,15,5,0,'1'),(3,1,38,18,5,0,'1'),(3,1,39,0,4,0,'1'),(3,1,40,0,4,0,'1'),(3,1,41,10,4,0,'1'),(3,1,42,15,5,0,'1'),(3,2,38,18,5,0,'1'),(3,2,39,0,4,0,'1'),(3,2,40,0,4,0,'1'),(3,2,41,10,4,0,'1'),(3,2,42,15,5,0,'1'),(3,3,38,0,5,0,'1'),(3,3,39,0,4,0,'1'),(3,3,40,0,4,0,'1'),(3,3,41,10,4,0,'1'),(3,3,42,15,5,0,'1'),(4,1,38,18,5,0,'1'),(4,1,39,0,4,0,'1'),(4,1,40,0,4,0,'1'),(4,1,41,10,4,0,'1'),(4,1,42,15,5,0,'1'),(4,4,38,18,5,0,'1'),(4,4,39,0,4,0,'1'),(4,4,40,0,4,0,'1'),(4,4,41,10,4,0,'1'),(4,4,42,15,5,0,'1'),(4,7,38,0,5,0,'1'),(4,7,39,0,4,0,'1'),(4,7,40,0,4,0,'1'),(4,7,41,10,4,0,'1'),(4,7,42,15,5,0,'1'),(5,1,38,18,5,0,'1'),(5,1,39,0,4,0,'1'),(5,1,40,0,4,0,'1'),(5,1,41,10,4,0,'1'),(5,1,42,15,5,0,'1'),(5,6,38,18,5,0,'1'),(5,6,39,0,4,0,'1'),(5,6,40,0,4,0,'1'),(5,6,41,0,4,0,'1'),(5,6,42,15,5,0,'1'),(5,8,38,18,5,0,'1'),(5,8,39,0,4,0,'1'),(5,8,40,0,4,0,'1'),(5,8,41,10,4,0,'1'),(5,8,42,15,5,0,'1'),(7,3,38,18,5,0,'1'),(7,3,39,32,4,0,'1'),(7,3,40,19,4,0,'1'),(7,3,41,0,4,0,'1'),(7,3,42,15,5,0,'1'),(7,4,42,10,4,0,'1'),(7,5,38,18,5,0,'1'),(7,5,39,0,4,0,'1'),(7,5,40,0,4,0,'1'),(7,5,41,10,4,0,'1'),(7,5,42,15,5,0,'1'),(7,9,38,18,5,0,'1'),(7,9,39,30,4,0,'1'),(7,9,40,32,4,0,'1'),(7,9,41,19,4,0,'1'),(7,9,42,27,5,0,'1'),(8,6,38,18,5,0,'1'),(8,6,39,0,4,0,'1'),(8,6,40,0,4,0,'1'),(8,6,41,10,4,0,'1'),(8,6,42,15,5,0,'1'),(8,7,38,18,5,0,'1'),(8,7,39,0,4,0,'1'),(8,7,40,0,4,0,'1'),(8,7,41,10,4,0,'1'),(8,7,42,15,5,0,'1'),(8,9,38,0,5,0,'1'),(8,9,39,0,4,0,'1'),(8,9,40,0,4,0,'1'),(8,9,41,10,4,0,'1'),(8,9,42,15,5,0,'1');
/*!40000 ALTER TABLE `productotallacolor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudrevendedor`
--

DROP TABLE IF EXISTS `solicitudrevendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudrevendedor` (
  `IdSolicitud` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `CodUsuario` char(15) NOT NULL,
  `FechaSolicitud` date DEFAULT NULL,
  `Comentario` varchar(250) DEFAULT NULL,
  `MontoCompraPromedio` decimal(15,2) DEFAULT NULL,
  `UsuarioGeneroSolicitud` char(15) DEFAULT NULL,
  `FechaRespuesta` date DEFAULT NULL,
  `UsuarioRespuesta` char(15) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  `LineaCredito` decimal(15,2) DEFAULT NULL,
  `LineaCreditoAnterior` decimal(15,2) DEFAULT '0.00',
  PRIMARY KEY (`IdSolicitud`,`IdCliente`,`CodUsuario`),
  KEY `fk_SolicitudRevendedor_Usuario1` (`CodUsuario`),
  CONSTRAINT `fk_SolicitudRevendedor_Usuario1` FOREIGN KEY (`CodUsuario`) REFERENCES `usuario` (`CodUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudrevendedor`
--

LOCK TABLES `solicitudrevendedor` WRITE;
/*!40000 ALTER TABLE `solicitudrevendedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitudrevendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `talla`
--

DROP TABLE IF EXISTS `talla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `talla` (
  `NroTalla` int(11) NOT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`NroTalla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `talla`
--

LOCK TABLES `talla` WRITE;
/*!40000 ALTER TABLE `talla` DISABLE KEYS */;
INSERT INTO `talla` VALUES (35,'1'),(36,'1'),(37,'1'),(38,'1'),(39,'1'),(40,'1'),(41,'1'),(42,'1'),(43,'1'),(44,'1');
/*!40000 ALTER TABLE `talla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temporada`
--

DROP TABLE IF EXISTS `temporada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temporada` (
  `IdTemporada` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdTemporada`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temporada`
--

LOCK TABLES `temporada` WRITE;
/*!40000 ALTER TABLE `temporada` DISABLE KEYS */;
INSERT INTO `temporada` VALUES (1,'Primavera-Verano','1'),(2,'Verano-Otoño','1'),(3,'Otoño-Invierno','1'),(4,'Invierno-Primavera','1');
/*!40000 ALTER TABLE `temporada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproducto`
--

DROP TABLE IF EXISTS `tipoproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoproducto` (
  `idTipoProducto` int(11) NOT NULL,
  `Descripcion` varchar(150) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`idTipoProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproducto`
--

LOCK TABLES `tipoproducto` WRITE;
/*!40000 ALTER TABLE `tipoproducto` DISABLE KEYS */;
INSERT INTO `tipoproducto` VALUES (1,'Zapatos','1'),(2,'Botas','1'),(3,'Balerinas','1'),(4,'Sandalias','1'),(5,'Botines','1'),(6,'Casual','1');
/*!40000 ALTER TABLE `tipoproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `IdTipoUsuario` int(11) NOT NULL,
  `Descripion` varchar(150) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  PRIMARY KEY (`IdTipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'Cliente','1'),(2,'Revendedor','1'),(3,'Gerente','1'),(4,'Cobranza','1'),(5,'Almacen','1');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadmedidadimension`
--

DROP TABLE IF EXISTS `unidadmedidadimension`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidadmedidadimension` (
  `IdUMD` int(11) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Codigo` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`IdUMD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadmedidadimension`
--

LOCK TABLES `unidadmedidadimension` WRITE;
/*!40000 ALTER TABLE `unidadmedidadimension` DISABLE KEYS */;
INSERT INTO `unidadmedidadimension` VALUES (1,'Centimetro','cm.'),(2,'Pies','Ft.');
/*!40000 ALTER TABLE `unidadmedidadimension` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `CodUsuario` char(15) NOT NULL,
  `IdCliente` int(11) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `FechaCreacion` date DEFAULT NULL,
  `CorreoElectronico` varchar(100) DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  `IdTipoUsuario` int(11) NOT NULL,
  PRIMARY KEY (`CodUsuario`),
  KEY `fk_Usuario_TipoUsuario1` (`IdTipoUsuario`),
  KEY `fk_Usuario_Cliente1` (`IdCliente`),
  CONSTRAINT `fk_Usuario_Cliente1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_TipoUsuario1` FOREIGN KEY (`IdTipoUsuario`) REFERENCES `tipousuario` (`IdTipoUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('Usuario1',1,'123456789',NULL,'prueba1@gmail.com','1',1),('Usuario2',2,'123456789',NULL,'prueba2@gmail.com','1',1),('Usuario3',3,'123456789',NULL,'prueba3@gmail.com','1',1),('Usuario4',4,'123456789',NULL,'prueba4@gmail.com','1',1),('Usuario5',5,'123456789',NULL,'prueba5@gmail.com','1',1),('Usuario6',6,'123456789',NULL,'prueba6@gmail.com','1',2),('Usuario7',7,'123456789',NULL,'prueba7@gmail.com','1',2);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `IdVenta` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `FechaVenta` date DEFAULT NULL,
  `SubTotal` decimal(15,2) DEFAULT NULL,
  `IGV` decimal(15,2) DEFAULT NULL,
  `Descuento` decimal(15,2) DEFAULT NULL,
  `Total` decimal(15,2) DEFAULT NULL,
  `MontoEntrega` decimal(15,2) DEFAULT NULL,
  `TotalVenta` decimal(15,2) DEFAULT NULL,
  `NroCuotas` int(11) DEFAULT NULL,
  `TipoRecojo` char(1) DEFAULT NULL,
  `UsuarioModifico` char(15) DEFAULT NULL,
  `FechaModifico` date DEFAULT NULL,
  `UsuarioAnulo` char(15) DEFAULT NULL,
  `FechaAnulo` date DEFAULT NULL,
  `NumOperaBancaria` char(15) DEFAULT NULL,
  `FechaOperaBancaria` date DEFAULT NULL,
  `CodTrxTarjeta` varchar(15) DEFAULT NULL,
  `FechTrxTarjeta` date DEFAULT NULL,
  `Estado` char(1) DEFAULT NULL,
  `CodUbigeoCosto` char(9) NOT NULL,
  `IdFomaPago` int(11) NOT NULL,
  `IdCuponDescuento` int(11) NOT NULL,
  PRIMARY KEY (`IdVenta`),
  KEY `fk_Venta_CostoUbigeo1` (`CodUbigeoCosto`),
  KEY `fk_Venta_FomaPago1` (`IdFomaPago`),
  KEY `fk_Venta_CuponDescuento1` (`IdCuponDescuento`),
  KEY `fk_Venta_Cliente1` (`IdCliente`),
  CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_CostoUbigeo1` FOREIGN KEY (`CodUbigeoCosto`) REFERENCES `costoubigeo` (`CodUbigeoCosto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_CuponDescuento1` FOREIGN KEY (`IdCuponDescuento`) REFERENCES `cupondescuento` (`IdCuponDescuento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_FomaPago1` FOREIGN KEY (`IdFomaPago`) REFERENCES `fomapago` (`IdFomaPago`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ginobigionibd'
--
/*!50003 DROP PROCEDURE IF EXISTS `SP_DetalleProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_DetalleProducto`(
CodProducto int,
CodColor int,
StrFlag char(1)
)
BEGIN
If StrFlag = '1' then
	Select p.idproducto,p.SKU,p.Descripcion,p.Estilo,c.DescComponente as Componente ,m.descripcion as MAterial from partesproducto pp inner join Producto p 
    on pp.IdProducto = p.IdProducto
    inner join Material m
    on m.IdMaterial = pp.IdMaterial
    inner join componente c
    on pp.IdComponente = c.IdComponente
    where p.IdProducto = CodProducto;

End If;

If StrFlag = '2' then -- Retorna Colores
	Select distinct cp.Color from producto p 
    inner join productotallacolor ptc
    on p.IdProducto = ptc.IdProducto 
    inner join colorproducto cp
    on cp.IdColorProducto = ptc.IdColorProducto
    where p.IdProducto = CodProducto and ptc.StockVenta > 0 and p.estado = '1' ;
End If;

If StrFlag = '3' then -- Retorna talla y stock por colores y producto
	Select ptc.NroTalla, ptc.StockVenta from productotallacolor  ptc
    where ptc.IdProducto = CodProducto and ptc.IdColorProducto = CodColor and ptc.StockVenta > 0 ;
End If;
/*
Call SP_DetalleProducto (1,0,'1') -- 1er Caso Retorna Detalle de Zapatos

Call SP_DetalleProducto (2,0,'2') -- 2do Caso Retorna colores

Call SP_DetalleProducto (2,3,'3') -- 2do Caso Retorna tallas y stock
*/
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `SP_FiltrosVenta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SP_FiltrosVenta`(
DescProducto varchar(100),
DescTipoProd varchar(100),
DEscTalla int, 
DescColor varchar(100),
DescTemporada varchar(100),
PrecioIni double(15,2),
PrecioFin double(15,2)
)
BEGIN

Declare QueryPrincipal varchar(1000) default '';
Declare StrFiltros varchar(800);
Declare FlagFiltro boolean default false;
Declare NroFiltros int default 0;

set DescProducto = upper(DescProducto);
set DescTipoProd = upper(DescTipoProd);
set DescColor = upper(DescColor);
set DescTemporada = upper(DescTemporada);

   set QueryPrincipal= Concat('Select 	p.IdProducto,p.SKU,p.Descripcion, Tp.Descripcion as TipoProducto, ', 
					't.descripcion as Temporada,cp.Color, ',
					'Ta.NroTalla,ptc.StockVenta,p.PrecioUnitario,p.PrecioVendedor ',
            'from producto p inner join tipoproducto Tp ',
            'on tp.IdTipoProducto = p.IdTipoProducto ',
            'inner join Temporada t ',
            'on t.idtemporada = p.IdTemporada ',
            'inner join productotallacolor ptc ',
            'on ptc.IdProducto = p.IdProducto ',
            'inner join colorproducto cp ',
            'on cp.IdColorProducto = ptc.IdColorProducto ',
            'inner join talla Ta ',
            'on Ta.NroTalla = ptc.NroTalla ') ;

if trim(DescProducto) <> '' or trim(DescTipoProd) <> '' or trim(DEscTalla) > 0 or trim(DescColor) <> '' or 
	trim(DescTemporada) <> '' or PrecioIni > 0 or PrecioFin > 0 then
    set QueryPrincipal  = Concat(QueryPrincipal,' where ');
    set FlagFiltro = true;
End IF;    

If FlagFiltro then
-- Filtro Nombre Producto
	 if trim(DescProducto) <> '' then
		set StrFiltros = concat(' upper(p.Descripcion) Like ''%',DescProducto,'%''');
		set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
		set NroFiltros = NroFiltros + 1;
	End IF;

-- Filtro Tipo Producto
	 if trim(DescTipoProd) <> '' then
		If NroFiltros > 0 then
			set QueryPrincipal = concat(QueryPrincipal,' and '); 
        End If; 
		set StrFiltros = concat('upper(Tp.Descripcion) Like ''%',DescTipoProd,'%''');
		set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
		set NroFiltros = NroFiltros + 1;
	End IF;
    
-- Filtro Talla
	 if DEscTalla > 0 then
		If NroFiltros > 0 then
			set QueryPrincipal = concat(QueryPrincipal,' and '); 
        End If; 
		set StrFiltros = concat(' ta.NroTalla = ',DEscTalla);
		set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
		set NroFiltros = NroFiltros + 1;
	End IF;
    
-- Filtro Color
	 if DescColor <> '' then
		If NroFiltros > 0 then
			set QueryPrincipal = concat(QueryPrincipal,' and '); 
        End If; 
		set StrFiltros = concat(' upper(cp.Color) like ''%',DescColor,'%''');
		set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
		set NroFiltros = NroFiltros + 1;
	End IF;
    
-- Filtro Temporada

	 if DescTemporada <> '' then
		If NroFiltros > 0 then
			set QueryPrincipal = concat(QueryPrincipal,' and '); 
        End If; 
		set StrFiltros = concat(' upper(t.descripcion) like ''%',DescTemporada,'%''');
		set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
		set NroFiltros = NroFiltros + 1;
	End IF;

-- Filtro Precios 
	 if PrecioIni > 0 or PrecioFin > 0 then
		If NroFiltros > 0 then
			set QueryPrincipal = concat(QueryPrincipal,' and '); 
        End If; 
        
        If PrecioIni > 0 and PrecioFin > 0 then
        		set StrFiltros = concat(' p.PrecioUnitario >= ',PrecioIni);
                set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
                set StrFiltros = concat(' and p.PrecioUnitario <= ',PrecioFin);
				set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
				set NroFiltros = NroFiltros + 1;
        Else
			If PrecioIni > 0 and PrecioFin = 0 then
                	set StrFiltros = concat(' p.PrecioUnitario >= ',PrecioIni);
					set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
					set NroFiltros = NroFiltros + 1;
			else
                    set StrFiltros = concat(' p.PrecioUnitario <= ',PrecioFin);
					set QueryPrincipal  = Concat(QueryPrincipal,StrFiltros);
					set NroFiltros = NroFiltros + 1;
            End If;
        End If;
        
		         
	End IF;
End If;

   -- select NroFiltros,QueryPrincipal;

		SET @myquery = QueryPrincipal;
			PREPARE stmt2 FROM @myquery;
			EXECUTE stmt2;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-24 18:14:47
update producto
set PrecioVendedor = PrecioUnitario*0.85
where IdProducto>0;